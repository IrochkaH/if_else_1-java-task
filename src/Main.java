import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число : ");
        int num = scan.nextInt();
        if (num >0) {
            num *=2;
            System.out.println("Число положительное, удвоено :" + num);
        }   else {
            System.out.println("Число не положительное" + num);
        }

    }
}