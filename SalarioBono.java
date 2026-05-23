
import java.util.Scanner;

public class SalarioBono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        int a = sc.nextInt();

        if (a > 5 && s < 2000) {
            System.out.println("Bono alto");
        }
        if ((a > 5 && s >= 2000) || (a <= 5 && s < 2000)) {
            System.out.println("Bono menor");
        }
        if (a <= 5 && s >= 2000) {
            System.out.println("Sin bono");
        }
    }
}
