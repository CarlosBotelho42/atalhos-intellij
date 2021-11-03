package com.company.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Entre com o primeiro valor");
        a = scanner.nextInt();

        System.out.println("Entre com o segundo valor");
        b = scanner.nextInt();

        int som = somar(a,b);
        int sub = subtrair(a,b);
        int mult = multiplicar(a,b);
        int div = dividir(a,b);

        System.out.println("soma: " + som);
        System.out.println("subtração: " + sub);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }


}
