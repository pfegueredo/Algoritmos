using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int x = arr.Length;
        long soma = 0;
        int maior = arr[0];
        int menor = arr[0];
        
        for(int i = 0; i < x; i++) {
            if ((arr[i]) < menor) {
                menor = arr[i];
            }
            
        }
        
        for(int i = 0; i < x; i++) {
            if ((arr[i]) > maior) {
                maior = arr[i];
            }
            
        }
        
        for(int i = 0; i < x; i++) {
                soma = soma + arr[i];
        }        
        
        Console.WriteLine("{0} {1}", (soma-maior), (soma-menor));

    }

    static void Main(string[] args) {
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp))
        ;
        miniMaxSum(arr);
    }
}
