package br.com.algoritmos.outros.loiane.estruturadados.vetor;

import java.util.Arrays;
import java.lang.StringBuilder;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		tamanho = 0;
	}

	// A lógica desse método, percorre o array inteiro toda vez, deixando o lento.
	public void adicionaRuim(String elemento) {
		for(int i = 0; i < elementos.length; i++) {
			if(elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	//Lógica armazenando o tamanho do vetor.
	public void adiciona(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			tamanho++;
		} else 
			throw new Exception("O vetor está cheio. Não é possivel adicionar novos elementos");
	}
	
	// Com essa lógica, retorna um booleano.
	public boolean adicionaBoolean(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			tamanho++;
			return true;
		} 
		return false;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		//return Arrays.toString(elementos);
		
		//Lógica para mostrar só os elementos que existem no array.
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for(int i=0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
	}
	
	
	/**
	 * Busca pelo posição do vetor
	 * @parametro elemento
	 * @retorna String
	 */
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição não existe");
		} 
		return this.elementos[posicao];
	}
	
	/**
	 * Busca pelo elemento
	 * @parametro elemento
	 * @retorna String
	 */
	public int busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
}
