import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите оценку ученика: ");
        int mark = scan.nextInt();
        if (mark <=5){
            System.out.println("Оценка правильная!");
        } else{
            System.out.println("Ошибка!");
        }

    }
}