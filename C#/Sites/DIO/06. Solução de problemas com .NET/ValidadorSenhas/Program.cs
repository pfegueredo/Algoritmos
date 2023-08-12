using System;
using System.Linq;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace ValidadorSenhas
{
    class Program
    {

        static void Main(string[] args)
        {
            List<string> Senhas = new List<string>();
            string input;

            int CasosDeTestes = 0;

            while (!string.IsNullOrEmpty(input = Console.ReadLine()))
            {
                Senhas.Add(input);
                CasosDeTestes = CasosDeTestes + 1;
            }


            for (int i = 0; i < CasosDeTestes; i++)
            {
                verifica(Senhas[i]);

            }

            Console.ReadKey();
        }

        static void verifica(string senha)
        {
            if (contemLetrasMaiusculas(senha) && contemNumeros(senha) && contemCaracteres(senha) && tamanho(senha) && espaco(senha) && contemCaracteres2(senha))
            {
                Console.WriteLine("Senha valida.");
            }
            else
            {
                Console.WriteLine("Senha invalida.");
            }
        }

        public static bool contemLetrasMaiusculas(string senha)
        {
            if ((senha.Where(c => char.IsUpper(c)).Count() > 0) && (senha.Where(c => char.IsLower(c)).Count() > 0))
                return true;
            else
                return false;
        }
/*
        public static bool contemLetrasMinusculas(string senha)
        {
            if (senha.Where(c => char.IsLower(c)).Count() > 0)
                return true;
            else
                return false;
        }
*/
        public static bool contemNumeros(string senha)
        {
            if (senha.Where(c => char.IsNumber(c)).Count() > 0)
                return true;
            else
                return false;

        }

        public static bool contemCaracteres(string senha)
        {
            if (!senha.Any(c => char.IsSymbol(c)))
                return true;
            else
                return false;
        }

        public static bool contemCaracteres2(string senha)
        {
            if (!Regex.IsMatch(senha, @"[.*!+.*]+"))
                return true;
            else
                return false;
        }
        public static bool tamanho(string senha)
        {
            if (senha.Length > 5 && senha.Length < 33)
                return true;
            else
                return false;
        }

        public static bool espaco(string senha)
        {
            if (!senha.Any(c => char.IsWhiteSpace(c)))
                return true;
            else
                return false;
        }
    }
}
