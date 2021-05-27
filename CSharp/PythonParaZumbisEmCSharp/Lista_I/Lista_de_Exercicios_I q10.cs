//  Q.10 Escreva um programa para  calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dia e quantos anos ele já fumou. Considere que um fumante perde 10 minutos de vida a cada cigarro, calcule quantos dias de vida um fumante perderá. Exiba o total de dias. 
using System;
class MainClass {
  public static void Main (string[] args) {
    decimal anos, cigPorDia, qtdeCigarros, tempoPerdido;
    Console.Write ("Quantos cigarros fuma ao dia? ");
    cigPorDia = Convert.ToInt32(Console.ReadLine ());
    
    Console.Write ("Há quantos anos você fuma? ");
    anos = Convert.ToInt32(Console.ReadLine ());
    
    qtdeCigarros = anos*365*cigPorDia;
    
    tempoPerdido = qtdeCigarros*10/60/24;
    
    Console.WriteLine("Perdeu "+tempoPerdido+" dias de vida" );
    
  }
}
      