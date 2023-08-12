package br.com.algoritmos.outros;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataComLocalDateTime {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalTime agora = LocalTime.now();
		LocalDateTime dataHora = LocalDateTime.now();
		
		hoje = hoje.plusDays(1);
		
		System.out.println(hoje);
		System.out.println(agora);
		System.out.println(dataHora);
		
	}

}
