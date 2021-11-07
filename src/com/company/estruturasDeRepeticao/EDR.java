package com.company.estruturasDeRepeticao;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class EDR {
    public static void main(String[] args) {
        //laWhile();
        //nota();
        //maiorMedia();
        //parOuImpar();
        //lacoTabuada();
        fatorial();
    }

    private static void laWhile() {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = sc.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = sc.nextInt();
        }
    }

    private static void nota() {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = sc.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota invalida, insira novamente!");
            nota = sc.nextInt();
        }
    }

    private static void maiorMedia() {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;
            count = count + 1;

        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + soma / 5);
    }

    private static void parOuImpar() {
        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int qPares = 0, qImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) qPares++;
            else qImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de pares: " + qPares);
    }

    private static void lacoTabuada() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = sc.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <=10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }

    private static void fatorial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        for(int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }

}
