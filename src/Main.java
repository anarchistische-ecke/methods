import java.time.*;

public class Main {
    public static void main(String[] args) {
        determineYear(1940);
        checkDevice(1, 1999);
        deliveryDate(1000);
    }
    // Exercise 1
    public static void determineYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год - високосный");
        } else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }
    // Exercise 2
    public static void checkDevice(int clientOS, int yearMade) {
        var currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (yearMade >= currentYear) {

                System.out.println("Установите версию приложения для iOS по ссылке");

            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (yearMade >= currentYear) {

                System.out.println("Установите версию приложения для Android по ссылке");

            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    // Exercise 3
    public static void deliveryDate(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    // Exercise 4

}