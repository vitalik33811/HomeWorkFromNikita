package java;
/*В классе Военный добавляются поля:
        - Наличие системы катапультирования (true/false)
        - Кол-во ракет на борту*/
/*В конечных классах (Легковой, Грузовой, Военный, Гражданский)
        разработать метод описание который будет возвращать составленную строку
        с описанием всех характеристик объекта.
        В строку включить ещё один параметр мощность в киловаттах (кВ). Расчёт
        мощности в киловаттах производится в отдельном методе: 1 л.с = 0.74 кВ*/
/*Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет
        не равно 0 то выводим на консоль “ Ракета пошла...”, если 0 то “Боеприпасы
        отсутствуют”.
        А так же метод катапультирование, который проверит если наличие системы
        катапультирования true, то выводим “Катапультирование прошло успешно”, если false,
        то "У вас нет такой системы"*/
import java.util.Random;
import java.util.Scanner;

public class Military extends Air {
    public boolean ejectionSystem;
    public int numberOfMissiles;

    public Military() {
        this.power = 20000;
        this.maxSpeed = 2400;
        this.weight = 22;
        this.brand = "Ан-22";
        this.wingspan = 15; //м
        this.minRunLen = 600;
        this.ejectionSystem = false;
        this.numberOfMissiles = 0;
        this.kv = 0.74;
        enterMilitary();
        powerKvMilitary();
        shotMilitary();
        catapult();
    }

    public void powerKvMilitary() {
        double powerKv = power * kv;
        System.out.println("Мощность в киловаттах: " + powerKv + " кВ");
    }

    void enterMilitary() {
        System.out.println();
        System.out.println("Военный транспорт:");
        System.out.println("Мощность: " + power + " h/p ");
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч ");
        System.out.println("Вес: " + weight + " т ");
        System.out.println("Марка: " + brand);
        System.out.println("Размах крыльев: " + wingspan + " м ");
        System.out.println("Минимальная длина взлётно-посадочной полосы для взлёта: " + minRunLen);
        System.out.println("Наличие системы катапультирования: " + ejectionSystem);
        System.out.println("Кол-во ракет на борту: " + numberOfMissiles);
    }

    public void shotMilitary() {
        Scanner numberOfMissiless = new Scanner(System.in);
        System.out.println("Введите количество ракет: ");
        this.numberOfMissiles = numberOfMissiless.nextInt();
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        Random random = new Random();
        this.ejectionSystem = random.nextBoolean();
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет системы катапультирования");
        }
    }
}