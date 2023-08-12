/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

 
Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, que pode ser maior ou igual a zero, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
400.00			Novo salario: 460.00
			Reajuste ganho: 60.00
			Em percentual: 15 %

*/

using System;
using System.Globalization;

class MinhaClasse

{



  static void Main(string[] args)

  {



    double salario, reajuste, novoSalario;

    salario = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);



    if (salario >= 0.00 && salario <= 400)

    {

      int percentual = 15;

      reajuste = salario * percentual / 100.00;

      novoSalario = reajuste + salario;

      Console.WriteLine("Novo salario: " + novoSalario.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Em percentual: " + percentual + " %");



    }

    else if (salario >= 400.01 && salario <= 800.00)

    {

      int percentual = 12;

      reajuste = salario * percentual / 100.00;

      novoSalario = reajuste + salario;

      Console.WriteLine("Novo salario: " + novoSalario.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Em percentual: " + percentual + " %");

    }

    else if (salario >= 800.01 && salario <= 1200.00)

    {

      int percentual = 10;

      reajuste = salario * percentual / 100.00;

      novoSalario = reajuste + salario;

      Console.WriteLine("Novo salario: " + novoSalario.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Em percentual: " + percentual + " %");

    }

    else if (salario > 1200.01 && salario <= 2000.00)

    {

      int percentual = 7;

      reajuste = salario * percentual / 100.00;

      novoSalario = reajuste + salario;

      Console.WriteLine("Novo salario: " + novoSalario.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Em percentual: " + percentual + " %");

    }

    else if (salario > 2000.00)

    {

      int percentual = 4;

      reajuste = salario * percentual / 100.00;

      novoSalario = reajuste + salario;

      Console.WriteLine("Novo salario: " + novoSalario.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2", CultureInfo.InvariantCulture));

      Console.WriteLine("Em percentual: " + percentual + " %");



    }

  }



}