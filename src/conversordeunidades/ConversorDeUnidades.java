package conversordeunidades;

import java.util.Scanner;

public class ConversorDeUnidades {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opc;
        double pulgadas, milimetros, yardas, metros, millas, kilometros;
        
        System.out.println("Ingrese la opción que desea:");
        
        System.out.println("1 - Pulgadas a milímetros.");
        System.out.println("2 - Yardas a metros.");
        System.out.println("3 - Millas a Kilómetros.");
        
        opc = leer.nextInt();
        
        switch(opc){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    
}
