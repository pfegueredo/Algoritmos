package br.com.algoritmos.outros;

import java.util.Scanner;
import java.io.IOException;


public class Ex2Sorteio {

	/*
		Fazer uma classe Ex2Sorteio para:
		• Sortear um número de 0 a 1000 (dica: usar Math.random())
		• Pedir um palpite ao usuário. Se ele errar, informar se o 
		  palpite é maior ou menor do que o número sorteado.
		• Pedir novos palpites até que o usuário acerte e, depois disso, 
		  mostrar em quantas tentativas ele acertou
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		boolean acertou = false;
        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        
        System.out.println("SORTEIO DE 1 A 1000");
        final String os = System.getProperty("os.name");
		System.out.println("Sistema Operacional: " + os);
        
        while (!acertou) {
			
			
			System.out.println("Adivinhe qual valor vai aparecer: ");
			Scanner entradaUsuario = new Scanner(System.in);
			int usuario = entradaUsuario.nextInt();
			int sorteado = (int) (Math.random() * range) + 1;
			if (usuario == sorteado) {
				System.out.println("Você digitou "+usuario +" e o valor sorteado foi "+sorteado+". Parabéns, você acertou.\n");
				acertou = true;
			} else if(usuario == 0) {
				System.out.println("Aplicativo finalizado com sucesso.");
				break;
			}
			else {
				System.out.println("Você digitou "+usuario +" e o valor sorteado foi "+sorteado+". Não foi dessa vez. Tente novamente.\n");
				//try {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					//Runtime.getRuntime().exec("cls");
				//} catch (IOException e) {
					System.out.println("Ocorreu um erro ao limpar a tela");
				//}
				continue;
			}
		}
	}

}
