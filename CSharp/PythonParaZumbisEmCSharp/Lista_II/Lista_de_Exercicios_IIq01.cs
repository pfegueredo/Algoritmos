// Q1. L2 1. Fa�a um Programa que pe�a os tr�s lados de um tri�ngulo. O programa dever� informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo se o mesmo �: equil�tero, is�sceles ou escaleno.
using System;
class MainClass {
  public static void Main (string[] args) {
    int lado1, lado2, lado3;
    Console.Write ("Digite o lado 1:");
    lado1 = Convert.ToInt32(Console.ReadLine());
    Console.Write ("Digite o lado 2:");
    lado2 = Convert.ToInt32(Console.ReadLine());
    Console.Write ("Digite o lado 3:");
    lado3 = Convert.ToInt32(Console.ReadLine());
   
   if ((lado1 > (lado2+lado3)) || (lado2 > (lado1+lado3)) || (lado3>(lado1+lado2))) 
   
     Console.Write("N�o � possivel construir um tringulo com os lados fornecidos");      

   else if ((lado1 == lado2) && (lado1 == lado3))

      Console.WriteLine("Esse � um tringulo Equil�tero!");   
    else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))

        Console.WriteLine("Esse � um tringulo Is�celes!");   

    else  

    	Console.WriteLine("Esse � um tringulo Escaleno!");
 }
}
