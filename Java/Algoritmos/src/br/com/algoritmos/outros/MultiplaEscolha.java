package br.com.algoritmos.outros;

import java.io.Console;
import java.util.Scanner;

public class MultiplaEscolha {

	public static void main(String[] argumentos) {
		System.out.println("Escolha a opção correta:");
		System.out.println("P - Quantos lados tem um círculo ?");
		System.out.println("1 - Nenhum.");
		System.out.println("2 - Dois.");
		System.out.println("3 - Infinitos.");
		System.out.println("4 - Nenhuma das respostas acima.");

		Scanner keyboard = new Scanner(System.in);
		int resposta = keyboard.nextByte();
		switch (resposta) {
			case 1: 
				System.out.println("Correto.");
				System.out.println("O circulo não tem nenhum lado.");
				break;
			case 2:
				System.out.println("Errado");
				break;
			case 3:
				System.out.println("Errado");
			case 4:
				System.out.println("Errado");
				break;
		default:
			System.out.println("Você não forneceu resposta !");
			break;
		}
	}
}
