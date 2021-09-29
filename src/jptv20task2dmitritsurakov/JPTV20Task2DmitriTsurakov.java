/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task2dmitritsurakov;

import java.util.Scanner; // Импорт сканера

public class JPTV20Task2DmitriTsurakov {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:"); // Дать команду
        int number = scanner.nextInt(); // Сохранить число
        System.out.println("Сумма цифр равна:" + sumDigits(number)); // Вывести число      
    }
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0){
            sum += number%10;
            number /= 10;
        }
        return sum; // Выводим сумму    
}
    }

