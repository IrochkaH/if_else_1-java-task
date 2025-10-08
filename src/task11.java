import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите четырёхзначное положительное число: ");
        int n = scan.nextInt();


        int first = n / 100;


        int last = n % 100;

        if (first == last) {
            System.out.println("Число является парно-симметричным");
        } else {
            System.out.println("Число не является парно-симметричным");
        }
    }
}

