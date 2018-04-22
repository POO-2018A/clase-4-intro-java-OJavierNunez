package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        double fahrenheit;
        Scanner scan = new Scanner (System.in);
        System.out.println("\tEjercicio 1\nIngrese el valor fahrenheit: ");
        fahrenheit = scan.nextDouble();
        if (fahrenheit <= 100 && fahrenheit >= 0){
            double celsius;
            celsius= ((fahrenheit-32)*5)/9;
            System.out.println("\nEl valor convertido a Celsius es = "+celsius);
        }else{
            System.out.println("\nIngrese otro valor entre 0 y 100");
        }
         
    }
}
