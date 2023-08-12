using System;
using System.Collections.Generic;
/*
Crie um programa onde um entregador pergunta para alguns Moradores se no imóvel
tem ou não cachorro...Se não tiver cachorro, ele “Entrega a Correspondência”, se
tiver cachorro ele “Não Entrega a Correspondência”. Por fim mostre o resultado de
quantas correspondências foram entregues em casas de número ímpar.

Regras:
• É obrigatório criar uma classe para representar Moradores.
• A classe deverá possuir dois dados privados: telefone e número da residência.
• A classe deverá possuir métodos de acesso para permitir que o usuário
armazene/leia os dados dos dois dados privados. 
*/
namespace Questao_03
{
    class Program
    {
        static List<Moradores> listaMoradores = new List<Moradores>();
        static void Main(string[] args)
        {
            string resposta = "";
            int contador = 0;
            Console.WriteLine("Controle de entrega de correspondencias");
            Console.WriteLine("");
            Console.WriteLine("Para sair, digite sair");
            Console.WriteLine("");

            
                Console.WriteLine("O imóvel tem ou não cachorro?");
                resposta = Console.ReadLine();
                
                if (resposta == "sim")
                {
                    Console.WriteLine("Qual seu nome ? ");
                    string nome = Console.ReadLine();
                    Console.WriteLine("Qual seu telefone ? ");
                    string telefone = Console.ReadLine();
                    Console.WriteLine("Qual o numero da sua residencia ? ");
                    int NumeroResidencia = int.Parse(Console.ReadLine());
                    if ((NumeroResidencia % 2) != 0)
                    {
                        contador = +1;
                    }
                    Console.WriteLine("Correspondência entregue");
                }
                else if(resposta == "nao") 
                {
                    Console.WriteLine("Correspondencia NÃO entregue");
                }
                Console.WriteLine("O total de correspondencias que foi entregue {0}", contador);
            //}
        }
    }
}
