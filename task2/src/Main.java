import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы

     greatest = first > second && first > third ? first : second > third ? second : third ;
     smallest = first < second && first < third ? first : second < third ? second : third ;
     if ((first > second && first < third) || (first < second && first > third)){
         average = first;
     } else if ((second > first && second < third) || (second < first && second > third)){
        average = second ;
     } else {
         average = third ;
     }


        //todo end of programm !


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
