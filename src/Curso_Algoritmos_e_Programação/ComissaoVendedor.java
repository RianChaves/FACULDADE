package Curso_Algoritmos_e_Programação;

import java.util.Scanner;

public class ComissaoVendedor {
    public static void main(String[] args) {
        double salarioBase, valorVenda, comissao = 0, salarioFinal;
        Scanner sc = new Scanner(System.in);

        // lê o salário base e o valor de venda do funcionário
        System.out.print("Digite o salário-base do funcionário: R$ ");
        salarioBase = sc.nextDouble();
        System.out.print("Digite o valor de vendas do funcionário: R$ ");
        valorVenda = sc.nextDouble();

        // calcula a comissão de acordo com o valor de venda mensal
        if (valorVenda < 55000) {
            comissao = 100;
        } else if (valorVenda <= 100000) {
            comissao = valorVenda * 0.02;
        } else {
            comissao = 5000;
        }

        // calcula o salário final e imprime o resultado
        salarioFinal = salarioBase + comissao;
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);
        if (comissao > 0) {
            System.out.printf("A comissão é de R$ %.2f.\n", comissao);
        }

        sc.close();
    }
}
