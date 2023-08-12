package br.com.algoritmos.outros;

import java.util.Scanner;

/*
 * Fazer uma classe Ex1Primos para:
• Receber um inteiro N do usuário
• Testar se este inteiro é primo ou não e informar
 */

public class NumeroPrimo {

	public static void main(String[] args) {
		System.out.println("Digite um número para saber se é primo: \n");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int contador = 0;
		for(int i = 1; i <= num; i++) {
			int resultado = num % i;
			if (resultado == 0) {
				contador++;
			}
		}
		if (contador == 2) {
		 System.out.println(num + " é um número primo");
		} else {
			System.out.println(num +" não é um número primo.");
		}
		
		entrada.close();
		
	}

}
