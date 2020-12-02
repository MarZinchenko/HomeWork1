//5.2 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if else if
package HomeWork1;

import java.util.Scanner;

public class OperatorsMain11 {
    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Твое имя: ");
        if (in.hasNext(name1)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else if (in.hasNext(name2)){
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
