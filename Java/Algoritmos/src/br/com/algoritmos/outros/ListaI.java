package br.com.algoritmos.outros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListaI {

	public static void main(String[] args) {
		
		/*
		// Populando a List com Arrays.asList, n�o � mais possivel adicionar ou remover itens
		//List<String> minhaLista = Arrays.asList("Maria", "Raimunda", "Paulo");
		 * indexOf
		 * add
		 * set
		 * contains
		 * toString
		 * get
		 * Collections.min
		 * Collections.max
		 * iterator
		 * size
		 * remove
		 * iterator().remove
		 * clear
		 * isEmpty
		*/
		List<String> minhaLista = new ArrayList<>() {{
			add("Maria");
			add("Raimunda");
			add("Paulo");
		}};
		
		System.out.println(minhaLista.isEmpty() ? ("Lista fazia") :  minhaLista.remove(1));
		
		System.out.println(minhaLista);
		//System.out.println(minhaLista.indexOf("Maria"));
		minhaLista.clear();
		
		
		for(String item: minhaLista) {
			System.out.println(item);
		}
		
		if (minhaLista.contains("Raimunda")) {
			System.out.println("Paulo est� na lista");
		} else {
			System.out.println("Raimunda n�o est� na lista");
		}
		
		List<Double> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(50.0);
		listaNumeros.add(25d);
		listaNumeros.add(13.0);
		
		Double soma = 0.0;
		Iterator<Double> iterator = listaNumeros.iterator();
		
		while (iterator.hasNext()) {
			Double proximo = iterator.next();
			soma += proximo;
		}
		System.out.println("A soma dos numeros �: "+ soma);
		
		System.out.println(Collections.max(listaNumeros));
		
//		try {
//			System.out.println("Posi��o 0: " + minhaLista.get(0));
//		} catch (Exception e) {
//			System.out.println("Ocorreu um erro inesperado");
//			//e.printStackTrace();
//		}
		

		
		List<Gato> gatos = new LinkedList<Gato>() {{
			add(new Gato("Zaquel", 10, "Amarelo"));
			add(new Gato("Bernardo", 12, "Zebrado"));
			add(new Gato("Abel", 6, "Cinza"));
		}};

		
//		for(Gato gato: gatos) {
//			System.out.println(gato.getNome()+ " "+ gato.getIdade());
//		}
		
		System.out.println("--\tOrderm de Inser��o\t--");
		System.out.println(gatos + "\n");
		
		System.out.println("--\tOrderm Aleat�ria\t--");
		Collections.shuffle(gatos);
		System.out.println(gatos + "\n");
		
		// Ordenar objeto por nome, usando a interface Comparable na classe
		System.out.println("--\tOrderm Alfab�tica - Nome\t--");
		Collections.sort(gatos);
		System.out.println(gatos + "\n");
		
		
		System.out.println("--\tOrderm de Idade\t--");
		//ComparatorIdade comparatorIdade = ;
		Collections.sort(gatos, new ComparatorIdade());
		System.out.println(gatos + "\n");
		
		System.out.println("--\tOrderm de Cor\t--");
		//ComparatorIdade comparatorIdade = ;
		Collections.sort(gatos, new ComparatorCor());
		System.out.println(gatos + "\n");

		System.out.println("--\tOrderm de NomeCorIdade\t--");
		//ComparatorIdade comparatorIdade = ;
		Collections.sort(gatos, new ComparatorNomeCorIdade());
		System.out.println(gatos + "\n");

		
		List<String> listaAlfabeto = new ArrayList();
		listaAlfabeto.add("E");
		listaAlfabeto.add("D");
		listaAlfabeto.add("C");
		listaAlfabeto.add("B");
		listaAlfabeto.add("A");
		
		System.out.println(listaAlfabeto);
		
		// Ordenar aleatoriamente
		Collections.shuffle(listaAlfabeto);
		System.out.println(listaAlfabeto);
		
		// Ordenar alfabeticamente
		Collections.sort(listaAlfabeto);
		System.out.println(listaAlfabeto);
		
		

		
	}

}


class Gato implements Comparable<Gato> {
	String nome;
	Integer idade;
	String cor;
	
	Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
		
	}
	
	public String getCor() {
		return this.cor;
		
	}

	
	@Override
	public String toString() {
		return "Nome: "+ nome + " Idade: " + idade + " Cor:"+ cor;
	}
	
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}


class ComparatorIdade implements Comparator<Gato> {
	
	@Override
	public int compare(Gato g1, Gato g2) {
	return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato> {
	
	@Override
	public int compare(Gato g1, Gato g2) {
	return g1.getCor().compareToIgnoreCase(g2.getCor());
			//Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
	
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}