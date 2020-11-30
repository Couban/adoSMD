/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Random;

/**
 *
 * @author Marcos
 */
public class teste2 {

    //public static void main(String[] args) {

        new Thread(t1).start();
        new Thread(t2).start();

    }

    private static Runnable t1 = new Runnable() {
        @Override
        public void run() {

            Random r = new Random();
            int vetorA[] = new int[100000];
            int soma = 0;

            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = r.nextInt(10);
                soma = soma + vetorA[i];
                System.out.println("Executando a soma " + Thread.currentThread().
                        getName() + " somando o valor " + vetorA[i] + " com total de " + soma);

            }
        }

    };

    private static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            Random r = new Random();
            int vetorB[] = new int[100000];
            int soma2 = 0;

            for (int j = 0; j < vetorB.length; j++) {

                vetorB[j] = r.nextInt(10);
                soma2 += vetorB[j];
                System.out.println("Executando a soma " + Thread.currentThread().
                        getName() + " somando o valor " + vetorB[j] + " com total de " + soma2);

            }
        }
    };

}
