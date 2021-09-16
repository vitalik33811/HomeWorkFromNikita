package java;
/*В классе Гражданский добавляются поля:
        - Кол-во пассажиров
        - Наличие бизнес класса (true/false)*/
/*В конечных классах (Легковой, Грузовой, Военный, Гражданский)
        разработать метод описание который будет возвращать составленную строку
        с описанием всех характеристик объекта.
        В строку включить ещё один параметр мощность в киловаттах (кВ). Расчёт
        мощности в киловаттах производится в отдельном методе: 1 л.с = 0.74 кВ*/
/*Для Гражданского разработать метод который проверит сколько пассажиров поместиться.
        Метод должен проверять если это кол-во пассажиров помещается в самолет то
        выводит в консоль ”Самолет загружен”, если кол-во пассажиров больше чем то
        которое может поместиться в наш самолет то выводим “Вам нужен самолет побольше ”.*/


import java.util.Scanner;

public class Civil extends Air {
    public int numberOfPassengers;
    public boolean businessClass;

    public Civil() {
        this.power = 20000;
        this.maxSpeed = 800;
        this.weight = 88;
        this.brand = "Су-27";
        this.wingspan = 50; //м
        this.minRunLen = 600;
        this.numberOfPassengers = 100;
        this.businessClass = false;
        this.kv = 0.74;
        enterCivil();
        powerKvCivil();
        passengerCapacity();
    }

    public void powerKvCivil() {
        double powerKv = power * kv;
        System.out.println("Мощность в киловаттах: " + powerKv + " кВ");
        System.out.println();
    }

    void enterCivil() {
        System.out.println();
        System.out.println(" Гражданский транспорт:");
        System.out.println("Мощность: " + power + " h/p ");
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч ");
        System.out.println("Вес: " + weight + " т ");
        System.out.println("Марка: " + brand);
        System.out.println("Размах крыльев: " + wingspan + " м ");
        System.out.println("Минимальная длина взлётно-посадочной полосы для взлёта: " + minRunLen);
        System.out.println("Кол-во пассажиров :" + numberOfPassengers);
        System.out.println("Наличие бизнес класса: " + businessClass);
    }

    public void passengerCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров: ");
        int capacity = scanner.nextInt();
        if (capacity <= numberOfPassengers) {
            System.out.println("Самолет загружен ");
        } else {
            System.out.println("Вам нужен самолет побольше ");
        }
    }
}
