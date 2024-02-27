public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int clientOS=1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS==1) {System.out.println("Установите версию приложения для Android по ссылке");}

        int clientOS1=0;
        int year=2004;
        if (clientOS1 == 0 && year <2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS1 ==0 && year>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1==1 && year<2015) {System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOS1==1 && year>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int year1=2000;
        if (year1 >=1584 && year1%4==0) {
            System.out.println("Год является высокосным");
        }
        else {System.out.println("Год является невысокосным");}

        int deliveryDistance=95;
        int days =1;
        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней: " + days);
        }
        else if (deliveryDistance>20 && deliveryDistance<=60) {System.out.println("Потребуется дней: " + (days+1));
        }
        else if (deliveryDistance>60 && deliveryDistance<=100) {System.out.println("Потребуется дней: "+(days+2));
    }   else {
            System.out.println("Доставки нет");
        }

        int monthNumber=12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }

}
