package br.com.algoritmos.outros;

public class ImpossivelDividorPorZeroException extends Exception {

	private static final long serialVersionUID = -7508824580641767441L;
	String message;
    int A;
    int B;

    public ImpossivelDividorPorZeroException(String message, int A, int B) {
        super(message);
        this.A = A;
        this.B = B;

    }
}
