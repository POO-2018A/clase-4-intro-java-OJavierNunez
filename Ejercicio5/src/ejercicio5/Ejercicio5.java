package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("\t Ejercicio 5\nIngrese el numero de un mes: ");
        int mes = scan.nextInt();
        switch (mes){
            case 1:
                System.out.println("\n Enero");
                break;
            case 2:
                System.out.println("\n Febrero");
                break;
            case 3:
                System.out.println("\n Marzo");
                break;
            case 4:
                System.out.println("\n Abril");
                break;
            case 5:
                System.out.println("\n Mayo");
                break;
            case 6:
                System.out.println("\n Junio");
                break;
            case 7:
                System.out.println("\n Julio");
                break;
            case 8:
                System.out.println("\n Agosto");
                break;
            case 9:
                System.out.println("\n Septiembre");
                break;
            case 10:
                System.out.println("\n Octubre");
                break;
            case 11:
                System.out.println("\n Noviembre");
                break;
            case 12:
                System.out.println("\n Diciembre");
                break;
            default:
                System.out.println("\n Error Ingrese un numero correcto");
                break;
        }
    }
    
}
