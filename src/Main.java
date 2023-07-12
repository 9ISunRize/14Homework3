public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int one = 2147483647;
        System.out.println("Значение переменной с типом int равно " + one);
        byte two = 127;
        System.out.println("Значение переменной с типом byte равно " + two);
        short three = 32767;
        System.out.println("Значение переменной с типом short равно " + three);
        long four;
        four = 1;
        System.out.println("Значение переменной с типом long равно " + four);
        float five = 3.4E+38F;
        System.out.println("Значение переменной с типом float равно " + five);
        double six = 1.7E+308;
        System.out.println("Значение переменной с типом double равно " + six);
    }
    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println("Значение переменной с типом long равно 987678965549");
        double c = 2.786;
        short d = 569;
        short i = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int totalSheerts = 480;
        byte totalStudents = 23+27+30;
        int sheetsForEachStudent = totalSheerts / totalStudents;
        System.out.println("На каждого ученика рассчитано "+sheetsForEachStudent+ " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int machinePerformanceInAMin = 16/2;;
        int machinePerformanceInA20Min = machinePerformanceInAMin * 20;
        int machinePerformanceInADay = machinePerformanceInAMin*60*24;
        int machinePerformanceInA3Day = machinePerformanceInAMin*60*24*3;
        int machinePerformanceInAMonth = machinePerformanceInAMin*60*24*31;
        System.out.println("За 20 минут машина произвела "+machinePerformanceInA20Min+ " штук бутылок ");
        System.out.println("За сутки машина произвела "+machinePerformanceInADay+ " штук бутылок ");
        System.out.println("За 3 дня машина произвела " +machinePerformanceInA3Day+ " штук бутылок ");
        System.out.println("За месяц машина произвела "+machinePerformanceInAMonth+ " штук бутылок ");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int white =2;
        int brown =4;
        int totalCans = 120;
        int cansforOneClass = white+brown;
        int classes = totalCans/cansforOneClass;
        int cansWhite = classes * white;
        int cansBrown = classes * brown;
        System.out.println("В школе, где "+classes+" классов, нужно "+cansWhite+ " банок белой краски и "+cansBrown+" банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5*80;
        int  milk = 105*2;
        int  iceCreamSundae = 100*2;
        int rawEggs = 4*70;
        int breakfast = bananas+milk+iceCreamSundae+rawEggs;
        double breakfastkg = breakfast/1000;
        System.out.println(breakfastkg+" кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int dayFor1SportsDiet = 7000/250;
        int dayFor5SportsDiet = 7000/500;
        System.out.println( dayFor1SportsDiet+" дней понадобится спортсмену, если он каждый день будет худеть на 250 грам");
        System.out.println( dayFor5SportsDiet+" дней понадобится спортсмену, если он каждый день будет худеть на 500 грамм");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int wagesMisha = 67760;
        int wagesDenis = 83690;
        int wagesKristina = 76230;
        int increaseWagesMisha = wagesMisha / 100 * 110;
        int increaseWagesDenis = wagesDenis / 100 * 110;
        int increaseWagesKristina = wagesKristina / 100 * 110;
        int difference1 = increaseWagesMisha - wagesMisha;
        int difference2 = increaseWagesDenis - wagesDenis;
        int difference3 = increaseWagesKristina - wagesKristina;
        System.out.println("Маша теперь получает " + increaseWagesMisha + " рублей. Годовой доход вырос на " + difference1 + " рублей");
        System.out.println("Денис теперь получает " + increaseWagesDenis + " рублей. Годовой доход вырос на " + difference2 + " рублей");
        System.out.println( "Кристина теперь получает "+ increaseWagesKristina+" рублей. Годовой доход вырос на "+difference3 +" рублей");
    }
}

