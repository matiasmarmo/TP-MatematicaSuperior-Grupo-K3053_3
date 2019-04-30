/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncom;

import static java.lang.Math.PI;
import static java.lang.Math.atan;
import static java.lang.Math.cos;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 *
 * @author Adriana
 */
public class Numero {
    public double a;
    public double b;
    public boolean tipo; // FALSE --> BINOMICA
                         // TRUE ---> POLAR

    Numero(double a, double b, boolean b0) {
        this.a = a;
        this.b = b;
        this.tipo = b0;
    }
    
    public void aPolar(){
        if(tipo == false){
            double temp1 = sqrt(pow(a,2)+pow(b,2));
            double temp2;
            if(a == 0 && b > 0){
                temp2 = PI/2;
            }else if(a == 0 && b < 0){
                temp2 = 3*PI/2;
            }else if(b == 0){
                temp2 = 0;
            }else if(a>0 && b>0){ //PRIMER CUADRANTE
                temp2 = atan(b/a);
            }else if(a>0 && b<0){ //CUARTO CUADRANTE
                temp2 = atan(b/a) + 2 * PI;
            }else{ 
                temp2 = atan(b/a) + PI;
            }
            a = temp1;
            b = temp2;
            tipo = true;
        }
    }
    public void aBinomica(){
        if(tipo == true){
            double temp1 = a*cos(b);
            double temp2 = a*sin(b);
            a = temp1;
            b = temp2;
            tipo = false;
        }
    }
    public void redondear(){
            a = floor(a*100)/100;
            b = floor(b*100)/100;
    }
    public void transformar(){
        if(tipo == false){
            this.aPolar();
        }
        else{
            this.aBinomica();
        }
    }
}
