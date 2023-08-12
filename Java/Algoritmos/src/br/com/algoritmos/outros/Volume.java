package br.com.algoritmos.outros;


import java.util.Scanner;

public class Volume {
	   public static void main(String[] args) {
	     int altura = 0, comprimento = 0, volume = 0;
	     int largura = 0;
	 
	     System.out.println("Digite o valor da altura: ");
	     Scanner sc1 = new Scanner(System.in);
	     altura = sc1.nextInt();
	     
	     System.out.println("Digite o valor da largura: ");
	     Scanner sc2 = new Scanner(System.in);
	     largura = sc2.nextInt();

	     System.out.println("Digite o valor do comprimento: ");
	     Scanner sc3 = new Scanner(System.in);
	     comprimento = sc3.nextInt();
	     sc1.close();
	     sc2.close();
	     sc3.close();
	     volume = altura * largura * comprimento;
	     System.out.printf("O volume da caixa retangular é "+ volume);
	   }
}
