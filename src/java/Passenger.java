package java;
/*В классе Легковой добавляются поля:
        - Тип кузова
        - Кол-во пассажиров*/
/*В конечных классах (Легковой, Грузовой, Военный, Гражданский)
        разработать метод описание который будет возвращать составленную строку
        с описанием всех характеристик объекта.
        В строку включить ещё один параметр мощность в киловаттах (кВ). Расчёт
        мощности в киловаттах производится в отдельном методе: 1 л.с = 0.74 кВ*/
/*Для легкового разработать метод который будет принимать время и считать
        сколько километров проедет машина двигаясь с максимальной скоростью и
        сколько топлива она израсходует за это время, результат вывести в консоль,
        расчёт израсходуемого топлива вынести в отдельный метод private.
        Результат работы метода должен вывести такую строчку: За время (ваше
        введённое время) ч, автомобиль (марка автомобиля) двигаясь с максимальной
        скоростью (ваша максимальная скорость) км/ч проедет (xxx) км и израсходует (xxx)
        литров топлива.*/

import java.util.Scanner;

class Passenger extends Terrestrial {
    public String bodyType;
    public int numberOfPassengers;
    int distance;
    int time;

    public Passenger() {
        this.power = 130;
        this.maxSpeed = 220;
        this.weight = 1600;
        this.brand = "Ford";
        this.bodyType = "Хэчбэк";
        this.numberOfPassengers = 5;
        this.numberOfWheels = 4;
        this.fuelConsumption = 10;
        this.kv = 0.74;
        enterPassenger();
        powerKvPassenger();
        time();
    }

    public void powerKvPassenger() {
        double powerKv = power * kv;
        System.out.println("Мощность в киловаттах: " + powerKv + " кВ");
    }

    public void enterPassenger() {
        System.out.println();
        System.out.println("Легковой транспорт: ");
        System.out.println("Мощность: " + power + " h/p ");
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч ");
        System.out.println("Вес: " + weight + " т ");
        System.out.println("Марка: " + brand);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println(" Кол-во пассажиров: " + numberOfPassengers);
        System.out.println("Количество колёс: " + numberOfWheels);
        System.out.println("Расход топлива: " + fuelConsumption + " л ");

    }

    public void time() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько времени должен ехать легковой транспорт: ");
        int time = scanner.nextInt();
        int distance = time * maxSpeed;
        System.out.println("Машина проедет с максимальной скоростью: " + distance + " км ");
        System.out.println();
        this.distance = distance;
        this.time = time;
        fuelConsumption();
    }

    private void fuelConsumption() {
        int fuel = distance / fuelConsumption;
        System.out.println("За время " + time + " ч" + " автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч проедет " + distance + " км и израсходует " + fuel + " литров топлива. ");
        System.out.println();
    }
}