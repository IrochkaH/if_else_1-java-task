import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int num_one = scan.nextInt();
        System.out.print("Введите второе число : ");
        int num_two = scan.nextInt();

        if (num_one > num_two) {
            System.out.println("Сумма ровна: " + (num_one + num_two) );
        } else if (num_one < num_two){
            System.out.println("Сумма равна: " + (num_one * num_two));
        } else if (num_two == num_one) {
            System.out.println("Числа равны");
        }





    }
}