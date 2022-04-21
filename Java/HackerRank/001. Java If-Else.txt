/*
Neste desafio, testamos seu conhecimento sobre o uso de declarações condicionais if-else para automatizar os processos de tomada de decisão. Uma instrução if-else tem o seguinte fluxo lógico:

Fluxograma if-else da Wikipedia

Tarefa
Dado um número inteiro,, execute as seguintes ações condicionais:

Se n é impar, imprima Weird.
Se n é par e está na faixa de 2 a 5, imprima Not Weird.
Se n é par e está na faixa de 6 a 20, imprima Weird.
Se n é par e maior que 20, imprema Not Weird
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if (N % 2 != 0) {
            System.out.print("Weird");
        }
        else if ( (N % 2 == 0) && ((N > 2) && (N < 6) )) {
            System.out.println("Not Weird");
        }
        else if ( (N % 2 == 0) && ((N > 5) && (N < 21) )) {
            System.out.println("Weird");
        }
        else if ( (N % 2 == 0) && (N > 20) ) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}



