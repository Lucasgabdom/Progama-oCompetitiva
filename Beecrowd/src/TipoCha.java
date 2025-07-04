import java.util.Scanner;

public class TipoCha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tipoCha;
        int acertos = 0;
        int palpite;

        System.out.println("O tipo do chá é: ");
        tipoCha = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número do tipo do chá: ");
            palpite = sc.nextInt();
            if (palpite == tipoCha) {
                acertos++;
            }
        }

        System.out.println(acertos);
    }
}
