package br.com.algoritmos.outros;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class EntradaDeCinema {
	public static void main(String[] args) {
		System.out.println("Seja bem vindo\n");
		System.out.println("De segunda a sexta e menores de 12 tem desconto de 50%\n");
		System.out.println("Digite sua idade: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("O valor a pagar é: R$" + calculaPreco(sc.nextInt()));
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	private static double calculaPreco(int idade) {
		double valorEntrada = 18;

		Calendar dia = Calendar.getInstance();

		int fds = (dia.get(Calendar.DAY_OF_WEEK));
		
		if (idade < 12 ) {
			valorEntrada = valorEntrada*0.5;
		} else if ((fds != 1) && (fds != 7)){
			valorEntrada = valorEntrada*0.5;
			System.out.println("Boa notícia, final de semana tem desconto");
		} else {
			valorEntrada = valorEntrada*1;
		}
		return valorEntrada;
	}

}
