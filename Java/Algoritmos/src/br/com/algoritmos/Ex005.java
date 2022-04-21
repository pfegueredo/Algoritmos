package br.com.algoritmos;

import java.util.Scanner;

/**
 * @author Paulo Fegueredo
 * @param Descrição: Calcula o quadrado da diferença entre números.
 */
public class Ex005 {

	public static void main(String[] args) {

		double num1;
		double num2;
		double quadrado;

		Scanner leitora = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		num1 = leitora.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = leitora.nextDouble();
		quadrado = Math.pow((num2 - num1), 2);
		System.out.println("O quadrado da diferenla entre "+ num1 + " e "+ num2 + " é " + quadrado);
		
		leitora.close();
	}
}
