import java.util.Scanner;

public class DescuentoSegunMontoYTipo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        String t = sc.next();

        if (m > 500) {
            if (t.equalsIgnoreCase("VIP")) {
                System.out.println("20%");
            }
        }
        if (m > 500) {
            if (t.equalsIgnoreCase("VIP")) {
                System.out.println("10%");
            }
        }
        if (m <= 500) {
            System.out.println("Sin descuento");
        }
    }
}
