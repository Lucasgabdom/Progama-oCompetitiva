package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = "Lucas";
        String tipoConta = "Corrente";
        double valorConta = 2500.00;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Valor da conta: " + valorConta);
        System.out.println("\n**********************************");

        String menu = """
                *** Digite a sua opção ***
                1- Consultar Saldo
                2- Tranferir Valor
                3- Receber Valor
                4- Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = entrada.nextInt();

            if (opcao == 1){
                System.out.println("O seu saldo é: " + valorConta);
            } else if (opcao == 2){
                System.out.println("Digite o valor desejado: ");
                double valor = entrada.nextDouble();
                if (valor > valorConta){
                    System.out.println("Saldo insuficiente!");
                } else {
                    valorConta -= valor;
                    System.out.println("Saldo atual: " + valorConta);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = entrada.nextDouble();
                valorConta += valor;
                System.out.println("Saldo atual: " + valorConta);
            } else if (opcao == 4){
                System.out.println("Saindo");
            } else {
                System.out.println("Opção inválida!");
            }
        }

    }
}
