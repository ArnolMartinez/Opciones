package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una vocal");
        char vocal=entrada.next().charAt(0);
        switch (vocal){
            case 'a':
            case 'A':
                System.out.println("arbol, alcanzar, alas");
                break;
            case 'e':
            case 'E':
                System.out.println("Escoba, elote, error");
                break;
            case 'i':
            case 'I':
                System.out.println("Iglesia, isla, iman");
                break;
            case 'o':
            case 'O':
                System.out.println("Oso, ola, orquidea");
                break;
            case 'u':
            case 'U':
                System.out.println("Uva, usar, urna");
                break;
            default:
                System.out.println("El caracter ingresado no es una vocal");
        }
    }
}
