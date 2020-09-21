package lesson1;

import lesson1.fruit.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit, Y extends String> {
    private T[] obj;
    private Y typeFruit;
    private ArrayList<T> arrayList = new ArrayList<>();
    private int numberOfFruit = 0;

    public Box(Y typeFruit, T... obj) {
        this.obj = obj;
        this.typeFruit = typeFruit;
    }


    public void putFruit(T objFruit) {
        if (typeFruit.equals(objFruit.getClass().getSimpleName())) {
            arrayList.add(objFruit);
            numberOfFruit++;
        }
    }

    public void getFruit() {
        if (arrayList.size() > 0) {
            arrayList.remove(arrayList.size() - 1);
            numberOfFruit--;
        }
    }

    public float getWeight() {
        float weightBox = 0.0f;
        T tempObj;
        if (arrayList.size() > 0) {
            tempObj = arrayList.get(0);
            weightBox = tempObj.getWeight() * arrayList.size();
        }
        return weightBox;
    }

    public boolean compare(Box another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0000001f;
    }

    public void replaceFruits(Box anotherBox) {
        if (typeFruit.equals(anotherBox.typeFruit)) {
            while (arrayList.size() > 0) {
                anotherBox.putFruit(arrayList.get(arrayList.size() - 1));
                getFruit();
            }
        } else {
            System.out.println("Нельзя из одной коробки в другую пересыпать разные фрукты");
        }
    }

    public void showInfo() {
        System.out.println("В коробке хранятся фрукты: " + typeFruit + ", в количестве " + numberOfFruit + " шт. общим весом " + getWeight());
    }

}
