import java.util.Scanner;

public class EvaluarTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Equilátero");
            }
            if ((a == b || a == c || b == c) && !(a == b && b == c)) {
                System.out.println("Isósceles");
            }
            if (a != b && b != c && a != c) {
                System.out.println("Escaleno");
            }
        }

        if (!(a + b > c && a + c > b && b + c > a)) {
            System.out.println("No es triángulo");
        }
    }
}
