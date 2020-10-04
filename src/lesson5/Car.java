package lesson5;

import java.util.concurrent.BrokenBarrierException;
import static lesson5.Main.cdlPreRun;
import static lesson5.Main.cdlFinished;
import static lesson5.Main.cb;

public class Car implements Runnable {

    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private boolean isLastStage;

    public boolean isLastStage() {
        return isLastStage;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        isLastStage = false;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cdlPreRun.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            if (i == (race.getStages().size() - 1)) {
                isLastStage = true;
            }
            race.getStages().get(i).go(this);
        }

        cdlFinished.countDown();

    }

}