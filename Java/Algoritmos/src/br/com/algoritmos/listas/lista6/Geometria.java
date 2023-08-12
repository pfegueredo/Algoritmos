package br.com.algoritmos.listas.lista6;

import java.text.DecimalFormat;

public class Geometria {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.calcularArea(2);

	}

}


class Circulo {
	private double raio;
	

	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}

	void calcularArea(double valor) {
		double area = 0;
		area = Math.PI * Math.pow(valor, 2);
		DecimalFormat formato = new DecimalFormat("#.##");
		
		System.out.printf("A área do círculo é: " + formato.format(area));
	}
}
