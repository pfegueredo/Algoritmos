package br.com.algoritmos.outros;

public class Exception02 {
    public static void main(String[] args) {
        int A = 10;
        int B = 0;

        try {
            int result = divideDoisNumeros(A, B);
            System.out.println(result);
        } catch (ArithmeticException e) {
            //System.out.println("Não pode dividir por zero");
        } finally {
            System.out.println("Fim do programa");
        }

    }

    static int divideDoisNumeros(int a, int b) {
        return  a / b;
    }


}

