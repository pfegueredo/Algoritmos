/*
Bootcamp: LocalizaLabs
Nível:básico

Desafio
Pink e Cérebro dividem um apartamento e estão juntos 24h por dia desde o começo da pandemia. Para passar o temp, Pink cria problemas matemáticos para Cérebro resolver, o último deles foi uma lista de números com a seguinte pergunta: quantos números da lista são múltiplos de 2, 3, 4 e 5?

Apesar de parecer simples, porém, quando a lista contém muitos números, Cérebro se confunde e acaba errando alguns cálculos.

Ajude Cérebro a resolver o desadio de Pink.

Entrada
A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Pink.

A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Pink.

Saída
Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente.

 
Exemplo de Entrada	
5
2 5 4 20 10

Exemplo de Saída
4 Multiplo(s) de 2
0 Multiplo(s) de 3
2 Multiplo(s) de 4
3 Multiplo(s) de 5
*/


using System;

class MinhaClasse {
  public static void Main (string[] args) {
    int n, mult2, mult3, mult4, mult5;
    var totalDeCasosDeTeste = int.Parse(Console.ReadLine());
    string[] valores = Console.ReadLine().Split();
    mult2 = 0;
    mult3 = 0;
    mult4 = 0;
    mult5 = 0;

            for (int i = 0; i < totalDeCasosDeTeste; i++)
            {
            n = int.Parse(valores[i]);
            if (n % 2 == 0)
            mult2 += 1; 
            
            if (n % 3 == 0)
            mult3 += 1;

            
            if (n % 4 == 0)
            mult4 += 1;

            
            if (n % 5 == 0)
            mult5 += 1;


            }
            Console.WriteLine("{0} Multiplo(s) de 2", mult2);
            Console.WriteLine("{0} Multiplo(s) de 3", mult3);
            Console.WriteLine("{0} Multiplo(s) de 4", mult4);
            Console.WriteLine("{0} Multiplo(s) de 5", mult5);
  }
}