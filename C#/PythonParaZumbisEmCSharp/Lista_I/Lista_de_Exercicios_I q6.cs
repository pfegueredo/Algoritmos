//Q6. Calcule o tempo de uma viagem de carro. Pergunte a dist�ncia a percorrer e a velocidade m�dia esperada para a viagem. 
using System;
class MainClass {
  public static void Main (string[] args) {
    int tempoViagemh, tempoViagemm, distancia, velocidade;
    Console.Write ("Dist�ncia a percorrer (km): ");
    distancia = Convert.ToInt32(Console.ReadLine ());
    Console.Write ("Velocidade M�dia (km/h): ");
    velocidade = Convert.ToInt32(Console.ReadLine ());
    tempoViagemh = distancia / velocidade;
    tempoViagemm = distancia % velocidade;
    Console.WriteLine ("Tempo de viagem estimado � (h:mm): " + tempoViagemh +":"+tempoViagemm);

  }
}
      