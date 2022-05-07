
using System;
using System.Collections.Generic;

namespace GFTBrasil
{
    class Program
    {

        static void Main(string[] args)
        {
            string OpcaoUsuario = ObterOpcaoUsuario();

            try
            {
                while (OpcaoUsuario.ToUpper() != "3")
                {

                    switch (OpcaoUsuario)
                    {
                        case "1":
                            Idade();
                            break;
                        case "2":
                            Imc();
                            break;

                        default:
                            throw new ArgumentOutOfRangeException();

                    }
                    OpcaoUsuario = ObterOpcaoUsuario();
                }
            }
            catch
            {
                Console.WriteLine("Opção inválida");
                OpcaoUsuario = ObterOpcaoUsuario();
            }
            Console.WriteLine("Obrigado por utilizar os nossos serviços");
            Console.ReadLine();
        }

        private static void Idade()
        {
            Console.Write("Digite o ano de nascimento: ");
            int anoNascimento = int.Parse(Console.ReadLine());

            Console.Write("Digite o ano de atual: ");
            int anoAtual = Int32.Parse(Console.ReadLine());
            int idade = anoAtual - anoNascimento;

            Console.WriteLine("Sua idade é " + idade.ToString());
        }

        private static void Imc()
        {
            Console.Write("Digite a altura: ");
            double altura = double.Parse(Console.ReadLine());

            Console.Write("Digite o peso: ");
            double peso = double.Parse(Console.ReadLine());

            double imc = peso / (altura * altura);
            Console.WriteLine("Seu indice IMC é " + imc);


        }

        private static string ObterOpcaoUsuario()
        {
            Console.WriteLine();
            Console.WriteLine("GFT Brasil a seu dispor!!!");
            Console.WriteLine();
            Console.WriteLine("Informe a opção desejada:");

            Console.WriteLine("1- Idade");
            Console.WriteLine("2- IMC");
            Console.WriteLine("3- Sair");
            Console.WriteLine();

            string OpcaoUsuario = Console.ReadLine().ToUpper();
            Console.WriteLine();

            return OpcaoUsuario;

        }
    }
}
