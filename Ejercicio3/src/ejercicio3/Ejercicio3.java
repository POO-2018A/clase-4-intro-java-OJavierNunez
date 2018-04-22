package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("\t Ejercicio 3\nIngrese su edad: ");
        int edad = scan.nextInt();
        if (edad >=18){
             System.out.println("\n Eres mayor de edad");
        }else{
            System.out.println("\n Eres menor de edad");
        }
        
    }
    
}
