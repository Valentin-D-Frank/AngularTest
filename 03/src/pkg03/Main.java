package pkg03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        numero = sc.nextLine();

        char[] caracteres = numero.toCharArray();
        int digitosNumero = numero.length();
        //Las siguientes dos lineas hacen lo mismo
        //Primera forma de leer caracteres dentro de una cadena
        char primerCaracter = numero.charAt(0);
        //Segunda forma de leer caracteres dentro de una cadena
        char segundoCaracter = caracteres[1];

        if (primerCaracter == '0' && segundoCaracter == 'B' || segundoCaracter == 'b') {
            System.out.println("El numero es de base 2");
            System.out.print("El numero es: ");
            for (int i = 2; i < digitosNumero; i++) {
                System.out.print(numero.charAt(i));
            }
            System.out.println("");
        } else if (primerCaracter == '0' && segundoCaracter == 'X' || segundoCaracter == 'x') {
            System.out.println("El numero es base 16");
            System.out.print("El numero es: ");
            for (int i = 2; i < digitosNumero; i++) {
                System.out.print(numero.charAt(i));
            }
            System.out.println("");
        } else {
            System.out.println("El numero es base 10");
            System.out.print("El numero es: ");
            for (int i = 0; i < digitosNumero; i++) {
                System.out.print(numero.charAt(i));
            }
            System.out.println("");
        }
    }

}
