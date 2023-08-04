package br.com.algoritmos.sites.hackerrank;

/*
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, N , print its first 10 multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
*/

import java.io.*;

public class Ex004_Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 1; i < 11; i++) {
            int x = i* N ;
            System.out.println(N + " x "+ i + " = " +x);
        }
        
        bufferedReader.close();
    }
}
