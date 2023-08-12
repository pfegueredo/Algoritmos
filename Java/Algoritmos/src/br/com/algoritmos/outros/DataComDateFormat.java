package br.com.algoritmos.outros;

import java.text.DateFormat;
import java.util.Date;

public class DataComDateFormat {

	public static void main(String[] args) {
		Date dataAtual = new Date();
		
		//Sa�da padr�o do DateFormat: 06/10/2022 15:04
		String dateToStr = DateFormat.getInstance().format(dataAtual);
		System.out.println(dateToStr);
		
		//Sa�da formatada completa: 6 de outubro de 2022 15:04
		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT)
				.format(dataAtual);
		System.out.println(dateToStr);
		
		
		// Flexibilidade no formato da data: SIMPLEDATEFORMAT
		
		
	}
	

}
