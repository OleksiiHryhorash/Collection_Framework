package javaExamplesCollection.ex_001_arrayList.arrayList;

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

        // Удаляем последнюю строку и добавляем её в начало
        for (int i = 0; i < 5; i++) {
            String s1 = list.remove(list.size() - 1);
            list.add(0, s1);
        }

        // Выводим на экран все содержимое
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
