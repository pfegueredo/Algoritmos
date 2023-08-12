package br.com.algoritmos.outros;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa {

	public static void main(String[] args) {

		/*
		 * toString, put, containsKey, get, keySet, values, entrySet, getValue, iterator
		 */
		System.out.println("Crie um dicion�rio que relacione os modelos e consumos:");
		Map<String, Double> carrosPopulares = new HashMap<>();
		
		carrosPopulares.put("gol", 14.4);
		carrosPopulares.put("uno", 15.6);
		carrosPopulares.put("mobi", 16.1);
		carrosPopulares.put("hb20", 14.5);
		carrosPopulares.put("kwid", 15.6);
		
		System.out.println(carrosPopulares);
		
		System.out.println("Substitua o consumo do gol por 15,2 km/h: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares.get("gol") + "\n");
		
		System.out.println("Confira se o tucson est� no dicion�rio: ");
		System.out.println(carrosPopulares.containsKey("tucson") ? "Esta na lista\n" : "N�o est� na lista\n");
		
		System.out.println("Exiba os consumos dos carros: ");
		System.out.println(carrosPopulares.values() + "\n");
		
		System.out.println("Exiba os modelos: ");
		System.out.println(carrosPopulares.keySet()+"\n");
		
		System.out.println("Exiba o modelo mais economico e seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entradas = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		for (Map.Entry<String, Double> entry : entradas) {
			if (entry.getValue().equals(consumoMaisEficiente))
				modeloMaisEficiente = entry.getKey();
		}
		
		System.out.println("Modelo mais eficiente: "+ modeloMaisEficiente + " consumo: "+ consumoMaisEficiente);
		
		System.out.println("Exiba a soma dos consumos: ");
		Double soma = 0.0; 
		carrosPopulares.values();
		
		
		
		System.out.println("Exiba a m�dia dos consumos deste modelo de carros: ");
		
		System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: ");
	}

}
