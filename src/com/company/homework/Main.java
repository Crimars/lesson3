package com.company.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!");
        int range = 100;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = sc.nextInt();
            if(input_number == number) {
                System.out.println("Вы угадали!");
                break;
            }
            else if (input_number > number) {
                System.out.println("загаданное число меньше!");
            }
            else {
                System.out.println("Загаданное число больше!");
            }
        }
        sc.close();

    }
}
