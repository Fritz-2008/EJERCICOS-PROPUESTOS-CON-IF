
import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = (sc.nextDouble() + sc.nextDouble() + sc.nextDouble()) / 3;

        if (p >= 11) {
            System.out.println("Aprobado");
        }
        if (p < 11 && p > 8) {
            System.out.println("Recuperación");
        }
        if (p <= 8) {
            System.out.println("Desaprobado");
        }
    }
}
