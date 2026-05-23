import java.util.Scanner;

public class SistemaDeAcceso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        int pass = sc.nextInt();

        if (user.equals("admin")) {
            if (pass == 1234) {
                System.out.println("Acceso correcto");
            }
        }
        if (!user.equals("admin") || pass != 1234) {
            System.out.println("Acceso denegado");
        }
    }
}
