package br.com.beecrowd.iniciante;

import java.util.Scanner;


public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double calculando = ((a * 2) + (b * 3) + (c * 5));
        double media = calculando / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
