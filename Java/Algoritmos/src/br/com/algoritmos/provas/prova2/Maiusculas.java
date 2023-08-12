package br.com.algoritmos.provas.prova2;

import java.util.Scanner;

public class Maiusculas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = entrada.nextLine();
		
		//System.out.println(texto);
		
		String[] palavras = texto.split(" ");
		
		for (String palavra : palavras) {
			palavra = palavra.substring(0, 1).toUpperCase().concat(palavra.substring(1));
			//System.out.println(palavra);
		}
		texto = String.join(" ",palavras);
		System.out.println(texto);
		
	}
}
