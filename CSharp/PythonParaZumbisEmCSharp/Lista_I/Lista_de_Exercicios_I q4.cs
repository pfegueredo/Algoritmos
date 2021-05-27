//Faça um programa que calcule o aumento de um salário. Ele deve solicitar o valor do salário e a porcentagem do aumento. Exiba o valor do aumento e do novo salário.
using System;
class MainClass {
  public static void Main (string[] args) {
    float novoValor, aumento, salario, percent;
    Console.Write ("Digite o valor do salário R$: ");
    salario = float.Parse(Console.ReadLine());
    Console.Write ("Digite o percentual que deseja aumentar o salario: ");
    percent = float.Parse(Console.ReadLine ());
    novoValor = salario+(salario*percent/100);
    aumento = novoValor-salario;
    Console.WriteLine ("O valor do novo salário é: "+novoValor);
    Console.Write ("O aumento dado foi de R$: "+aumento);
    Console.Write (" ");
    Console.Write ("Pressione qualquer tecla para fechar");
    Console.ReadKey();
  }
}
    