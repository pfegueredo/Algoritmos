package br.com.algoritmos;

import java.util.Scanner;

import br.com.algoritmos.Ex001;

public class menuAlgoritmos {


	public static void main(String[] args) {
		System.out.println("Rela��o de Algoritmos \n");

		System.out.println("Ex001 - Calculo do Volume de uma caixa retangular");
		System.out.println("Ex002 � Converter temperatura em graus Fahrenheit para Ceusius");
		System.out.println("Ex003 - Calcula volume de um cilindro");
		
		System.out.println("Digite um n�mero para executa-lo: ");
		
		System.out.println("1 - Calcular o volume de uma caixa ret�ngular. ");
		Scanner opcao = new Scanner(System.in);
		int valor = opcao.nextInt();
		switch (valor) {
			case 1:
				Ex001 ex001 = new Ex001();
				ex001.getClass();
				System.out.println(valor);
				
		}
		
		}
}
