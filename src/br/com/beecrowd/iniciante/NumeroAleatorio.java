package br.com.beecrowd.iniciante;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(101);
        int tentativa;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número entre 0 e 100: ");
            tentativa = sc.nextInt();
                if (tentativa == numeroAleatorio) {
                    System.out.println("Parabéns você acertou!");
                    break;
                } else {
                    if (tentativa < numeroAleatorio) {
                        System.out.println("Quase lá! Mas o número é ainda maior");
                    } else {
                        System.out.println("Quase lá! Mas o número é menor");
                    }

                }
        }




    }
}
