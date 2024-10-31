public class Main {
    // Методы
    public static void fanny() {
        System.out.println("____________________________________________________");
    }

    public static void calculateYear(int year) {
        if (year > 1584 && ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — не високосный год.");
        }
    }

    public static void sendUpdateMessage(int deviseYear, int ios) {
        if (deviseYear >= 2015 && ios == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (deviseYear < 2015 && ios == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (deviseYear >= 2015 && ios == 1) {
            System.out.println("Установите версию приложения для Android по ссылке:");
        } else if (deviseYear < 2015 && ios == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        } else {
            System.out.println("Для вас нет обновлений");
        }
    }

        private static int calcCardDeliveryDays(int distance){
            int deliveryDays;
            if (distance <= 20) {
                deliveryDays = 1;
            } else if (distance <= 60) {
                deliveryDays = 2;
            } else if (distance <= 100) {
                deliveryDays = 3;
            } else {
                deliveryDays = 4;
            }
            return deliveryDays;
        }

    // код работы с методами
    public static void main(String[] args) {
        fanny();
        System.out.println("Задача 1\n");
        int currentYear = 2026;
        calculateYear(currentYear);

        fanny();
        System.out.println("Задача 2\n");
        int clientDeviseYear = 2019;
        int clientOs = 0;
        sendUpdateMessage(clientDeviseYear, clientOs);

        fanny();
        System.out.println("Задача 3\n");
            System.out.println("Потребуется дней: " + calcCardDeliveryDays(90)
                    + ", для доставки вашей карты.");
        fanny();
    }

}

