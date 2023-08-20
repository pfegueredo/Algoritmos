package br.com.algoritmos.provas.prova3;

import java.util.Scanner;

public class CalculaIR {

	public static void main(String[] args) {
		float salarioBruto;
		float desconto;
		float salarioLiquido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		salarioBruto = sc.nextFloat();
		if (salarioBruto > 4664.68) {
			desconto = salarioBruto * 27.5f/100;
		} else if ((salarioBruto >= 3751.06) && (salarioBruto <= 4664.68)) {
			desconto = salarioBruto * 22.5f/100;
		} else if ((salarioBruto >= 2826.66) && (salarioBruto <= 3751.05)) {
			desconto = salarioBruto * 15.0f/100;
		} else if ((salarioBruto >= 1903.99) && (salarioBruto <= 2826.65)) {
			desconto = salarioBruto * 7.5f/100;
		} else {
			desconto =  salarioBruto * 0;
		}
		
		System.out.println("=> Salario Bruto: "+ salarioBruto);
		System.out.println("=> Valor do desconto: "+ desconto);
		System.out.println("=> Salário Líquido: "+ (salarioBruto - desconto));
	}
}
