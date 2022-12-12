public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {

        System.out.println("Задача №1");

        int finalAccumulation = 2_459_000;
        int monthlyAccumulation = 15_000;
        int total = 0;
        int monthCounter = 1;

        while (total <= finalAccumulation) {
            total = total + monthlyAccumulation;
            System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + total + " рублей");
            monthCounter++;
        }

        System.out.println();

    }

    public static void task2() {

        System.out.println("Задача №2");

        int cycleCounter = 1;

        while (cycleCounter <= 10) {
            System.out.print(cycleCounter + " ");
            cycleCounter++;
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача №3");

        int population = 12_000_000;
        float birthRate = (float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        int year = 1;

        while (year <= 10) {
            population = (int) (population + (population * birthRate) - (population * mortality));
            System.out.println("Год " + year + ", численность населения составляет " + population + " людей");
            year++;
        }

        System.out.println();

    }

    public static void task4() {

        System.out.println("Задача №4");

        int totalAmount = 12_000_000;
        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int monthCounter = 1;

        while (depositAmount <= totalAmount) {
            depositAmount += depositAmount * monthlyPercent;
            System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + depositAmount + " рублей");
            monthCounter++;
        }

        System.out.println();

    }

    public static void task5() {

        System.out.println("Задача №5");

        int totalAmount = 12_000_000;
        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int monthCounter = 1;

        while (depositAmount <= totalAmount) {
            depositAmount += depositAmount * monthlyPercent;

            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + depositAmount + " рублей");
            }

            monthCounter++;
        }

        System.out.println();

    }

    public static void task6() {

        System.out.println("Задача №6");

        int numberOfMonths = 9 * 12;
        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int monthCounter = 1;

        while (monthCounter <= numberOfMonths) {
            depositAmount += depositAmount * monthlyPercent;

            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + depositAmount + " рублей");
            }

            monthCounter++;
        }

        System.out.println();

    }

    public static void task7() {

        System.out.println("Задача №7");

        int friday = 2;
        int daysInMonth = 31;

        while (friday <= daysInMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println();

    }

    public static void task8() {

        System.out.println("Задача №8");

        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        while (startYear <= endYear) {
            if (startYear % 79 ==0) {
                System.out.println(startYear);
            }

            startYear++;

        }
    }
}