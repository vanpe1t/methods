import com.sun.source.tree.NewArrayTree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int thisYear = LocalDate.now().getYear();

        System.out.println("Задача 1");

        if (isLeapYear(thisYear)) {
            System.out.println(thisYear + " високосный год");
        } else {
            System.out.println(thisYear + " не  високосный год");
        }

        System.out.println();
        System.out.println("Задача 2");

        String[] versionLink = getVersionLink(thisYear, 5);

        if (versionLink[0] != "") {
            System.out.println("Установите " + versionLink[0] + " версию приложения по сылке " + versionLink[1]);
        } else {
            System.out.println("Не найдена подходящая версия приложения для указанной OS!");
        }

        System.out.println();
        System.out.println("Задача 3");

        int deliveryDistance = 50;
        int days = getDaysForDelivery(deliveryDistance);

        if (days != 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Время доставки составит более 3 дней.");
        }
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
    public static String[] getVersionLink(int clientDeviceYear, int clientOS) {
        //пока ждём уроков по более удобным структурам, используем массив
        String[] versionLink = {"", ""};

        if (clientOS == 0 && clientDeviceYear < 2015) {
            versionLink[0] = "Light iOS";
            versionLink[1] = "http:" + "\\\\" + "на Light iOS";
            //System.out.println("Установите облегченную версию приложения для iOS по ссылке!");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            versionLink[0] = "Full iOS";
            versionLink[1] = "http:" + "\\\\" + "на Full iOS";
            //System.out.println("Установите версию приложения для iOS по ссылке!");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            versionLink[0] = "Light Android";
            versionLink[1] = "http:" + "\\\\" + "Light Android";;
            //System.out.println("Установите облегченную версию приложения для Android по ссылке!");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            versionLink[0] = "Full Android";
            versionLink[1] = "http:" + "\\\\" + "на Full Android";
            //System.out.println("Установите версию приложения для Android по ссылке");
        }

        return versionLink;
    }
    public static int getDaysForDelivery(int deliveryDistance) {
        int days = 0;

        if (deliveryDistance < 20) {
            days = +1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = +2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days = +3;
        } else {
            days = 0;
        }

        return days;
    }
}