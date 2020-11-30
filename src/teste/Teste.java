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
public class Teste {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Random r = new Random();

        int vetorA[] = new int[100000];
        int vetorB[] = new int[100000];
        
        
        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", vetorA);
        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", vetorB);
        
        
        /**int vetorA[] = new int[10];
        int vetorB[] = new int[1000];
        int soma[] = new int[1000 ];

        for (int i = 0; i < soma.length; i++) {
            vetorA[i] = r.nextInt(10);
            vetorB[i] = r.nextInt(10);
            soma[i] = vetorA[i] + vetorB[i];
           System.out.println("vetorA[" + vetorA[i] + "] + vetorB[" + vetorB[i] + "] = [" + soma[i] + "]");
*/ 
        }

    }


