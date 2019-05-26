/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncom;

/**
 *
 * @author Adriana
 */
public class parser {
    public String mensaje;
    public boolean tipo_parseo;
    parser(String mensaje,boolean tipo_parseo){
        this.mensaje = mensaje;
        this.tipo_parseo=tipo_parseo;
    }
    public int armarNumero(){
        if(tipo_parseo==false) {
            int i=1;
            int largoMensaje = this.mensaje.length();
            if(mensaje.charAt(0) == '(' && mensaje.charAt(largoMensaje-1) == ')'){ 
                // BINOMICA
                String datos = mensaje.substring(1,largoMensaje-1);
                String complejos[] = datos.split(",");
                String parteReal = complejos[0];
                String parteImaginaria = complejos[1];
                if(!this.verificarNumeros(parteReal)){
                    return 0;
                }
                if(!this.verificarNumeros(parteImaginaria)){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if(mensaje.charAt(0) == '[' && mensaje.charAt(largoMensaje-1) == ']'){
                //POLAR
                String datos = mensaje.substring(1,largoMensaje-1);
                String complejos[] = datos.split(",");
                String parteReal = complejos[0];
                String parteImaginaria = complejos[1];
                if(!this.verificarNumeros(parteReal)){
                    return 0;
                }
                if(!this.verificarNumeros(parteImaginaria)){
                    return 0;
                }
                if(mensaje.charAt(1)=='-'){
                    return 0;
                }
                else{
                    return 2;
                }
            }
            return 0;
        } else {
            int i=1;
            int largoMensaje = this.mensaje.length();
            if(mensaje.charAt(largoMensaje-1) == ')'){ 
                String datos = mensaje.substring(0,largoMensaje-1);
                String ampli[]=datos.split("\\*");
                String amplitud = ampli[0];
                if(!this.verificarNumeros(amplitud)){
                    return 0;
                }
                String form[]=ampli[1].split("\\(");
                String forma = form[0];
                if(this.verificarSinusoide(forma)==0){
                    return 0;
                }
                String frec[]=form[1].split("t");
                String frecuencia = frec[0];
                if(!this.verificarNumeros(frecuencia)){
                    return 0;
                }
                if(frec[1].charAt(0)!='+' && frec[1].charAt(0)!='-'){
                    return 0;
                }
                String desf[]=frec[1].split("\\)");
                String desfasaje = desf[0];
                if(!this.verificarNumeros(desfasaje)){
                    return 0;
                }
                return 1;
            }
            return 0;
       }   
    }
    private boolean verificarNumeros(String numero){
        int i;
        int punto = 0;
        if(this.esLetra(numero.charAt(0))){ return false; }
        for(i=0;i<numero.length();i++){
            if(numero.charAt(i) < '0' && numero.charAt(i) > '9' && numero.charAt(i) != '.' && punto < 2 && numero.charAt(i) != '-'){  
                return false;
            }
            if(numero.charAt(i) == '.'){ punto++; } 
            if(this.esLetra(numero.charAt(i))){ return false; }
        }
        return true;
    }
    private int verificarSinusoide(String sinusoide){
        if(sinusoide.equals("cos") || sinusoide.equals("sen")){
            if(sinusoide.equals("cos")){
                return 1;
            } else{
                return 2;
            } 
        } else { 
            return 0;
        }
    }
    public boolean esNatural(){
        int i;
        for(i=0;i<this.mensaje.length();i++){
            if(mensaje.charAt(i) < '0' ||  mensaje.charAt(i) > '9'){  
                return false;
            } 
        }
        return true;
    }
    public boolean esMasGrandeQueElMaximo(int maximo){
        int i;
        if(Integer.parseInt(mensaje) > maximo){return true;}
        return false;
    }
    public boolean esLetra(char caracter){
        if(caracter > 'a' && caracter < 'z'){ return true; } 
        else if(caracter > 'A' && caracter < 'Z'){ return true; }
        return false;
    }
}