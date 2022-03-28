package br.com.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex002 {
	/**
	 * @author Paulo Fegueredo
	 * @param descricao: Ex002 – Converter temperatura em graus Fahrenheit para Ceusius
	 */
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o valor em Fahrenheit: ");
		
		double fahrenheit = leitura.nextDouble();
				
		double celsius = (fahrenheit - 32) / 1.8;
		DecimalFormat formato = new DecimalFormat("#.###");
		
		System.out.println("O valor de " + fahrenheit + " em Ceusius é: " + formato.format(celsius));
		leitura.close();
	}

}
