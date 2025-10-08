import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите трёхзначное положительное число: ");
        int n = scan.nextInt();


        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        int count = 0;

        if (a % 2 == 0) count++;
        if (b % 2 == 0) count++;
        if (c % 2 == 0) count++;


        if (count == 0) {
            System.out.println("Нет чётных цифр");
        } else if (count == 1) {
            System.out.println("Одна чётная цифра");
        } else if (count == 2) {
            System.out.println("Две чётные цифры");
        } else {
            System.out.println("Все цифры чётные");
        }
    }
}

