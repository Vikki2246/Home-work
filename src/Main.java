public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание №1:
        byte bananas = 7;
        short apples = 155;
        int mangoes = 457;
        long pears = 68;

        float appleWeight = 24.7f;
        double meatWeight = 31.56;
        char orangesWeight = 43;
        System.out.println(orangesWeight);
        boolean bananasIsAdult = bananas > 5;
        System.out.println(bananasIsAdult);

        // Задание №2:
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double boxer1AndBoxer2 = boxer1 + boxer2;
        double difference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + boxer1AndBoxer2);
        System.out.println("Разница " + difference);

        // Задание №3:
        short banana = 5;
        int allBananas = banana * 80;
        System.out.println("Вес бананов " + allBananas);
        int milk = 105;
        int allMilk = milk * 2;
        System.out.println("Вес молока " + allMilk);
        int iceCream = 100;
        int twoIceCream = iceCream * 2;
        System.out.println("Вес мороженого " + twoIceCream);
        int agg = 70;
        int allAgg = agg * 4;
        System.out.println("Вес яиц " + allAgg);
        int weightBreakfast = allBananas + allMilk + twoIceCream + allAgg;
        System.out.println("Вес завтрака в граммах " + weightBreakfast);
        float weightKg = weightBreakfast / 1000;
        System.out.println("Вес завтрака в килограммах " + weightKg);

        // Задание №4:
        int allWeighKg = 7;
        int allWeightGr = allWeighKg * 1000;
        System.out.println("Вес который нужно скинуть " + allWeightGr + " грамм");
        int oneHappening = allWeightGr / 250;
        System.out.println("Если спротсмен будет сбрасывать по 250гр, то на это уйдет " + oneHappening + " дней");
        int twoHappening = allWeightGr / 500;
        System.out.println("Если спротсмен будет сбрасывать по 500гр, то на это уйдет " + twoHappening + " дней");
        int all = oneHappening + twoHappening;
        int averageTime = all / 2;
        System.out.println("В среднем спортсмену потребуется " + averageTime + " дней");
        // Ответ: 21

        // Задание №5:
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        int percentMasha = 6_776;
        int percentDenis = 8_369;
        int percentKristina = 7_623;
        int newSalaryMasha = salaryMasha + percentMasha;
        int newSalaryDenis = salaryDenis + percentDenis;
        int newSalaryKristina = salaryKristina + percentKristina;
        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKristina = salaryKristina * 12;
        int newYearSalaryMasha = newSalaryMasha * 12;
        int newYearSalaryDenis = newSalaryDenis * 12;
        int newYearSalaryKristina = newSalaryKristina * 12;
        int differenceSalaryMasha = newYearSalaryMasha - yearSalaryMasha;
        int differenceSalaryDenis = newYearSalaryDenis - yearSalaryDenis;
        int differenceSalaryKristina = newYearSalaryKristina - yearSalaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырс на " + differenceSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей.");


    }
}