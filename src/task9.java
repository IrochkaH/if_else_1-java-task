import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите трёхзначное положительное число: ");
        int n = scan.nextInt();

        int sum = (n / 100) + (n / 10 % 10) + (n % 10);

        if ((n % 2) + (sum % 2) == 0) {
            System.out.println("Число является дважды чётным");
        } else {
            System.out.println("Число не является дважды чётным");
        }



    }
}
