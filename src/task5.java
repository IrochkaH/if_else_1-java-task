import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите трехзначное число : ");
        int num = scan.nextInt();
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;
        if (hundreds % 2 == 0 && tens % 2 == 0 && units % 2 == 0) {
            System.out.print("Число чётно-красивое!");
        } else {
            System.out.print("Число НЕ чётно-красивое!");
        }



    }
}