package br.com.algoritmos.provas.prova2;

import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
//		String[] nomes = {"Paulo", "Raquel"};
//		System.out.println(nomes);
		int contador = 0;
		String[] nomeCompleto = "Paulo Francisco Souza Fegueredo".split(" ");
		String fullName = "Paulo Francisco Souza Fegueredo";
		int[] arr_numbers = {1,2,3,4,5,6,7,8,9,10};
		for(int numero: arr_numbers) {
			contador = contador+ numero;
		}
		System.out.println(contador);
//		System.out.println(nomeCompleto);
		String novoNome = "";
		for(String nome: nomeCompleto) {
			System.out.println(nome);
			novoNome = String.join(" ", nome);
		}
		System.out.println("Novo nome "+novoNome);
		
		List<String> lista = new ArrayList<>();
		//lista =  Arrays.asList(nomeCompleto);
		
		for(String nom: lista) {
			System.out.println(nom);
		}
//		for(String nome: nomes) {
//			System.out.println(nome);
//		}
		
		
	}

}
