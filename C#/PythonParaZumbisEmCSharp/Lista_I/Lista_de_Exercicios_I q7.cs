//Q7. Converta uma temperatura digitada em Celsius para Fahrenheit. F = 9*C/5 + 32
using System;
class MainClass {
  public static void Main (string[] args) {
    float Celsius, Fahrenheit;
    Console.Write ("Digite a temperatura (Celsius): ");
    Celsius = float.Parse(Console.ReadLine ());
    Fahrenheit = 9*Celsius/5+32;
    Console.Write("Fahrenheit "+Fahrenheit);
  }
}   