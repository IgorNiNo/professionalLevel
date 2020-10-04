package lesson5;

import static lesson5.Main.lock;

public class Road extends Stage {

    private static boolean isWin;

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            lock.lock();
            System.out.println(c.getName() + " закончил этап: " + description);
            if (!isWin && c.isLastStage()) {
                isWin = true;
                System.out.println(c.getName() + " - WIN");
            }
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}