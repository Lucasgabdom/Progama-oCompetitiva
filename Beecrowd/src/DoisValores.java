import java.util.Scanner;

public class DoisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite um valor: ");
        a = sc.nextInt();
        System.out.println("Digite um valor: ");
        b = sc.nextInt();

        int x = a + b;

        System.out.println("X = " + x);
    }

}
