// Q5. Solicite o preço de uma mercadoria e o percentual de desconto. Exiba o valor do desconto e o preço a pagar
using System;
class MainClass {
  public static void Main (string[] args) {
    float preco, percentDesc, valorDesc;
    Console.Write ("Digite o valor da mercadoria: ");
    preco = float.Parse(Console.ReadLine ());
    Console.Write ("Digite o percentual de desconto: ");
    percentDesc = float.Parse(Console.ReadLine());
    valorDesc = (percentDesc * preco / 100);
    Console.WriteLine ("");
    Console.WriteLine ("Valor Produto: "+preco);
    Console.WriteLine ("Valor Desconto: "+valorDesc);
    Console.WriteLine (preco-valorDesc);
  }
} 