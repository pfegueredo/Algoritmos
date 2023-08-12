package br.com.algoritmos.outros;

import java.time.Instant;
import java.util.Date;

public class DataComDate {

	public static void main(String[] args) {
		Date dataAtual = new Date();
		System.out.println("Data atual: " + dataAtual);
		
		Long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println("Data atual em timestemp: " + currentTimeMillis);
		
		Date dataTimestemp = new Date(currentTimeMillis);
		System.out.println("Data baseado em timestemp:" + dataTimestemp);
		
		Date dataNoPassado = new Date(166507151L);
		
		boolean dataAtualPosteriorADataComparada = dataAtual.after(dataNoPassado);
		System.out.println(dataAtualPosteriorADataComparada ? "Sim" : "N�o");
		
		// Comparando uma data com a outra usando Equals
		Date data1 = new Date(1665071947710L);
		Date data2 = new Date(1665071947710L);
		
		if (data1.equals(data2)) {
			System.out.println("A data � igual");
		} else {
			System.out.println("A data n�o � igual");
		}
		
		// Comparando uma data com a outra usando o CompareTo
		int compare1 = data1.compareTo(data2); // datas iguais retorna 0
		System.out.println(compare1);
		
		
		Date dataPassado = new Date(1665071947709L);
		Date dataFuturo = new Date(1665071947710L);
		int compare2 = dataPassado.compareTo(dataFuturo); //Passado com futuro retorna -1
		System.out.println(compare2);
		
		int compare3 = dataFuturo.compareTo(dataPassado); //Futuro com passado retorna 1
		System.out.println(compare3);
		
		
		// Usando o Instant
		
		Date data3 = new Date(1665071947709L);
		System.out.println(data3);
		Instant dataComInstant = data3.toInstant();
		String data = dataComInstant.toString().replace("T", " ").replace("Z", " ");
		System.out.println(data);
		System.out.println(dataComInstant);
		
		// Formato deprecated
		@SuppressWarnings("deprecation")
		Date data4 = new Date(2009, 9, 10);
		System.out.println(data4);
	
		
	}

}
