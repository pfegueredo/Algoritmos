package br.com.algoritmos.provas.prova5;

import java.util.Scanner;

public class MaquinaCafe01 {

	public static void main(String[] args) {

		int qtdeCafeExpresso = 0;
		double valorCafeExpresso = 0;
		
		int qtdeCafeCapuccino = 0;
		double valorCafeCapuccino = 0;
		
		int qtdeCafeComLeite = 0;
		double valorCafeComLeite = 0;
		
		int opcao = 0;
		menu();
		
		Scanner entrada  = new Scanner(System.in);
		
		
		do {
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					qtdeCafeExpresso++;
					System.out.println("Obrigado e volte sempre!");
					menu();
					break;
				case 2:
					qtdeCafeCapuccino++;
					System.out.println("Obrigado e volte sempre!");
					menu();
					break;
				case 3:
					qtdeCafeComLeite++;
					System.out.println("Obrigado e volte sempre!");
					menu();
					break;
				case 4:
					System.out.println("== Resumo das Vendas ==");
					valorCafeExpresso = qtdeCafeExpresso * 0.75;
					valorCafeCapuccino = qtdeCafeCapuccino * 1.00;
					valorCafeComLeite = qtdeCafeComLeite * 1.25;
					
					System.out.println("Quantidade vendida: "+qtdeCafeExpresso+" e valor total café expresso vendido "+valorCafeExpresso);
					System.out.println("Quantidade vendida: "+qtdeCafeCapuccino+" e valor total café Capuccino vendido "+valorCafeCapuccino);
					System.out.println("Quantidade vendida: "+qtdeCafeComLeite+" e valor total Cafe Com Leite vendido "+valorCafeComLeite);
					System.out.println("Quantidade total vendida: "+(qtdeCafeComLeite+qtdeCafeCapuccino+qtdeCafeComLeite)+" e valor total  vendido: "+(valorCafeExpresso+valorCafeCapuccino+valorCafeComLeite));
					break;
				default:
					System.out.println("Opção inválida. Escolha uma opção no menu");
					menu();
			}
		} while (!(opcao == 4));
		
		
		switch(opcao) {
			case 1:
				
		}
		
		entrada.close();
	}
	
	public static void menu() {
		System.out.println("..:: Máquina de Café ::..\n");
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Café expresso");
		System.out.println("2 - Café capuccino");
		System.out.println("3 - Café com leite");
		System.out.println("4 - Totalizar vendas");
	}

}
