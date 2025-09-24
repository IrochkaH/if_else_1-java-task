import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число : ");
        int num = scan.nextInt();


        if (num > 0) {
            System.out.println("Число положительное: " + num);
        } else if (num <0) {
            System.out.println("Число отрицательное "+ num);
        }
        else {
            num = 0;
            System.out.println("У вас нолик, епта");
        }





    }
}