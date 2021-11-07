package com.company.estruturasDeRepeticao;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class EDR {
    public static void main(String[] args) {
        //laWhile();
        //nota();
        //maiorMedia();
        //parOuImpar();
        //lacoTabuada();
        //fatorial();
        //oredemInversa();
        //consoantes();
        //numerosAleatorios();
        arrayMultDimi();
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

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }

    private static void fatorial() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }

    private static void oredemInversa() {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {-5, -6, 15, 58, 8, 4};

        System.out.println("Vetor");
        int count = 0;

        while (count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }

    private static void consoantes() {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeC = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = sc.next();

            if(!(letra.equals("a") |
                  letra.equals("e") |
                  letra.equals("i") |
                  letra.equals("o") |
                  letra.equals("u"))){
                consoantes[count] = letra;
                quantidadeC++;
            }
            count++;

        }while (count < consoantes.length);

        System.out.println("Consoantes");
        for(String consoante : consoantes){
            if(consoante != null)
            System.out.println(consoante);
        }
        System.out.println("Qunatidade de consoantes " + quantidadeC );

    }

    private static void numerosAleatorios(){
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i = 0; i < numAleatorios.length; i++){
            int num = random.nextInt(100);
            numAleatorios[i] = num;
        }

        System.out.println("Numeros aleatorios");
        for (int numero : numAleatorios) {
            System.out.println(numero + "");
        }

        System.out.println("\nSucessores numeros aleatorios");
        for (int numero : numAleatorios) {
            System.out.println((numero+1) + "");
        }


    }

    private static void arrayMultDimi(){
        Random random = new Random();

        int[][]M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha: M){
            for(int elementoColuna : linha){
                System.out.println(elementoColuna + "");
            }
            System.out.println();
        }


    }



}
