package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class ExerciciosAula17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;
        do {
            System.out.println("Digite sua nota:");
            int nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("noota valida" + nota);


            } else {
                System.out.println("nota inalida");
            }

        }while (!notaValida);

    }


}
