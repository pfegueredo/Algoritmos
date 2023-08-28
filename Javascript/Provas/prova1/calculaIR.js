// Concurso: Prefeitura de Bauru
// 01) Escreva e compile um programa que calcule o imposto de renda de um trabalhador que
// recebe R$ 6.000,00 mensais conforme a tabela de imposto de renda pessoa física a seguir.
// (cálculo para desconto em folha no mês, sem computar deduções).
// Tabela a ser utilizada para cálculo:

// Base de Cálculo (R$)         Alíquota (%)
// Até 1.903,98
// De 1.903,99 até 2.826,65     7,5
// De 2.826,66 até 3.751,05     15
// De 3.751,06 até 4.664,68     22,5
// Acima de 4.664,68            27,5

// O programa deve exibir:
// A) O valor a ser descontado do salário.
// B) O salário líquido recebido pelo funcionário.

"use strict";
const prompt = require('prompt-sync')();

var salario = prompt('Digite o salario: ');
var irDescontado

if(salario > 4664.68) {
    irDescontado = salario * 27.5/100;
} else if (salario >= 3751.06 && salario < 4664.68) {
    irDescontado = salario * 22.5/100;
} else if (salario >= 2826.66 && salario <= 3751.05) {
    irDescontado = salario * 15/100;
} else if (salario >= 1903.99 && salario <= 2826.65) {
    irDescontado = salario * 7.5/100;
} else {
    irDescontado = 0;
}

console.log('Salario bruto: R$ ', salario);
console.log('Valor a ser descontado de IR: R$', irDescontado);
console.log('Salario liquido: R$', salario-irDescontado);