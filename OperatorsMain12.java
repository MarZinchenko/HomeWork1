//5.3 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи switch
package HomeWork1;

import java.util.Scanner;

public class OperatorsMain12 {
    public static void main(String[] args) {

        System.out.print("Твое имя: ");
        Scanner x = new Scanner(System.in);
        name(x.nextLine());
        x.close();
    }

    public static void name(String x) {
        switch (x) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}


