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
                /*variable para las opciones*/
            double distancia, temperatura, potencia;

            if(opc > 0 && opc <= 3){
                
                
                    int unidad1, unidad2;
                    /*Entrada de texto con las opciones*/
                    System.out.println("Ingrese la opción que desea:");
                    
                    /*opcións para lonxitudes*/
                    if(opc == 1){
                        do{
                            /*PIDO UNIDADES DE DISTANCIA PARA CONVERTIR*/
                            System.out.println("ELIJA LA UNIDAD EN LA QUE ESTÁ SU MEDIDA:");
                                Mostrar(opc);
                                unidad1 = leer.nextInt();
                            System.out.println("ELIJA LA UNIDAD A LA QUE QUIERE CONVERTIR:");
                                Mostrar(opc);
                                unidad2 = leer.nextInt();
                            System.out.println("CUAL ES SU PUTA CANTIDA ME CAGO EN JESUSITO:");
                                distancia = leer.nextDouble();

                            System.out.println("SU PUTA DISTANCIA ES: " + D.ConversorUnidades(distancia, unidad1, unidad2) ); 
                        }while(unidad1 == 9 && unidad2 == 9);
                    }
                    /*opcións para Potencias*/
                    else if(opc == 2){
                        do{
                            /*PIDO UNIDADES DE POTENCIA PARA CONVERTIR*/
                            System.out.println("ELIJA LA UNIDAD EN LA QUE ESTÁ SU MEDIDA:");
                                Mostrar(opc);
                            unidad1 = leer.nextInt();
                            System.out.println("ELIJA LA UNIDAD A LA QUE QUIERE CONVERTIR:");
                                Mostrar(opc);
                            unidad2 = leer.nextInt();
                            System.out.println("CUAL ES SU PUTA CANTIDA ME CAGO EN JESUSITO:");
                                potencia = leer.nextDouble();

                            System.out.println("SU PUTA POTENCIA ES: " + P.ConversorPotencias(potencia, unidad1, unidad2) );
                        }while(unidad1 == 9 && unidad2 == 9);
                    }/*opcións para Temperaturas*/
                    else if (opc == 3){
                        do{
                            /*PIDO UNIDADES DE TEMPERATURA PARA CONVERTIR*/
                            System.out.println("ELIJA LA UNIDAD EN LA QUE ESTÁ SU MEDIDA:");
                                Mostrar(opc);
                            unidad1 = leer.nextInt();
                            System.out.println("ELIJA LA UNIDAD A LA QUE QUIERE CONVERTIR:");
                                Mostrar(opc);
                            unidad2 = leer.nextInt();
                            System.out.println("CUAL ES SU PUTA CANTIDA ME CAGO EN JESUSITO:");
                                temperatura = leer.nextDouble();

                            System.out.println("SU PUTA POTENCIA ES: " + T.ConversorTemperaturas(temperatura, unidad1, unidad2) );
                        }while(unidad1 == 9 && unidad2 == 9);
                    }
                   
                        
                
            }else if(opc == 0) System.out.println("Adios, con el, corazon ?•´?•`?? ");
            else System.out.println("ENTRADA INCORRECTA  ?( ?'??'?)?  ");
            
        }while(opc != 0);
    }

    private static void Mostrar(int opc) {
        
        if(opc == 1){
            System.out.println("1.- Kms\n" +
                                "2.- Metros\n" +
                                "3.- Cms\n" +
                                "4.- Pulgadas\n" +
                                "5.- Yardas\n" +
                                "6.- Pés\n" +
                                "7.- Millas\n" +
                                "8.- Millas náuticas\n" +
                                "9.- Saír");
        }else if(opc == 2){
            System.out.println("1.- Vatio\n" +
                                "2.- KW\n" +
                                "3.- CV\n" +
                                "4.- CF\n" +
                                "5.- MW\n" +
                                "6.- Pé/libra\n" +
                                "9.- Saír");
        }else if(opc == 3){
	    System.out.println("1.- Celsis\n" +
                                "2.- Fahrenheit\n" +
                                "3.- Kelvin\n" +
                                "4.- Rankine\n" +
                                "5.- Delisle\n" +
                                "6.- Newton\n" +
				"7.- Réamur\n" +
				"8.- Romer\n" +
                                "9.- Saír");
	}
    }
    
}
