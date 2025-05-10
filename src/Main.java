public class Main {
    public static void main(String[] args) {

      System.out.println("Задача 1:"); // Задача 1
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        System.out.println("Задача 2:"); // Задача 2
        byte clientOS1 = 0;
        short clientDeviceYear =2014;
        if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        System.out.println("Задача 3:"); // Задача 3
        short year = 2021;
        if ((year % 4 == 0 && year % 100 != 0 && year >= 1584) || (year % 400 == 0 && year >= 1584)) {
            System.out.println(year + " год является високосным");}
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        System.out.println("Задача 4:"); // Задача 4
        byte dayDelivery20Km = 1;
        byte dayDelivery20_60Km = (byte) (dayDelivery20Km +1);
        byte dayDelivery60_100Km = (byte)(dayDelivery20_60Km +1);
        short deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах 20 км, потребуется дней: " + dayDelivery20Km);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км, потребуется дней: " + dayDelivery20_60Km );
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах от 60 км до 100 км, потребуется дней: " + dayDelivery60_100Km);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        System.out.println();

        System.out.println("Задача 5:"); // Задача 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Программа не будет выполняться (номер месяца больше 12).");
        }
    }
}



