package br.com.algoritmos;

import java.util.Scanner;

/**
 * @author Paulo Fegueredo
 * @param Calcular o consumo de combust�vel por Km.
 */
public class Ex004 {

	public static void main(String[] args) {
		double distancia;
		double litros;
		double consumo;

		Scanner leitora = new Scanner(System.in);

		System.out.println("Digite a quantidade de litros consumida: ");
		litros = leitora.nextDouble();
		System.out.println("Digite a distancia percorrida: ");
		distancia = leitora.nextDouble();
		consumo = distancia / litros;
		System.out.println("O consumo de combustivel por km é: " + consumo + "");
		leitora.close();
	}
}
