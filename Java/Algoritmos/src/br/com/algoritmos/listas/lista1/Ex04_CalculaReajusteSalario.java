package br.com.algoritmos.listas.lista1;

import java.util.Scanner;

public class Ex04_CalculaReajusteSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do salário: ");
		double salario = entrada.nextDouble();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite o percentual que deseja reajustar: ");
		double percentDesejado = entrada2.nextDouble();
		double reajuste = salario*percentDesejado / 100;
		System.out.println("O valor do reajuste é: R$ "+ reajuste);
		System.out.println("E o novo salário é: R$ "+ (reajuste+salario));
	}
}
