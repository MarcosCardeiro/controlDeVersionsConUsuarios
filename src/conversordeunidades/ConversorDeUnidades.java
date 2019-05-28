package conversordeunidades;

import java.util.Scanner;

public class ConversorDeUnidades {

    public static void main(String[] args) {
<<<<<<< HEAD
        
    }
=======
//         Scanner leer = new Scanner(System.in);
//        int opc;
//        /*objetos para llamar a clases*/
//        ConversorDistancia D = new ConversorDistancia();
//        ConversorPotencia P = new ConversorPotencia();
//        ConversorTemperatura T = new ConversorTemperatura();
//        
//        do{
//            System.out.println("Ingrese la opción que desea:");
//
//                System.out.println("1 - Transformar Lonxitude.");
//                System.out.println("2 - Transformar Potencia.");
//                System.out.println("3 - Transformar Temperatura.");
//                System.out.println("0 - Saír.");
//                
//                opc = leer.nextInt();
//                /*variable para las opciones*/
//            double distancia, temperatura, potencia;
//
//            if(opc > 0 && opc <= 3){
//                
//                
//                    int unidad1 , unidad2;
//                    /*Entrada de texto con las opciones*/
//                    System.out.println("Ingrese la opción que desea:");
//                    
//                /*opcións para lonxitudes*/
//                switch (opc) {
//                    case 1:
//                        do{
//                            unidad2 = 0;
//                            /*PIDO UNIDADES DE DISTANCIA PARA CONVERTIR*/
//                            System.out.println("ELIJA LA UNIDAD EN LA QUE ESTÁ SU MEDIDA:");
//                            Mostrar(opc);
//                            unidad1 = leer.nextInt();
//                            if(unidad1 >= 1 && unidad1 <=8){
//                                System.out.println("ELIJA LA UNIDAD A LA QUE QUIERE CONVERTIR:");
//                                Mostrar(opc);
//                                unidad2 = leer.nextInt();
//                                if(unidad2 >= 1 && unidad2 <=8){
//                                    System.out.println("CUAL ES SU PUTA CANTIDAD ME CAGO EN JESUSITO:");
//                                    distancia = leer.nextDouble();
//                                    
//                                    System.out.println("SU PUTA DISTANCIA ES: " + D.ConversorUnidades(distancia, unidad1, unidad2) );
//                                }
//                                else if(unidad2 == 9) System.out.println("Cambiando a menú de conversión");
//                                
//                                else    System.out.println("A INTRODUCIDO UN NÚMERO NO RECOGIDO EN LAS OPCIONES");
//                            }else if(unidad1 == 9) System.out.println("Cambiando a menú de conversión");                                
//                            
//                            else    System.out.println("A INTRODUCIDO UN NÚMERO NO RECOGIDO EN LAS OPCIONES");                             
//                            
//                            
//                            
//                        }while(unidad1 != 9 && unidad2 != 9);
//                        break;
//                /*opcións para Temperaturas*/
//                    case 2:
//                        do{
//                            unidad2 = 0;
//                            /*PIDO UNIDADES DE DISTANCIA PARA CONVERTIR*/
//                            System.out.println("ELIJA LA UNIDAD EN LA QUE ESTÁ SU MEDIDA:");
//                            Mostrar(opc);
//                            unidad1 = leer.nextInt();
//                            if(unidad1 >= 1 && unidad1 <=6){
//                                System.out.println("ELIJA LA UNIDAD A LA QUE QUIERE CONVERTIR:");
//                                Mostrar(opc);
//                                unidad2 = leer.nextInt();
//                                if(unidad2 >= 1 && unidad2 <=8){
//                                    System.out.println("CUAL ES SU PUTA CANTIDAD ME CAGO EN JESUSITO:");
//                                    potencia  = leer.nextDouble();
//                                    
//                                    System.out.println("SU PUTA DISTANCIA ES: " + D.ConversorUnidades(potencia, unidad1, unidad2) );
//                                    
//                                }
//                                else if(unidad2 == 9) System.out.println("Cambiando a menú de conversión");
//                                
//                                else    System.out.println("A INTRODUCIDO UN NÚMERO NO RECOGIDO EN LAS OPCIONES");
//                            }else if(unidad1 == 9) System.out.println("Cambiando a menú de conversión");                                
//                            
//                            else    System.out.println("A INTRODUCIDO UN NÚMERO NO RECOGIDO EN LAS OPCIONES");
//                            
//                        }while(unidad1 != 9 && unidad2 != 9);
//                        break;
//                    case 3:
//                        do{
//                            unidad2 = 0;
//                            /*PIDO UNIDADES DE DISTANCIA PARA CONVERTIR*/
//                            System.out.println("ELIJA LA UNIDAD EN LA QUE ESTÁ SU MEDIDA:");
//                            Mostrar(opc);
//                            unidad1 = leer.nextInt();
//                            if(unidad1 >= 1 && unidad1 <=8){
//                                System.out.println("ELIJA LA UNIDAD A LA QUE QUIERE CONVERTIR:");
//                                Mostrar(opc);
//                                unidad2 = leer.nextInt();
//                                if(unidad2 >= 1 && unidad2 <=8){
//                                    System.out.println("CUAL ES SU PUTA CANTIDAD ME CAGO EN JESUSITO:");
//                                    temperatura  = leer.nextDouble();
//                                    System.out.println("SU PUTA DISTANCIA ES: " + D.ConversorUnidades(temperatura, unidad1, unidad2) ); 
//                                    
//                                }
//                                else if(unidad2 == 9) System.out.println("Cambiando a menú de conversión");
//                                
//                                else    System.out.println("A INTRODUCIDO UN NÚMERO NO RECOGIDO EN LAS OPCIONES");
//                            }else if(unidad1 == 9) System.out.println("Cambiando a menú de conversión");                                
//                            
//                            else    System.out.println("A INTRODUCIDO UN NÚMERO NO RECOGIDO EN LAS OPCIONES");
//                            
//                        }while(unidad1 != 9 && unidad2 != 9);
//                        break;
//                    default:
//                        break;
//                }
//                   
//                        
//                
//            }else if(opc == 0) System.out.println("Adios, con el, corazon ?•´?•`?? ");
//            else System.out.println("ENTRADA INCORRECTA  ?( ?'??'?)?  ");
//            
//        }while(opc != 0);
//    }
//
//    private static void Mostrar(int opc) {
//        
//        switch (opc) {
//            case 1:
//                System.out.println("1.- Kms\n" +
//                        "2.- Metros\n" +
//                        "3.- Cms\n" +
//                        "4.- Pulgadas\n" +
//                        "5.- Yardas\n" +
//                        "6.- Pés\n" +
//                        "7.- Millas\n" +
//                        "8.- Millas náuticas\n" +
//                        "9.- Saír");
//                break;
//            case 2:
//                System.out.println("1.- Vatio\n" +
//                        "2.- KW\n" +
//                        "3.- CV\n" +
//                        "4.- CF\n" +
//                        "5.- MW\n" +
//                        "6.- Pé/libra\n" +
//                        "9.- Saír");
//                break;
//            case 3:
//                System.out.println("1.- Celsis\n" +
//                        "2.- Fahrenheit\n" +
//                        "3.- Kelvin\n" +
//                        "4.- Rankine\n" +
//                        "5.- Delisle\n" +
//                        "6.- Newton\n" +
//                        "7.- Réamur\n" +
//                        "8.- Romer\n" +
//                        "9.- Saír");
//                break;
//            default:
//                break;
//        }
  }
>>>>>>> Main
    
}
