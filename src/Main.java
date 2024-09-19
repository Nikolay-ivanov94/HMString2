public class Main {
    public static String yearToday (int year) {
        String yearToday = " год не является високосным";
        if (year - 1584 <= 0) {
            yearToday = " год должен быть больше, чем 1584";
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            yearToday = " год является високосным";
        }
        return yearToday;
    }

    public static String checkPhone(int clientDeviceYear,int clientOS) {
        String checkPhone = "";
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            checkPhone = "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            checkPhone = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            checkPhone = "Установите версию приложения для Android по ссылке";
        } else {
            checkPhone = "Установите облегченную версию приложения для Android по ссылке";
        }
        return checkPhone;
    }

    public static String totalDistance(int deliveryDistance) {
        String totalDistance = "";
        if (deliveryDistance <= 20) {
            totalDistance = "Потребуется дней : 1";
        } else if (deliveryDistance <= 60) {
            totalDistance = "Потребуется дней : 2";
        } else if (deliveryDistance <= 100) {
            totalDistance = "Потребуется дней : 3";
        } else {
            totalDistance = "Доставки свыше 100 км доставки нет";
        }
        return totalDistance;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 1900;
        System.out.println(year + yearToday(year));
        System.out.println();
        System.out.println("Задание 2");
        int clientDeviceYear = 2010;
        int clientOS = 0;
        System.out.println(checkPhone(clientDeviceYear, clientOS));
        System.out.println();
        System.out.println("Задание 3");
        int deliveryDistance = 70;
        System.out.println(totalDistance(deliveryDistance));

    }
}