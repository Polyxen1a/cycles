public class Main {
    public static void main(String[] args) {
        // Лекция
        System.out.println("Лекция 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //Лекция 2
        System.out.println("Лекция 2");
        for (int i = 2020; i <=2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        //Лекция 3
        System.out.println("Лекция 3");
        int salary = 65535;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц "+ i + " Итого " + total);
            System.out.println(total);
        }
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
// Задание 2.1
        System.out.println("Задание 2.1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
// Задание 2.2
        System.out.println("Задание 2.2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задание 2.3
        System.out.println("Задание 2.3");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
// Задание 3.1
        System.out.println("Задание 3.1");
        int storage = 29000;
        int sum = 0;

        for (int i = 1; i <= 12; i++) {
            sum += storage;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum);
        }
        // Задание 3.2
        System.out.println("Задание 3.2");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + storage) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent);
        }
    }
}