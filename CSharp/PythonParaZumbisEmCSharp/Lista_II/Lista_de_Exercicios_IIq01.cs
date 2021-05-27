// Q1. L2 1. Faça um Programa que peça os três lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo se o mesmo é: equilátero, isósceles ou escaleno.
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
   
     Console.Write("Não é possivel construir um tringulo com os lados fornecidos");      

   else if ((lado1 == lado2) && (lado1 == lado3))

      Console.WriteLine("Esse é um tringulo Equilátero!");   
    else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))

        Console.WriteLine("Esse é um tringulo Isóceles!");   

    else  

    	Console.WriteLine("Esse é um tringulo Escaleno!");
 }
}
