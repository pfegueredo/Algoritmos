using System;
/*
Crie um programa onde um entregador pergunta para alguns Moradores se no imóvel
tem ou não cachorro...Se não tiver cachorro, ele “Entrega a Correspondência” , se
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
    public class Moradores
    {
        public string Nome { get; set; }
        private string Telefone { get; set; }
        private int NumeroResidencia { get; set; }

        public Moradores(string Nome, string Telefone, int NumeroResidencia)
        {
            this.Nome = Nome;
            this.Telefone = Telefone;
            this.NumeroResidencia = NumeroResidencia;
        }
        public void informarDados(string Nome)
        {
            this.Nome = Nome;
            this.Telefone = Telefone;
            this.NumeroResidencia = NumeroResidencia;

        }
    }


}