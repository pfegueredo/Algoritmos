//  Q.11  Sabendo que str( ) converte valores num�ricos para string, calcule quantos d�gitos h� em 2 elevado a um milh�o. 
using System;
class MainClass {
  public static void Main (string[] args) {
    int calc;
    string a, b;
    
    calc = 2^1000000;
    a = Convert.ToString(calc);
    //b = leng(a);
   
    
    Console.Write("H� "+a.Length+" d�gitos em 2 elevado ao um milhao");
   
    
  }
}      