// Questão I (2,0)
// Escreva um programa em linguagem Javascript que receba como entrada o percurso em
// quilômetros, o tipo do carro e informe o consumo estimado de combustível, sabendo-se
// que um carro tipo C faz 12 Km com um litro de gasolina, um tipo B faz 9 Km e o tipo A,
// 8 Km por litro

const prompt = require("prompt-sync")();

console.log("== Calcula consumo de combustivel == \n")

var distanciapercorrida = prompt('Digite a distância a percorrer: ')
var tipoDeCarro = prompt('Digite o tipo de carro: ')
var consumoCombustivel

switch(tipoDeCarro) {
    case 'A':
        consumoCombustivel = distanciapercorrida / 8;
        break;
    case 'B':
        consumoCombustivel = distanciapercorrida / 9;
        break;
    case 'C':
        consumoCombustivel = distanciapercorrida / 12;
        break;
    default:
        console.log('Nenhuma opcao valida foi digitada.');

}
if (tipoDeCarro == 'A' || tipoDeCarro == 'B' || tipoDeCarro == 'C') {
    console.log('O consumo do combustivel para a distancia de', distanciapercorrida, 'km e o tipo de carro', tipoDeCarro, 'é', consumoCombustivel, 'litros de combustivel.');
} else {
    console.log('Execute o programa novamente!!');
}
