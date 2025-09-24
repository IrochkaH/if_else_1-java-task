import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество учеников: ");
        int student = scan.nextInt();
        System.out.print("Введите количество стульев: ");
        int chair = scan.nextInt();
        if (student < chair){
            System.out.print("Лишних стульев -" + (chair - student));
        } else if (student == chair) {
            System.out.println("Стульев и студентов одинаково");
        }



    }
}