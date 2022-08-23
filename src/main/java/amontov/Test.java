package amontov;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Box<Apple> boxApple = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple2);
        boxApple.addFruit(apple3);
        System.out.println(boxApple.getWeight());

        Box<Orange> boxOrange = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange2);
        System.out.println(boxOrange.getWeight());

        System.out.println(boxApple.compare(boxOrange));

        String[] strings = new String[5];
        strings[0] = "1";
        strings[1] = "2";
        strings[2] = "3";
        strings[3] = "4";
        strings[4] = "5";
        System.out.println(createList(strings));
        System.out.println(Arrays.toString(changeArr(strings, 0, 1)));
    }

    //  1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static Object[] changeArr(Object[] arr, int index1, int index2) {
        Object x = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = x;
        return arr;
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public static <T> List<T> createList(T arr[]) {
        return Arrays.asList(arr);
    }
}
