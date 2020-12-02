package HomeWork1;

import java.util.Scanner;

public class OperatorsMain10 {
    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Твое имя: ");

        if (in.hasNext(name1)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (in.hasNext(name2)){
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
