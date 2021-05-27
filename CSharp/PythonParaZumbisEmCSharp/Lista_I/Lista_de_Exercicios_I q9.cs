//Q. 9)  Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado pelo usuário, assim como a quantidade de dias pelos quais o carro foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$ 60,00 por dia e R$ 0,15 por km rodado.
using System;
class MainClass {
  public static void Main (string[] args) {
    double kmPercorrido, diasAlugados, valorTotal;
    Console.Write ("Quantos km foram rodados? ");
    kmPercorrido = Convert.ToDouble(Console.ReadLine());
    Console.Write ("Durante quantos dias? ");
    diasAlugados = Convert.ToDouble(Console.ReadLine());
    valorTotal = (diasAlugados*60.00) + (0.15*kmPercorrido);
    Console.Write ("Total a pagar: R$ "+valorTotal);
  }
}