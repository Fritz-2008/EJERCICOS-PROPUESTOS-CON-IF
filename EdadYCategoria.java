import java.util.Scanner;

public class EdadYCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();

        if (e >= 0 && e <= 12) {
            System.out.println("Niño");
        }
        if (e >= 13 && e <= 17) {
            System.out.println("Adolescente");
        }
        if (e >= 18 && e <= 64) {
            System.out.println("Adulto");
        }
        if (e >= 65) {
            System.out.println("Adulto mayor");
        }
    }
}
