public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // Задача 1
    public static void task1() {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для iOS по ссылке " + " Задача 1");
        } else if (clientOS == 0) {
            System.out.println(" Установите версию приложения для Android по ссылке " + " Задача 1");
        } else {
            System.out.println("Неверно" + " Задача 1");
        }
    }

    //Задача 2
    public static void task2() {
        int clientOs = 0;
        int clientDeviceYear = 2012;
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите обычную версию приложения для IOS по ссылке" + " Задача 2");
        } else if (clientOs == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите облегченную. версию приложения для IOS по ссылке" + " Задача 2");
        } else if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите обычную. версию приложения для Android по ссылке" + " Задача 2");
        } else if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите облегченную. версию приложения Android по ссылке" + " Задача 2");
        } else {
            System.out.println("Неверно");
        }
    }

    // Задача 3
    public static void task3() {
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным" + " Задача 3");
        } else {
            System.out.println(year + " год не является високосным" + " Задача 3");
        }
    }

    //Задача 4
    public static void task4() {
        int deliveryDistance = 80;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
            System.out.println("Срок доствки " + deliveryDays + " день" + " Задача 4");
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
            System.out.println("Срок доствки " + deliveryDays + " дня" + " Задача 4");
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
            System.out.println("Срок доствки " + deliveryDays + " дня" + " Задача 4");
        } else {
            System.out.println("Доставки нет " + " Задача 4");
        }
    }

    // Задача 5
    public static void task5() {
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println(" Зима " + " Задача 5");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(" Весна" + " Задача 5");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(" Лето" + " Задача 5");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(" Осень" + " Задача 5");
                break;
            default:
                System.out.println("номер месяца больше 12" + " Задача 5");
                break;
        }
    }
}