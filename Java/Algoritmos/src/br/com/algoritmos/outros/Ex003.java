package br.com.algoritmos.outros;

import java.util.Scanner;

public class Ex003 {
	/**
	 * @author Paulo Fegueredo
	 * @param Descri��o: Calcula volume de um cilindro
	 */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a altura do cilindro: ");
		double altura = leitor.nextDouble();
		System.out.println("Digite o raio do cilindro: ");
		double raio = leitor.nextDouble();
		double volume = altura * (Math.pow(raio, 2)) * 3.1;
		System.out.println("O volume do cilindo �: " + volume);
		leitor.close();
	}

}
