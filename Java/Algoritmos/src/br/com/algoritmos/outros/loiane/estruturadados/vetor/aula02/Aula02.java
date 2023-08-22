package br.com.algoritmos.outros.loiane.estruturadados.vetor.aula02;

import br.com.algoritmos.outros.loiane.estruturadados.vetor.Vetor;

public class Aula02 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		try {
			vetor.adiciona("Teste1");
			vetor.adiciona("Teste2");
			System.out.println(vetor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(vetor);
		
		//Busca pela posição do vetor
		System.out.println(vetor.busca(1));
		System.out.println(vetor.busca("Test"));
		
	}
}
