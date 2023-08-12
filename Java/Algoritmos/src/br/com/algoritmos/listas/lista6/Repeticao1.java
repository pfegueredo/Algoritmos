package br.com.algoritmos.listas.lista6;

public class Repeticao1 {
	
public static void main(String[] args) {
	ordenar(5, 2);
}

public static void ordenar(int valor, int ordem) {
	
	if(ordem == 1) {
		System.out.println("Orderm crescente escolhida: ");
		for(int i = 0; i <= valor; i++) {
			System.out.println(i);
		}
	} else if (ordem == 2) {
		System.out.println("Ordem decrescente escolhida: ");
		for (int i = valor; i>=0; i--) {
			System.out.println(i);
		}
	}
}
}
