package sptv21task2victorabramov;
import java.util.Scanner;
public class SPTV21Task2VictorAbramov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число? : ");
        int number = scanner.nextInt();
        System.out.println("Сумма равна: " + (((number/100)%10) + ((number/10)%10)+(number%10)));
    }
    
}
