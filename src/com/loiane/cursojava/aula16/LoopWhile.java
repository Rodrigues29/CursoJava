package com.loiane.cursojava.aula16;

public class LoopWhile {
    public static void main(String[] args){

       int i = 1;
        int max =30;

        System.out.println("contando ate " + max);

        while (i < max) {
            System.out.println(" valor i : " + i);
            i++;

        }
        System.out.println(i);

        do {
            i++;
            System.out.println("valor de i : " + i);
        }while (i <= 50);
        System.out.println(i);
    }
}
