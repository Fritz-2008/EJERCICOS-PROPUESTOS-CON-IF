import java.util.Scanner;

public class ContraseñaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String c = sc.nextLine();
        
        if (c.length() == 4 && c.matches("\\d+")) {
            System.out.println("Válida");
        } else {
            System.out.println("Inválida");
        }
        
        sc.close();
    }
}
