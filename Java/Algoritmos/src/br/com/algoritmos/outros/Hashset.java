package br.com.algoritmos.outros;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Primeiro");
		set.add("Segundo");
		
		set.remove("Primeiro");
		System.out.println(set.contains("Primeiro"));
		System.out.println(set);
	}

}
