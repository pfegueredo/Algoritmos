/*
Tarefa
Dado o preço da refeição (custo base de uma refeição), porcentagem da gorjeta (a porcentagem do preço da refeição adicionada como gorjeta) e porcentagem do imposto (a porcentagem do preço da refeição adicionada como imposto) para uma refeição, localize e imprima o custo total da refeição. Arredonde o resultado para o inteiro mais próximo.

Exemplo:

Uma gorjeta de 15% * 100 = 15, e os impostos são 8% * 100 = 8. Imprima o valor 123 e retorne da função.

Descrição da função
Complete a função solve no editor abaixo.

solve tem os seguintes parâmetros:

int refeição_custo: o custo da comida antes da gorjeta e impostos
int tip_percent: a porcentagem de gorjetas
int tax_percent: a porcentagem de imposto
Retorna A função não retorna nada. Imprima o valor calculado, arredondado para o inteiro mais próximo.

Nota: Certifique-se de usar valores precisos para seus cálculos, ou você pode acabar com um resultado arredondado incorretamente.

*/

import java.io.*;
import java.math.*;

class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int meal_price = (int) (meal_cost + (Math.round(tip_percent * meal_cost / 100)) + 
        (Math.round(tax_percent * meal_cost / 100)));
        System.out.println(meal_price);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
