package br.com.algoritmos.outros;

import java.util.Calendar;

public class DataComCalendar {

	public static void main(String[] args) {
		// Classe abstrata. N�o instancia.
		Calendar data = Calendar.getInstance();
		
		// Exibindo a data atual do sistema
		System.out.println(data.getTime());
		
		// Diminuindo 2 meses � data atual
		data.add(Calendar.MONTH, -2);
		
		// Adicionando 3 dias � data atual
		data.add(Calendar.DATE, 3);
		
		
		//Exibindo data em v�rios formatos com printf
		System.out.printf("%tc\n", data);		//ter. ago. 09 14:07:48 BRT 2022
		
		System.out.printf("%tF\n", data);		// 2022-08-09 aaaa/mm/
		
		System.out.printf("%tD\n", data);		// 08/09/22 mm/dd/aaaa
		
		System.out.printf("%tr\n", data);		// 02:31:33 PM
		
		System.out.printf("%tT\n", data);		// 14:31:33
		

	}

}
