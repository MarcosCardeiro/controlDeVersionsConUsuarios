package conversordeunidades;

import java.util.Scanner;

public class ConversorDeUnidades {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 10;
        /*objetos para llamar a clases*/
        ConversorDistancia D = new ConversorDistancia();
        ConversorPotencia P = new ConversorPotencia();
        ConversorTemperatura T = new ConversorTemperatura();
        
        do{
            System.out.println("Ingrese la opción que desea:");

                System.out.println("1 - Transformar Lonxitude.");
                System.out.println("2 - Transformar Potencia.");
                System.out.println("3 - Transformar Temperatura.");
                System.out.println("0 - Saír.");
                
                opc = leer.nextInt();
                /*variable para las opciones, CHAR*/
            int opc2 = 0;
            double distancia, temperatura, potencia;

            if(opc > 0 && opc <= 3){
                
                do{
                    /*Entrada de texto con las opciones*/
                    System.out.println("Ingrese la opción que desea:");
                    
                    /*opcións para lonxitudes*/
                    if(opc == 1){
                        System.out.println("1 - Kilómetros a Millas.");
                        System.out.println("2 - Millas a Kilómetros.");
                        System.out.println("3 - Millas a Pulgadas.");
                        System.out.println("4 - Pulgadas a Millas.");
                        System.out.println("0 - Volver al menú.");
                    }
                    /*opcións para Potencias*/
                    else if(opc == 2){
                        System.out.println("1 - KW a CV.");
                        System.out.println("2 - CV a KW.");
                        System.out.println("3 - KW a Ft/Lb.");
                        System.out.println("4 - Ft/Lb a KW.");
                        System.out.println("0 - Volver al menú.");
                    }/*opcións para Temperaturas*/
                    else{
                        System.out.println("1 - Celsius a Fahrenheit.");
                        System.out.println("2 - Fahrenheit a Celsius.");
                        System.out.println("3 - Celsius a Kelvin.");
                        System.out.println("4 - Kelvin a Celsius.");
                        System.out.println("0 - Volver al menú.");
                    }
                    
                    opc2= leer.nextInt();
                        /*SWITCH con los TODOS casos*/
                    switch(opc2){
                        case 1:
                            /*opcion para lonxitudes*/
                            if(opc == 1){
                                System.out.println("Introduzca la cantidad en Kilómetros que quiera convertir a Millas:");
                                    distancia = leer.nextDouble();
                                System.out.println("La cantidad sería: " + D.KmsMillas(distancia));
                            }
                            /*opción para Potencias*/
                            else if(opc == 2){
                                System.out.println("Introduzca la cantidad en KW que quiera convertir a CV:");
                                    potencia = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + P.KWaCV(potencia));
                            }
                            /*opción para Temperaturas*/
                            else{
                                System.out.println("Introduzca la cantidad en Celsius que quiera convertir a Fahrenheit:");
                                    temperatura = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + T.CelsiusAFahrenheit(temperatura));
                            }
                            break;

                        case 2:
                            /*opcion para lonxitudes*/
                            if(opc == 1){
                                System.out.println("Introduzca la cantidad en Millas que quiera convertir a Kilómetros:");
                                    distancia = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + D.MillasKms(distancia));
                            }
                            /*opción para Potencias*/
                            else if(opc == 2){
                                System.out.println("Introduzca la cantidad en CV que quiera convertir a KW:");
                                    potencia = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + P.CVaKW(potencia));
                            }
                            /*opción para Temperaturas*/
                            else{
                                System.out.println("Introduzca la cantidad en Fahrenheit que quiera convertir a Celsius:");
                                    temperatura = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + T.FahrenheitACelsius(temperatura));
                            }
                            break;

                        case 3:
                            /*opcion para lonxitudes*/
                            if(opc == 1){
                                System.out.println("Introduzca la cantidad en Millas que quiera convertir a Pulgadas:");
                                    distancia = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + D.MillasPulgadas(distancia));
                            }
                            /*opción para Potencias*/
                            else if(opc == 2){
                                System.out.println("Introduzca la cantidad en KW que quiera convertir a Ft/Lb:");
                                    potencia = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + P.KWaFT(potencia));
                            }
                            /*opción para Temperaturas*/
                            else{
                                System.out.println("Introduzca la cantidad en Celsius que quiera convertir a Kelvin:");
                                    temperatura = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + T.CelsiusAKelvin(temperatura));
                            }
                            break;

                        case 4:
                            /*opcion para lonxitudes*/
                            if(opc == 1){
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                    distancia = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + D.PulgadasMillas(distancia));
                            }
                            /*opción para Potencias*/
                            else if(opc == 2){
                                System.out.println("Introduzca la cantidad en Ft/Lb que quiera convertir a KW:");
                                    potencia = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + P.FTaKW(potencia));
                            }
                            /*opción para Temperaturas*/
                            else{
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                    temperatura = leer.nextDouble();
                                
                                System.out.println("La cantidad sería: " + T.KelvinACelsius(temperatura));
                            }
                            break;

                        case 0:
                            System.out.println("Volver al menú");
                            break;
                    }
                }while(opc2!= 0);
            }
            else if(opc == 0) System.out.println("Adios, con el, corazon ʕ•́ᴥ•̀ʔっ ");
            else System.out.println("ENTRADA INCORRECTA  ᕙ( ︡'︡益'︠)ง  ");;
            
        }while(opc != 0);
    }
    
}
