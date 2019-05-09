package conversordeunidades;

import java.util.Scanner;

public class ConversorDeUnidades {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char opc = 10;
        
        do{
            System.out.println("Ingrese la opción que desea:");

                System.out.println("1 - Transformar Lonxitude.");
                System.out.println("2 - Transformar Potencia.");
                System.out.println("3 - Transformar Temperatura.");
                System.out.println("0 - Saír.");

                /*variable para las opciones, CHAR*/
            char opc2 = 0;
            double pulgadas, milimetros, yardas, metros, millas, kilometros;

            if(opc > 0 && opc <= 3){
                
                while(opc2!= 0){
                    /*Entrada de texto con las opciones*/
                    System.out.println("Ingrese la opción que desea:");

                    System.out.println("1 - Kilómetros a Millas.");
                    System.out.println("2 - Millas a Kilómetros.");
                    System.out.println("3 - Millas a Pulgadas.");
                    System.out.println("4 - Pulgadas a Millas.");
                    System.out.println("0 - Volver al menú.");

                    opc2= leer.next().charAt(0);
                        /*SWITCH con los TODOS casos*/
                    switch(opc2){
                        case 1:
                            /*opcion para lonxitudes*/
                            if(opc == 1){
                                System.out.println("Introduzca la cantidad en Kilómetros que quiera convertir a Millas:");
                                
                            }
                            /*opción para Potencias*/
                            else if(opc == 2){
                                System.out.println("Introduzca la cantidad en Kilómetros que quiera convertir a Millas:");
                               
                            }/*opción para Temperaturas*/
                            else{
                                System.out.println("Introduzca la cantidad en Kilómetros que quiera convertir a Millas:");
                                
                            }
                            break;

                        case 2:
                            System.out.println("Introduzca la cantidad en Millas que quiera convertir a Kilómetros:");
                            break;

                        case 3:
                            System.out.println("Introduzca la cantidad en Millas que quiera convertir a Pulgadas:");
                            break;

                        case 4:
                            System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                            break;

                        case 0:
                            System.out.println("Volver al menú");
                            break;
                    }
                }
            }
            else System.out.println("Adios, con el, corazon ʕ•́ᴥ•̀ʔっ ");
            
        }while(opc != 0);
    }
    
}
