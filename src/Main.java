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
        if (clientOS == 0) {
            if (yearPhon < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (yearPhon < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        /// Задание №3.
        int year = 1964;
        if (year < 1584) {
            System.out.println("Год невисокосный");
        } else if (year % 400 != 0 && year % 100 == 0) {
            System.out.println("Год невисокосный");
        } else if (year % 4 != 0) {
            System.out.println("Год невисокосный");
        } else {
            System.out.println("Год високосный");
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
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима");
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима");
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна");
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна");
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна");
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето");
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето");
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето");
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень");
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень");
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень");
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима");
        }
    }
}