/*
Codewriting

CodeSignal - colocar em algoritmos

Você recebe uma string s que consiste apenas em letras minúsculas do português. Se as vogais ('a', 'e', 'i', 'o' e 'u') recebem um valor de '1' e as consoantes recebem um valor de '2', retorne a soma de todas as letras na string de entrada.

Exemplo

Para s = "a", a saída deve ser
conteVogalConsoante(s) = 1;

Para s = "abcde", a saída deve ser
conteVogalConsoante(s) = 8.

As letras em s, convertidas em1 e 2 e somadas conforme descrito acima:
1 + 2 + 2 + 2 + 1 = 8.

Entrada / Saída

[execution time limit] 3 seconds (cs)

[input] string s

Uma string que consiste apenas em letras minúsculas do português.

Restrições garantidas: *
0 ≤ s.length ≤ 104.
[output] integer

string helloWorld(string name) {
    Console.Write("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

*/

package br.com.algoritmos;

public class conteVogalConsoante {
	public static void main(String[] args) {
	
	contaVogalEConsoante("Paulo");
		
	
	}

	static void contaVogalEConsoante(String texto) {
	
		int conteVogal = 0;
		int conteConsoante = 0;
		int soma = 0;
		String letra;
		
		for (int i = 0; i < texto.length(); i++) {
			letra = texto.substring(i, i+1);
			if ( letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
				conteVogal = conteVogal+1;
				
			} else if (!letra.equals("a") && !letra.equals("e") && !letra.equals("i") && !letra.equals("o") && !letra.equals("u")){
				conteConsoante++;
			}
			
		}
		
		soma = conteVogal + conteConsoante;
		System.out.println("Vogais: " + conteVogal);
		System.out.println("Consoantes: " + conteConsoante);
		System.out.println("Total de caracteres: " + soma);
	}
	
	
}


