package br.com.algoritmos.outros;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<String> aa = new LinkedList<>();
		aa.add("Paulo");
		aa.add("Raquel");
		aa.add("Beethoven");
		aa.add("Rio Branco");
		
		List<String> aa2 = new LinkedList<>();
		aa2.add("Paulo");
		aa2.add("Raquel");
		aa2.add("Beethoven");
		
		System.out.println("baa contém todos os elementos de aa2? ");
		if (aa.containsAll(aa2)) {
			System.out.println("Sim. Com certeza");
		} else {
			System.out.println("Não contém");
		}
		
		System.out.println(aa2.retainAll(aa));
		System.out.println(aa2);
	}

}
