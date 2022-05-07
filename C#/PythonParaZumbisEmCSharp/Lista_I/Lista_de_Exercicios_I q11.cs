//  Q.11  Sabendo que str( ) converte valores numéricos para string, calcule quantos dígitos há em 2 elevado a um milhão. 
using System;
class MainClass {
  public static void Main (string[] args) {
    int calc;
    string a, b;
    
    calc = 2^1000000;
    a = Convert.ToString(calc);
    //b = leng(a);
   
    
    Console.Write("Há "+a.Length+" dígitos em 2 elevado ao um milhao");
   
    
  }
}      