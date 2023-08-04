package br.com.algoritmos.listas.lista1;

import java.util.Scanner;

public class Ex02_ConverteMetrosEmMilimetros {

	public static void main(String[] args) {
		System.out.println("Digite um valor em metros pra converter pra milimetros: ");
		Scanner s = new Scanner(System.in);
		double valorMetro = s.nextDouble();
		converter(valorMetro);
		s.close();
	}
	
	public static void converter(double metro) {
		double milimetros;
		milimetros = metro * 1000;
		
		System.out.println(metro + " metro(s) corresponde a "+milimetros+" milimetros");
	}

}
