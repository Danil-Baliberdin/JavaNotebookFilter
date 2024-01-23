package JavaRush.SyntaxZero;

import java.util.concurrent.TimeUnit;

public class ThreadSleep {
    public void ObratniiOtschet(int x) throws InterruptedException {
        for (int i = 0; i < x; x--) {
            TimeUnit.SECONDS.sleep(1);//здесь тема в TimeUnit она может паузить программу на столько на сколько надо
            System.out.println(x);
        }
    }
}
