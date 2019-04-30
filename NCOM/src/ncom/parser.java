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
    parser(String mensaje){
        this.mensaje = mensaje;
    }
    public int armarNumero(){
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
    }
    private boolean verificarNumeros(String numero){
        int i;
        int punto = 0;
        for(i=0;i<numero.length();i++){
            if(numero.charAt(i) < '0' && numero.charAt(i) > '9' && numero.charAt(i) != '.' && punto < 2 && numero.charAt(i) != '-'){  
                return false;
            }
            if(numero.charAt(i) == '.'){ punto++; } 
        }
        return true;
    }
    
}
