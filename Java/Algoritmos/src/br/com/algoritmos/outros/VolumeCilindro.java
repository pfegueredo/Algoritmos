package br.com.algoritmos.outros;

import java.util.Scanner;

public class VolumeCilindro {

  public static void main(String[] args) {

    float raio;
    float altura;
    float PI = 3.14F;
    float volume;

    System.out.println("Digite o valor do raio do cilindro: ");
    Scanner sc1 = new Scanner(System.in);
    raio = sc1.nextFloat();

    System.out.println("Digite o valor da altura do cilindro: ");
    Scanner sc2 = new Scanner(System.in);
    altura = sc2.nextFloat();
    
    volume = (float) (PI * (Math.pow(raio, 2))*altura);     
    System.out.println("O volume é: "+ volume);
    sc1.close();

  }

}
