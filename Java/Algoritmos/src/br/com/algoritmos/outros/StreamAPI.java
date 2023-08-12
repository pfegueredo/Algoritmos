package br.com.algoritmos.outros;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<String> numerosAleatorios = 
				Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("-- Imprima todos os elementos dessa lista de String:");
		System.out.println(numerosAleatorios+ "\n");
		
		System.out.println("- Usando Stream ");
		numerosAleatorios.stream().forEach(System.out::println);
		
		System.out.println("- Usando Lambda ");
		numerosAleatorios.forEach(lambda -> System.out.println(lambda));
		
		System.out.println("- Reference Method ");
		numerosAleatorios.forEach(System.out::println);
		
		
		System.out.println("Pegue os 5 �ltimos primeiros numeros e coloque dentro de um Set: ");
		numerosAleatorios.stream()
			.limit(5)
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		
		System.out.println("Transforme essa lista de String em uma lista de n�meros inteiros: ");
		List <Integer> listaInteiros =  numerosAleatorios.stream()
			.map(Integer::parseInt) //mapeia para um tipo - Inteiro
			.collect(Collectors.toList()); //Joga o resultado para uma lista
			//.forEach(System.out::println); // Depois imprime no console
		System.out.println(listaInteiros);
		
//		System.out.println("Pegue os numeros pares e coloque em uma lista: ");
//		// Forma comprida
//		List<Integer> listaInteirosv2 =  numerosAleatorios.stream()
//			.map(Integer::parseInt)
//			.filter(new Predicate<Integer>() {
//				@Override
//				public boolean test(Integer integer) {
//					if (integer % 2 == 0 && integer > 2) return true;
//					return false;
//				}
//			}).collect(Collectors.toList());
//		System.out.println(listaInteirosv2);
		
		System.out.println("Pegue os numeros pares e coloque em uma lista: ");
		// Forma curta
		List<Integer> listaInteirosv2 =  numerosAleatorios.stream()
			.map(Integer::parseInt)
			.filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
		System.out.println(listaInteirosv2);
		
		
//		System.out.println("Mostre a m�dia dos n�meros: ");
//		//Forma comprida
//		numerosAleatorios.stream()
//			.mapToInt(new ToIntFunction<String>() {
//				@Override
//				public int applyAsInt(String s) {
//					return Integer.parseInt(s);
//				}
//			});
		

//		System.out.println("Mostre a m�dia dos n�meros: ");
//		//Forma curta
//		numerosAleatorios.stream()
//			.mapToInt(Integer::parseInt)
//			.average()
//			.ifPresent(System.out::println);
		
//		System.out.println("Remova os n�meros impares");
//		// Forma comprida
//		listaInteiros.removeIf(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer integer) {
//				if (integer % 2 != 0) return true;
//				return false;
//			}
//		});
//		System.out.println(numerosAleatorios);
		
		System.out.println("Remova os n�meros impares");
		// Forma curta
		listaInteiros.removeIf(i -> (i % 2 != 0));
		System.out.println(listaInteiros);
		
		
		System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
		
		System.out.println("Retirando os n�meros repetidos da lista, quantos n�meros ficam?");
		
		System.out.println("Mostre o menor valor da lista: ");
		
		System.out.println("Mostre o maior valor da lista: ");
		
		System.out.println("Peque apenas os n�meros �mpares e some ");
		
		System.out.println("Mostre a lista na ordem numerica ");
		
		System.out.println("Agrupe os valores impares multiplos de 3 e 5: ");
		//dica: collect(Collectors.groupingBy(new Function)
	}
}
