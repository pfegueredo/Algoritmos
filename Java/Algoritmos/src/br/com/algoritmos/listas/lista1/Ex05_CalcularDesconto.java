package br.com.algoritmos.listas.lista1;

import java.util.Scanner;
/*
 	Solicite o preço de uma mercadoria e o percentual de desconto. 
 	Exiba o valor do desconto e o preço a pagar.
 */
public class Ex05_CalcularDesconto {
	public static void main(String[] arfs) {
		Scanner s = new Scanner(System.in);
		System.out.println("Calcular desconto do produto\n");
		
		System.out.print("Digite o valor do produto: R$ ");
		double precoProduto = s.nextDouble();
		System.out.print("Digite o valor do desconto: % ");
		double valorDesconto = s.nextDouble();
		calcularDesconto(precoProduto, valorDesconto);
		s.close();
		
	}
	
	static void calcularDesconto(double precoProduto, double valorDesconto) {
		double valorDoDesconto = precoProduto*valorDesconto/100;
		double valorComDesconto = precoProduto - valorDoDesconto;
		System.out.println("=> O valor do produto é: R$ "+precoProduto);
		System.out.println("=> O percentual de desconto do produto é: % "+valorDesconto);
		System.out.println("=> O valor do desconto é: R$ "+valorDoDesconto);
		System.out.println("=> O preço do produto com desconto é: R$ "+valorComDesconto);
	}

}
