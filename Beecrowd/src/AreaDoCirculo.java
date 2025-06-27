import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double n = 3.14159;
        double raio;

        raio = entrada.nextDouble();

        double area = n * raio * raio;

        System.out.printf("A=%.4f\n", area);

        entrada.close();
    }
}
