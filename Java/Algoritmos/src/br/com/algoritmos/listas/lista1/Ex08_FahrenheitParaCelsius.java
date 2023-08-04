package br.com.algoritmos.listas.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08_FahrenheitParaCelsius {
	/**
	 * @author Paulo Fegueredo
	 * @param  Converter temperatura graus Fahrenheit para Ceusius
	 */
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o valor em Fahrenheit: ");
		
		double fahrenheit = leitura.nextDouble();
				
		double celsius = (fahrenheit - 32) / 1.8;
		DecimalFormat formato = new DecimalFormat("#.###");
		
		System.out.println("O valor de " + fahrenheit + " fahrenheits em Celsius é: " + formato.format(celsius));
		leitura.close();
	}

}
