package java;
/*В классе Грузовой добавляется поле:
        - Грузоподъёмность(т)*/
/*В конечных классах (Легковой, Грузовой, Военный, Гражданский)
        разработать метод описание который будет возвращать составленную строку
        с описанием всех характеристик объекта.
        В строку включить ещё один параметр мощность в киловаттах (кВ). Расчёт
        мощности в киловаттах производится в отдельном методе: 1 л.с = 0.74 кВ*/
/*Для грузового разработать метод который проверит можно ли загрузить в
        него xxx груза Метод должен проверять если это кол-во груза помещается в грузовик то
        выводит в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить
        больше чем то которое может влезть в наш грузовик то выводим “Вам нужен грузовик
        побольше ”.*/


import java.util.Scanner;

public class Cargo extends Terrestrial {
    public int carryingCapacity;

    public Cargo() {
        this.power = 350;
        this.maxSpeed = 160;
        this.weight = 3000;
        this.brand = "Man";
        this.numberOfWheels = 6;
        this.fuelConsumption = 25; // литры
        this.carryingCapacity = 10; // тонны
        this.kv = 0.74;
        enterCargo();
        powerKvCargo();
        cargoСapacity();
    }

    public void powerKvCargo() {
        double powerKv = power * kv;
        System.out.println("Мощность в киловаттах: " + powerKv + " кВ");
    }

    public void enterCargo() {
        System.out.println();
        System.out.println("Грузовой транспорт: ");
        System.out.println("Мощность: " + power + " h/p ");
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч ");
        System.out.println("Вес: " + weight + " т ");
        System.out.println("Марка: " + brand);
        System.out.println("Количество колёс: " + numberOfWheels);
        System.out.println("Расход топлива: " + fuelConsumption + " л ");
        System.out.println("Грузоподъемность: " + carryingCapacity + " т");
    }

    public void cargoСapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес груза: ");
        int capacity = scanner.nextInt();
        if (capacity <= carryingCapacity) {
            System.out.println("Грузовик загружен ");
        } else {
            System.out.println("Вам нужен грузовик побольше ");
        }
    }
}