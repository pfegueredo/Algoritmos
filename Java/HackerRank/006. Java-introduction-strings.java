/*
 The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
*/




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        String InicialA = A.substring(0, 1).toUpperCase();
        String RestanteA = A.substring(1);
        
        String InicialB = B.substring(0, 1).toUpperCase();
        String RestanteB = B.substring(1);
        
        System.out.println(A.length() + B.length());

       if (A.toLowerCase().compareTo(B.toLowerCase()) <= 0) {
           System.out.println("No");
       }
       else {
           System.out.println("Yes");
       }
       
        System.out.println(InicialA + RestanteA+" "+InicialB + RestanteB);
    }
}



