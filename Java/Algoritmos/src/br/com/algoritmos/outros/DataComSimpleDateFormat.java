package br.com.algoritmos.outros;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataComSimpleDateFormat {

	public static void main(String[] args) {
		Date dataAtual = new Date();
		
		SimpleDateFormat definirFormato = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataFormatada = definirFormato.format(dataAtual);
		
		System.out.println(dataFormatada);
		
	}

}
