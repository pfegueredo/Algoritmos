package br.com.algoritmos.outros;

public class Exceptions1 {
	public static void main(String[] args) {
		String nomeDoArquivo = "";
		
		try {
			imprimirArquinoNoConsole(nomeDoArquivo);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado. Procure o suporte.");
		}
	}

	private static void imprimirArquinoNoConsole(String nomeDoArquivo) {
		// TODO Auto-generated method stub
		
	}

}
