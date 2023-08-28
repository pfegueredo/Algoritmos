/*
Code Signal
Dada uma string, cheque se ela é um palindromo.
*/

function solution(inputString) {

    var outputString = "";
    
        for(i = inputString.length; i >= 0; i--) {
            outputString += inputString.substring(i-1, i);

          }

        return outputString == inputString;
    }
