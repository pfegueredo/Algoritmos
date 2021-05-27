// Escreva um programa que leia a quantidade de dias, horas, minutos e segundos do usuário. Calcule o total em segundos

using System;
class MainClass {
  public static void Main (string[] args) {
    int dias, horas, minutos, segundos, total;
    Console.WriteLine ("** CONVERSOR DE HORAS **");
    Console.WriteLine (" ");
    
    Console.Write ("Digite quantidade de dias: ");
    dias = Convert.ToInt32(Console.ReadLine());
    
    Console.Write ("Digite quantidade de horas: ");
    horas = Convert.ToInt32((Console.ReadLine()));
    
    Console.Write ("Digite quantidade de minutos: ");
    minutos = Convert.ToInt32((Console.ReadLine()));
    
    Console.Write ("Digite quantidade de segundos: ");
    segundos = Convert.ToInt32(Console.ReadLine());
    
    total = (segundos+(minutos*60)+(horas*60*60)+(dias*60*60*24));
    Console.WriteLine("O total em segundos é: "+total+" segundos");
    
  }
}