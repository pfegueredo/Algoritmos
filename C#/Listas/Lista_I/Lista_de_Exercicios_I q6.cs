//Q6. Calcule o tempo de uma viagem de carro. Pergunte a distância a percorrer e a velocidade média esperada para a viagem. 
using System;
class MainClass {
  public static void Main (string[] args) {
    int tempoViagemh, tempoViagemm, distancia, velocidade;
    Console.Write ("Distância a percorrer (km): ");
    distancia = Convert.ToInt32(Console.ReadLine ());
    Console.Write ("Velocidade Média (km/h): ");
    velocidade = Convert.ToInt32(Console.ReadLine ());
    tempoViagemh = distancia / velocidade;
    tempoViagemm = distancia % velocidade;
    Console.WriteLine ("Tempo de viagem estimado é (h:mm): " + tempoViagemh +":"+tempoViagemm);

  }
}
      