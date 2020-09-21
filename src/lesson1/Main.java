package lesson1;

import lesson1.fruit.Apple;
import lesson1.fruit.Fruit;
import lesson1.fruit.Orange;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt1 = {1, 2, 3, 4, 5, 6, 7};
        String[] arrStr1 = {"a1", "bb2", "ccc3", "dddd4", "eeeee5"};
        Integer[] arrIntegerNew;
        String[] arrStringNew;
        ArrayList<Integer> arrList1;
        ArrayList<String> arrList2;

        //задание 1
        System.out.println("Задание 1");
        printArr(arrInt1);
        System.out.println("Меняем элементы массива местами");
        arrIntegerNew = replaceArrElements(0,6,arrInt1);
        printArr(arrIntegerNew);
        System.out.println();

        printArr(arrStr1);
        System.out.println("Меняем элементы массива местами");
        arrStringNew = replaceArrElements(4,2,arrStr1);
        printArr(arrStringNew);
        System.out.println();

        //задание 2
        System.out.println("Задание 2");
        arrList1 = arrToArrList(arrInt1);
        arrList1.add(1234); //проверка работы методов ArrayList
        System.out.println("Полученный ArrayList: " + arrList1);

        arrList2 = arrToArrList(arrStr1);
        arrList2.add("test"); //проверка работы методов ArrayList
        System.out.println("Полученный ArrayList: " + arrList2);
        System.out.println();


        //задание 3
        System.out.println("Задание 3");
        Fruit[] fruits = {
                new Apple("Яблоко"),
                new Orange("Апельсин"),
                new Apple("Яблоко"),
                new Apple("Яблоко"),
                new Orange("Апельсин"),
                new Orange("Апельсин"),
                new Orange("Апельсин"),
                new Apple("Яблоко"),
                new Apple("Яблоко"),
                new Apple("Яблоко")
        };
        Fruit fruitBox3 = new Apple("Яблочко");

        Box box1 = new Box("Apple", fruits);
        Box box2 = new Box("Orange", fruits);
        Box box3 = new Box("Apple", fruitBox3);

        for (int i = 0; i < fruits.length; i++) {
            box1.putFruit(fruits[i]);
            box2.putFruit(fruits[i]);
        }
        box3.putFruit(fruitBox3);

        // задание 3 d
        System.out.println("Коробка box1");
        box1.showInfo();
        System.out.println("Коробка box2");
        box2.showInfo();
        System.out.println("Коробка box3");
        box3.showInfo();
        System.out.println();

        // задание 3 e
        System.out.println("Сравним вес коробок box1 и box2");
        System.out.println("Вес сравниваемых коробок - " + box1.compare(box2));
        System.out.println();

        // задание 3 f
        System.out.println("Пересыпем содержимое коробки box1 в коробку box3");
        box1.replaceFruits(box3);
        System.out.println("Результат:");
        box1.showInfo();
        box3.showInfo();
    }


    public static <T> T[] replaceArrElements(int indexFirst, int indexSecond, T... arr) {
        T temp;
        if (arr.length > indexFirst && arr.length > indexSecond && indexFirst >= 0 && indexSecond >= 0) {
            temp = arr[indexFirst];
            arr[indexFirst] = arr[indexSecond];
            arr[indexSecond] = temp;
        } else {
            System.out.println("Перестановка двух элементов массива местами невозможна. Введены некорректные индексы");
        }
        return arr;
    }

    public static <T> void printArr(T... arr) {
        System.out.print("Массив имеет вид: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static <T> ArrayList<T> arrToArrList(T... arr) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        return arrayList;
    }


}
