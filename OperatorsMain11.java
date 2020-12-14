//5.2 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if else if
package homeWork1;

import java.util.Objects;
import java.util.Scanner;

public class OperatorsMain11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();

        String friend = "Вася";
        String girlfriend = "Анастасия";

        if (Objects.equals(name, friend)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else if (Objects.equals(name, girlfriend)) {
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а Вы кто?");
        }
    }
}

