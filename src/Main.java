public class Main {
    public static void main(String[] args) {
        /// Задание №1.
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        /// Задание №2.
        int yearPhon = 2013;
        if (clientOS == 0 && yearPhon < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearPhon >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearPhon < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        /// Задание №3.
        int year = 1434;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year >= 1584) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }

        /// Задание №4.
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка невозможна.");
        }

        /// Задание №5.
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6, 7, 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9, 10, 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
            default:
                System.out.println("Номер месяца введен неправильно.");

        }
    }
}