package br.com.algoritmos.outros;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		float resultado = 0;
		
		System.out.println("CALCULADORA \n");
		
		
		System.out.println("Digite o primeiro valor: ");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		
		System.out.println("Digite a operação: ");
		Scanner sc2 = new Scanner(System.in);
		String operacao = sc2.next();

		System.out.println("Digite o segundo valor: ");
		Scanner sc3 = new Scanner(System.in);
		float num2 = sc3.nextFloat();
		
		switch(operacao) {
			case "+": 
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "/":
				try {
					resultado = num1 / num2;
					
				} catch (Exception e) {
					System.out.println("Ocorreu um erro");
				}
				break;
			case "*":
				resultado = num1*num2;
			default:
				System.out.println("Nenhum operador válido foi informado");
		}
		System.out.println(resultado);
		sc.close();
		sc2.close();
		sc3.close();
	}

}
