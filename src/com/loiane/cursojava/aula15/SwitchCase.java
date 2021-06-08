package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("entre com um dia da semana");

        int diaDaSemana = scan.nextInt();



        if (diaDaSemana == 1) {
            System.out.println("DOMINGO");
        }

        else if (diaDaSemana == 2) {
            System.out.println("Seuguda");
        }
        else if (diaDaSemana == 3) {
            System.out.println("teça");
        }
        else if (diaDaSemana == 4) {
            System.out.println("quarta");
        }
        else if (diaDaSemana == 5) {
            System.out.println("quinta");
        }
        else if (diaDaSemana == 6) {
            System.out.println("sexta");
        }
        else if (diaDaSemana == 7) {
            System.out.println("Sebado");
        }else{
            System.out.println("Invalido");

        }

        switch (diaDaSemana){

            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("DIA UTIL");break;
            case 1: System.out.println("Domingo");
            case 7: System.out.println("FIM DE SEMANA");break;

            default:System.out.println("Não é uma data valida");
        }

        }


    }

