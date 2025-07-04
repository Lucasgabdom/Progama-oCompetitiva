package br.com.beecrowd.string;
import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ler;
        ler = sc.nextLine();


        StringBuilder textoModificado = new StringBuilder();
        for (int i = 0; i < ler.length(); i++) {
            char caracterAtual = ler.charAt(i);

            if (Character.isLetter(caracterAtual)) {
                char novoCaracter = (char)(caracterAtual + 3);
                textoModificado.append(novoCaracter);
            } else {
                textoModificado.append(caracterAtual);
            }
        }

        textoModificado.reverse();

        System.out.println("Resultado do passo 1: " + textoModificado.toString());

    }
}
