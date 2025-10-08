import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите трехзначное положительное число: ");
            int num = scan.nextInt();

        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Среди цифр есть ноль");
        } else {
            System.out.println("Среди цифр нуля нет");
        }
    }
}