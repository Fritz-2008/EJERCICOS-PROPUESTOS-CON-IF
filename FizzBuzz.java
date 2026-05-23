import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        if (n % 3 == 0 && n % 5 != 0) {
            System.out.println("Fizz");
        }
        if (n % 5 == 0 && n % 3 != 0) {
            System.out.println("Buzz");
        }
    }
}
