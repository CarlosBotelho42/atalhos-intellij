package com.company.ControleDeFluxo;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        switchSemana();
    }

    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Receber auxilio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Receber");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        if (recebeAuxilio) {
            System.out.println("Recebe");
        }

    }

    private static void switchSemana() {
        Scanner scanner = new Scanner(System.in);

        String dia;
        System.out.println("Escreva o nome do dia da semana: ");

        dia = scanner.next();
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            default:
                System.out.println("Dia Invalido");
                break;

        }
    }

}
