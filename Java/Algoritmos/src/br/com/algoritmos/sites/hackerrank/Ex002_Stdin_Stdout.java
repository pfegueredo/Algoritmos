package br.com.algoritmos.sites.hackerrank;

/*
Neste desafio, você deve ler um integer , um double e uma String de stdin e imprimir os valores de acordo com as instruções na seção Output Format abaixo. Para tornar o problema um pouco mais fácil, uma parte do código é fornecida para você no editor.

Nota: Recomendamos completar Java Stdin e Stdout I antes de tentar este desafio.

Formato de entrada

Existem três linhas de entrada:

A primeira linha contém um inteiro .
A segunda linha contém um double .
A terceira linha contém um String .
Formato de saída

Existem três linhas de saída:

Na primeira linha, print String:seguido pela String inalterada lida de stdin.
Na segunda linha, print Double:seguido pela leitura dupla inalterada de stdin.
Na terceira linha, print Int:seguido pelo inteiro inalterado lido de stdin.
Para facilitar o problema, uma parte do código já é fornecida no editor.

Nota: Se você usar o método nextLine() imediatamente após o método nextInt() , lembre-se de que nextInt() lê tokens inteiros; por causa disso, o último caractere de nova linha para essa linha de entrada de inteiro ainda está enfileirado no buffer de entrada e o próximo nextLine() lerá o restante da linha de inteiro (que está vazia).
*/


import java.util.Scanner;

public class Ex002_Stdin_Stdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        s += scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}

