//Escreva um programa que leia um valor em metros e o exiba convertido em milímetros
//Autor: Paulo Fegueredo
using System;
class MainClass {
  public static void Main (string[] args) {
        Console.WriteLine ("** CONVERSOR DE METROS EM MILIMETROS");
        Console.WriteLine ("");
        Console.Write ("Digite um valor para converter: ");
    	int num1 = Convert.ToInt32(Console.ReadLine ());
    	int num2 = num1*1000;
    	Console.WriteLine ("");
    	Console.WriteLine(num1+"m em milimetros é: " + num2+"mm");
    	Console.WriteLine ("");
    	Console.WriteLine ("Programa Finalizado");
    
  }
}