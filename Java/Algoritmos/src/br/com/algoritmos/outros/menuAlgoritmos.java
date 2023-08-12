package br.com.algoritmos.outros;

import java.util.Scanner;

public class menuAlgoritmos {


	public static void main(String[] args) {
		System.out.println("Relaçãoo de Algoritmos \n");

		System.out.println("Ex001 - Calculo do Volume de uma caixa retangular");
		System.out.println("Ex002 - Converter temperatura em graus Fahrenheit para Celsius");
		System.out.println("Ex003 - Calcula volume de um cilindro");
		
		System.out.println("Digite um n�mero para executa-lo: ");
		
		System.out.println("1 - Calcular o volume de uma caixa ret�ngular. ");
		Scanner opcao = new Scanner(System.in);
		int valor = opcao.nextInt();
		switch (valor) {
			case 1:
				Ex001_VolumeCaixa ex001_VolumeCaixa = new Ex001_VolumeCaixa();
				ex001_VolumeCaixa.getClass();
				System.out.println(valor);
				
		}
		
		}
}
