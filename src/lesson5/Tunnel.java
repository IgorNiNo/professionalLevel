package lesson5;

import static lesson5.Main.lock;
import static lesson5.Main.smp;

public class Tunnel extends Stage {

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                smp.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.lock();
                System.out.println(c.getName() + " закончил этап: " + description);
                smp.release();
                lock.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}