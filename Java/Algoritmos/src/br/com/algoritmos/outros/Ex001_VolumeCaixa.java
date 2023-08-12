package br.com.algoritmos.outros;

import java.util.Scanner;

// Calculo do Volume de uma caixa retangular

public class Ex001_VolumeCaixa {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		int altura;
		int largura;
		int profundidade;
		int volume;
		
		System.out.println("Digite o valor da altura: ");
		altura = leitura.nextInt();
		System.out.println("Digite o valor da largura: ");
		largura = leitura.nextInt();
		System.out.println("Digite o valor da profundidade: ");
		profundidade = leitura.nextInt();
		
		volume = altura * largura * profundidade;

		System.out.println("O volume dessa caixa retangular �: "+ volume);
		leitura.close();
	}

}
