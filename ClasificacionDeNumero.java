import java.util.Scanner;

public class ClasificacionDeNumero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positivo");
        }
        if (n < 0) {
            System.out.println("Negativo");
        }
        if (n == 0) {
            System.out.println("Cero");
        }

        if (n % 2 == 0) {
            System.out.println("Par");
        }
        if (n % 2 != 0) {
            System.out.println("Impar");
        }
    }
}
