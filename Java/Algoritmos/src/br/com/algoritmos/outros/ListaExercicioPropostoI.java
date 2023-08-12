package br.com.algoritmos.outros;

import java.util.ArrayList;
import java.util.List;

public class ListaExercicioPropostoI {
	/*
	 * Fa�a um programa que receba a temperatura m�dia dos 6 primeiros
	 * meses do ano e armazene-as em uma lista.
	 * Ap�s isto, calcule a m�dia semestral das temperaturas e mostre
	 * todas as temperaturas acima desta m�dia e em que m�s elas ocorreram:
	 * (Mostrar o m�s por extenso: 1 - Janeiro, 2 - Feveiro, etc) 
	 */
	public static void main(String[] args) {
		List<Double> temperaturas = new ArrayList<>() {{
			add(10.0);
			add(13.0);
			add(19.0);
			add(22.0);
			add(18.0);
			add(25.0);
		}};

		Double soma = 0d;

		for (Double temperatura : temperaturas) {
			soma += temperatura;
		}
		Double media = soma/temperaturas.size();
		System.out.println("M�dia dos ultimos 6 meses: "+ media);

		for (Double temperatura : temperaturas) {
			System.out.println(temperatura > media ? temperatura : "") ;

		}

	}

}
