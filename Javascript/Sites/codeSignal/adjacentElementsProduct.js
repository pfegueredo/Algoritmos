/*
Code Signal
Dado um array de inteiros, encontre o par de elementos adjacentes que tem o maior produto.

Exemplo:

Para inputArray = [3, 6, -2, -5, 7, 3], a saida deveria ser:
solution(inputArray) = 21.

7 e 3 produzem o maior produto.
*/

function solution(inputArray) {
    if(inputArray.length >= 1 && inputArray.length <= 10 ) {
        var menor=0;
        for(i=0; i < inputArray.length; i++) {
            if(inputArray[i] >= -1000 && inputArray[i] <= 1000) {
                if(inputArray[i] < menor) {
                    menor = inputArray[i];
                }
            }
        }
        maior=menor;
        for(i=0; i < inputArray.length; i++) {
            if ( (inputArray[i] * inputArray[i+1]) >= maior) {
                maior = inputArray[i] * inputArray[i+1];
            }
        }
        return maior;
    }
    return undefined;
}
var arr;
//Lista de entrada
arr = [0, 0];

solution(arr);