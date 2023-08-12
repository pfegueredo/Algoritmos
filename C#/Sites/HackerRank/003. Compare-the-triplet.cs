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

    // Complete the compareTriplets function below.
    static List<int> compareTriplets(List<int> a, List<int> b) {
    int alice, bob, nulo, count;
    alice = 0;
    bob = 0; 
    nulo = 0;
    count = a.Count;
    List<int> resultado = new List<int>();

        for (int i= 0; i < count; i++) 
        {
            int aInt = a[i];
            int bInt = b[i];
            if ((aInt) > (bInt)) {
                alice = alice +1;
            }
            else if (bInt > aInt) 
            {
                bob = bob + 1;
            }
             
            
        }
        resultado.Add(alice);
        resultado.Add(bob);
        return resultado;

    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        List<int> a = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(aTemp => Convert.ToInt32(aTemp)).ToList();

        List<int> b = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(bTemp => Convert.ToInt32(bTemp)).ToList();

        List<int> result = compareTriplets(a, b);

        textWriter.WriteLine(String.Join(" ", result));

        textWriter.Flush();
        textWriter.Close();
    }
}
