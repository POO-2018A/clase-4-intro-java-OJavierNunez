package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("\t Ejercicio 4\nIngrese un numero: ");
        double numero = scan.nextDouble();
        if (numero % 2==0){
             System.out.println("\n El numero es par");
        }else{
            System.out.println("\n El numero es impar");
        }
    }
    
}
