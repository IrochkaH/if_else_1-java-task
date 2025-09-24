import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите двухзначное число: ");
        int num = scan.nextInt();
        int num1 = num * num;
        if (num > num1) {
            System.out.println("Первоначальное число больше его произведения");
        } else if (num < num1) {
            System.out.println("Произведение числа больше чем изначальное число");
        }

    }
}