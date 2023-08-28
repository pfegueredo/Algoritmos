"use strict" //uso restrito. Obrigada a declarar a variável antes de usar.

//Usando o var - a variável estara acessível em qualquer bloco e subbloco.
//Usando o let - a variável só é acessivel dentro do bloco que ele foi colocado.
//Usando o const - o valor da variável não pode ser alterado posteriormente.
var feliz = 1
console.log(feliz == 1 ? "Sim" : "Não");
console.log(typeof(feliz));

function capitalizar() {
    let valor = document.getElementById("frase").value;
    valor = valor.split(' ').map(word => word[0].toUpperCase() + word.slice(1)).join(' ');
    let resultado = document.getElementById('resultado');
    resultado.innerHTML = valor;
    console.log(valor);
}

function fibonacci(n) {
    n = parseInt(n);

    if (typeof n !== 'number' || n <= 0 || Math.floor(n) !== n) {
        throw new Error('O argumento fornecido deve ser um número inteiro positivo');
    }

    let fib = [0, 1]; // Os primeiros dois números na sequência de Fibonacci
    for(let i = 2; i <= n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2]; // Calcula o próximo número na sequência
    }
    let x = fib[n - 1];
    document.getElementById('resultadofibo').innerHTML = x;
    return x; // Retorna o n-ésimo número
}




