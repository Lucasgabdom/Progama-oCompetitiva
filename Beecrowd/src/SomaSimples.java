import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int produto;

        produto = a * b;

        System.out.println("PROD = " + produto );
        sc.close();
    }
}
