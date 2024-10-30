public class Main {
    // Методы
    public static void fanny() {
        System.out.println("____________________________________________________");
    }

    public static int calculateYear(int year) {
        if (year > 1584 && ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int osUpdateMessage(int deviseYear, int ios) {
        if (deviseYear >= 2015 && ios == 0) {
            return 1;
        } else if (deviseYear < 2015 && ios == 0) {
            return 2;
        } else if (deviseYear >= 2015 && ios == 1) {
            return 3;
        } else if (deviseYear < 2015 && ios == 1) {
            return 4;
        } else {
            return 5;
        }
    }

    public static int deliveryDays(int deliveryDist) {
        if (deliveryDist <= 20) {
            return 1;
        } else if (deliveryDist > 20 && deliveryDist <= 60) {
            return 2;
        } else if (deliveryDist > 60 && deliveryDist <= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    // код работы с методами
    public static void main(String[] args) {
        fanny();
        System.out.println("Задача 1\n");
        int currentYear = 2024;
        int year = calculateYear(currentYear);
        if (year > 0) {
            System.out.println(currentYear + " год — високосный год.");
        } else {
            System.out.println(currentYear + " год — не високосный год.");
        }
        fanny();
        System.out.println("Задача 2\n");
        int clientDeviseYear = 2019;
        int clientOs = 1;
        int deviseYear = osUpdateMessage(clientDeviseYear, clientOs);
        if (deviseYear == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (deviseYear == 2) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (deviseYear == 3) {
            System.out.println("Установите версию приложения для Android по ссылке:");
        } else if (deviseYear == 4) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        } else {
            System.out.println("Для вас нет обновлений");
        }
        fanny();
        System.out.println("Задача 3\n");
        int deliveryDistance = 55;
        int deliveryTime = 1;
        int deliveryDist = deliveryDays(deliveryDistance);
        if (deliveryDist == 1) {
            System.out.println("Потребуется дней: " + deliveryTime + ", для доставки вашей карты.");
        } else if (deliveryDist == 2) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1) + ", для доставки вашей карты.");
        } else if (deliveryDist == 3) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2) + ", для доставки вашей карты.");
        } else {
            System.out.println("На такое расстояние доставки нет.");
        }
        fanny();
    }

}

