package br.com.algoritmos.outros;

import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		float fahrenheit;
		float celsius;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor em Fahrenheit: ");
		fahrenheit = sc.nextFloat();
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("O valor em Celsius é: " + celsius);
		sc.close();
	}
}
