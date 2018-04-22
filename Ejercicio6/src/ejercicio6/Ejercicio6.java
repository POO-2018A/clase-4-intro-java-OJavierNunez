package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        System.out.println("\t Ejercicio 6");
        boolean estaNevando;
        System.out.println("\n Esta nevando");
        estaNevando = scan.nextBoolean();
        boolean estaLloviendo;
        System.out.println("\n Esta lloviendo");
        estaLloviendo = scan.nextBoolean();
        double temperatura;
        System.out.println("\n La temperatura es: ");
        temperatura= scan.nextDouble();
       
        if (estaNevando == true || estaLloviendo == true || (temperatura<10)){
             System.out.println("\n Nos quedamos en casa!");
        }else{
            System.out.println("\n Vamos afuera!");
        }
    }
    
}
