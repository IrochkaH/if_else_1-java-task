import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число : ");
        int num = scan.nextInt();


        if ( num > 99) {
            num -= 1;
            System.out.println("Число положительное: " + num);
        }





    }
}

