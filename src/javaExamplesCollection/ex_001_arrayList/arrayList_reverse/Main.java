package javaExamplesCollection.ex_001_arrayList.arrayList_reverse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создаем объект arrayList
        ArrayList<String> list = new ArrayList<>();

        // Создаем объект BufferedReader, для дальнейшего ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Циклом заполняем массив arrayList значениями
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значение [" + i + "]");
            String s = reader.readLine();
            // Добавляем значение в конец массива
            list.add(s);
        }

        // Циклом проходим по всей длине arrayList
        for (int i = 0; i < list.size(); i++) {
            // Записываем значение последнего элемента в переменную j
            int j = list.size() - i - 1;
            // Выводим на экран содержимое j
            System.out.println(list.get(j));
        }
    }
}
