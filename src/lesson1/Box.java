package lesson1;

import lesson1.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> container;

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weightBox = 0.0f;
        for (T fruit: container) {
            weightBox += fruit.getWeight();
        }
         return weightBox;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001f;
    }

    public void replaceFruits(Box<? super T> anotherBox) {
        if (anotherBox == this) {
            return;
        }
        anotherBox.container.addAll(this.container);
        this.container.clear();
    }

    public void addFruit(T fruit) {
        container.add(fruit);
    }

    public void showInfo() {
        System.out.println("В коробке хранятся фрукты, в количестве " + container.size() + " шт. общим весом " + getWeight());
    }

}













//public class Box<T extends Fruit, Y extends String> {
//    private T[] obj;
//    private Y typeFruit;
//    private ArrayList<T> arrayList = new ArrayList<>();
//    private int numberOfFruit = 0;
//
//    public Box(Y typeFruit, T... obj) {
//        this.obj = obj;
//        this.typeFruit = typeFruit;
//    }
//
//
//    public void putFruit(T objFruit) {
//        if (typeFruit.equals(objFruit.getClass().getSimpleName())) {
//            arrayList.add(objFruit);
//            numberOfFruit++;
//        }
//    }
//
//    public void getFruit() {
//        if (arrayList.size() > 0) {
//            arrayList.remove(arrayList.size() - 1);
//            numberOfFruit--;
//        }
//    }
//
//    public float getWeight() {
//        float weightBox = 0.0f;
//        T tempObj;
//        if (arrayList.size() > 0) {
//            tempObj = arrayList.get(0);
//            weightBox = tempObj.getWeight() * arrayList.size();
//        }
//        return weightBox;
//    }
//
//    public boolean compare(Box another) {
//        return Math.abs(this.getWeight() - another.getWeight()) < 0.0000001f;
//    }
//
//    public void replaceFruits(Box anotherBox) {
//        if (typeFruit.equals(anotherBox.typeFruit)) {
//            while (arrayList.size() > 0) {
//                anotherBox.putFruit(arrayList.get(arrayList.size() - 1));
//                getFruit();
//            }
//        } else {
//            System.out.println("Нельзя из одной коробки в другую пересыпать разные фрукты");
//        }
//    }
//
//    public void showInfo() {
//        System.out.println("В коробке хранятся фрукты: " + typeFruit + ", в количестве " + numberOfFruit + " шт. общим весом " + getWeight());
//    }
//
//}
