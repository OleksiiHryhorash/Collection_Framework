package javaExamplesCollection.ex_005_map.treeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создали карту изображений
        NavigableMap<String, Car> nm = new TreeMap();
        // Заполняем map<key, value>
        nm.put("Evgeniy", new Car(7000));
        Car c = new Car(8000);
        nm.put("Alex", c);
        nm.put("Edward", new Car(5000));
        nm.put("Edward", new Car(6000));
        // Выводим на экран все содержимое
        System.out.println(nm);
        // Пытаемся получить значение с именем Serg
        System.out.println(nm.get("Serg"));
        // Проверяем, существует ли ключ в Map
        System.out.println(nm.containsKey("Ann"));
        System.out.println(nm.containsValue(new Car(8000)));
        System.out.println(nm.containsValue(c));
        // Заполняем ключами
        Set<String> keys = nm.keySet();
        // Заполняем значениями
        Collection<Car> cars = nm.values();
        System.out.println(keys);
        System.out.println(cars);
        // Записали содержимое TreeMap в Set
        Set<Map.Entry<String, Car>> s = nm.entrySet();
        System.out.println(s);
        for (Map.Entry<String, Car> temp : s) {
            temp.setValue(new Car(10000));
        }
        System.out.println(s);
    }
}

class Car {
    int price;

    Car(int price) {
        this.price = price;
    }

    public String toString() {
        return "" + this.price;
    }
}
