import javax.swing.plaf.synth.SynthUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание №1:
        int clientOS = 1;
        boolean iOS = clientOS < 1;
        if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание №2:


    }
}