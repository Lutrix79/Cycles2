
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача 1");
        int eachMonthCash = 15000;
        int totalCash = 0;
        int i = 0;
        while (totalCash < 2_459_000) {
            totalCash += eachMonthCash;
            i++;
            System.out.println("Месяц " + i +", сумма накоплений равна "  + totalCash + " рублей");
        }
        System.out.println("Общая сумма накоплений равна "  + totalCash + " рублей");
        System.out.println();

        //Задача №2
        System.out.println("Задача 2");
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();

        //Задача №3
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int birthRate = 17 * 12_000;
        int mortalityRate = 8 * 12_000;
        for (int j=1; j <= 10; j++) {
            populationY += birthRate - mortalityRate;
            System.out.println("Год " + j +", численность населения составляет "  + populationY + " человек");
        }
        System.out.println();

        //Задача №4
        System.out.println("Задача 4");
        int deposit = 15_000;
        i = 0;
        while (deposit < 12_000_000) {
            deposit += deposit * 7 / 100;
            i++;
            System.out.println("Месяц " + i +", сумма накоплений равна "  + deposit + " рублей");
        }
        System.out.println();

        //Задача №5
        System.out.println("Задача 5");
        deposit = 15_000;
        i = 0;
        while (deposit < 12_000_000) {
            deposit += deposit * 7 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i +", сумма накоплений равна "  + deposit + " рублей");
            }
        }
        System.out.println();

        //Задача №6
        System.out.println("Задача 6");
        deposit = 15_000;
        int timeStorageInMonths = 9 * 12;
        i = 0;
        while (i < timeStorageInMonths) {
            deposit += deposit * 7 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i +", сумма накоплений равна "  + deposit + " рублей");
            }
        }
        System.out.println();

        //Задача №7
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день первой пятницы месяца (от 1 до 7) ");
        int firstFriday = scanner.nextInt();
        if (firstFriday < 1 || firstFriday > 7) {
            System.out.println("Неверный день недели " + firstFriday);
        } else {
            for (int j = firstFriday; j <= 31; j += 7) {
                System.out.println("Сегодня пятница, " + j + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();

        //Задача №8
        System.out.println("Задача 8");
        System.out.print("Введите текущий год ");
        int currentYear = scanner.nextInt();
        int pastYears = currentYear - 200;
        int futureYears = currentYear + 100;
        if (currentYear < 0) {
            System.out.println("Тогда ещё верили в богов и вряд ли свидетельства сохранились, да и Галилея с телескопом ещё не было");
        } else {
            for (int j = 0; j <= futureYears; j+=79) {
                if (j > pastYears) {
                    System.out.println(j);
                }
            }
        }

    }
}