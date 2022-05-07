//Faça um programa que peça dois números inteiros e imprima a soma desses dois números
//Autor: Paulo Fegueredo
using System;
class MainClass {
  public static void Main (string[] args) {
        Console.Write ("Digite o numero 1:");
    	int num1 = Convert.ToInt32(Console.ReadLine ());
    	Console.Write ("Digite o numero 2:");
    	int num2 = Convert.ToInt32(Console.ReadLine ());
    	int soma = num1+num2;
    	Console.Write("A soma dos dois números é: " + soma);
    
  }
}