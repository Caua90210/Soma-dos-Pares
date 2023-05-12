package br.senai.sp.jandira;

public class SomaNumerosPares {
    public static void main(String[] args) {
    	
        int soma = 0;
        
        for (int a = 1; a <= 50; a++) {
        	
            if (a % 2 == 0) {
            	
                soma += a;
            }
        }
        System.out.println("A somatória dos números pares de 1 até 50 é: " + soma);
    }
}
