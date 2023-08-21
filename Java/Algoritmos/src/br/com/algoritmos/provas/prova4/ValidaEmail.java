package br.com.algoritmos.provas.prova4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidaEmail {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu e-mail: ");
		String email = entrada.nextLine();
		validarEmail(email);

	}

	public static void validarEmail(String email) {	


		String[] divisao = email.split("@");

		int indice = email.indexOf("@");
		int indicefinal = email.lastIndexOf("@") + 1 ;
		int invalido = 0;

		if (email != null && email.length() > 0) {

			if (email.contains("@") && (indice > 0) && (indicefinal != email.length() ) 
					&& !email.contains(" ") && divisao[1].contains(".")) {
				
				for(int i = 0; i < email.length(); i++ ) {
					String letra = email.substring(i, i+1);
					if (letra.equals("#") || letra.equals("$") || letra.equals("%") || letra.equals("&") || letra.equals("(")) {
						invalido++;
					} 
				}

			} else {
				invalido++;
			};

			if (invalido > 0) {
				System.out.println("E-mail inválido");
			} else {
				System.out.println("E-mail válido");
			}
		} else {
			System.out.print("Não é possivel validar em branco");
		}

	}
}
