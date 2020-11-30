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
public class Calculadora {
    
    private int soma;
    
    public synchronized int somaArray(int vetor[]) {
         Random r = new Random();
        soma = 0;
        
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = r.nextInt(10);
            
            
        soma+= vetor[i];
        
            System.out.println("Executando a soma "+ Thread.currentThread().
                    getName() + " somando o valor " + vetor[i] + " com total de " + soma);
    }
        return soma;
    
}
}
