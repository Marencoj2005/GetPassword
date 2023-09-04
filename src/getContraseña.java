/*QUIERO HACER UN GENERADOR DE CONTRASEÑA EN DONDE DEPENDIENDO DE LA CANTIDAD DE LOS CARÁCTERES
 * ME GENERE UNA CONTRASEÑA CON NÚMEROS Y LETRAS DE FORMA ALEATORI
 * LA VOY A HACER QUE FUNCIONE EN CONSOLA
 */

import java.util.*;






public class getContraseña   {
    
    public static void main(String args[]){
            final int [] caracteres = new int[88];

         System.out.println("Ingrese la cantidad de caracteres");
         try (Scanner entradScanner = new Scanner(System.in)) {
            try {Integer entrada = Integer.parseInt(entradScanner.nextLine());
                
                if(entrada < 8){
                   while(entrada < 8){
                    System.out.println("La contraseña debe ser mayor de 8 cáracteres");
                    entrada = Integer.parseInt(entradScanner.nextLine());
                    }
                }
                    //TODO: Optimizar este código
                    /*Puede ser con matrices */
                    for(int i=0; i<27; i++){ //lleno los arrays con los carácteres que tendrá siguiendo la tabla ASCII
                            caracteres[i] = 65 + i; //letras máyusculas
                            caracteres[i + 26] = i + 97; // Letras minusculas}
                            caracteres[i + 60] = i + 48; // Números  
                        }
                        //Carácteres Especiales
                        caracteres[53] = 64;
                        caracteres[54] = 38;
                        caracteres[55] = 33;
                        caracteres[56] = 36;
                        caracteres[57] = 33;
                        caracteres[58] = 37;
                        caracteres[59] = 47;
                        caracteres[60] = 63;
   
                        
                        Random contraseñaR;
                        contraseñaR = new Random();
                        String password = "";
                        StringBuilder cadena = new StringBuilder();
   
                        for(int i = 0; i< entrada; i++){ 
                           int indice = contraseñaR.nextInt(caracteres.length); //indice es igual la creacion aleatoria de caracteres
                           // de los arrays
                           char cadenaChar = (char) caracteres[indice];
                           cadena.append(cadenaChar);
                        }
                         password = cadena.toString();
                         System.out.println("LA CONTRASEÑA ES "+ password);  

                    } catch(NumberFormatException e){
                        System.out.println("Ingrese un carácter válido");
                }
        
        }catch(NumberFormatException e){
            
        }
  }
}

