package br.com.algoritmos.listas.lista1;

import java.util.Scanner;
/**
 * Escreva um programa que leia a quantidade de dias, horas, minutos e 
 * segundos do usuário. Calcule o total em segundos
 * @author Paulo Fegueredo
 *
 */

public class Ex03_ContarEmSegundos {
	public static void main(String[] args) {
		
	    int dias, horas, minutos, segundos, total;
	    
	    System.out.println ("** CONVERSOR DE HORAS **");
	    System.out.println (" ");

	    System.out.print ("Digite quantidade de dias: ");
	    Scanner entradaDias = new Scanner(System.in);
	    dias = entradaDias.nextInt();
	    
	    System.out.print ("Digite quantidade de horas: ");
	    Scanner entradaHoras = new Scanner(System.in);
	    horas = entradaHoras.nextInt();
	    
	    System.out.print ("Digite quantidade de minutos: ");
	    Scanner entradaMinutos = new Scanner(System.in);
	    minutos = entradaMinutos.nextInt();
	    
	    System.out.print ("Digite quantidade de segundos: ");
	    Scanner entradaSegundos = new Scanner(System.in);
	    segundos = entradaSegundos.nextInt();
	    
	    total = (segundos+(minutos*60)+(horas*60*60)+(dias*60*60*24));
	    System.out.println("O total em segundos é: "+total+" segundos"); 
	    
	    entradaDias.close();
	    entradaHoras.close();
	    entradaMinutos.close();
	    entradaSegundos.close();
	}

}
