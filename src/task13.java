import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int n = scan.nextInt();

        int r = n % 10;
        int round;

        if (r < 5) {
            round = n - r;
        } else {
            round = n + (10 - r);
        }

        System.out.println("Ближайшее круглое число: " + round);
    }
}