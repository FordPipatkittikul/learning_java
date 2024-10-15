package threadsEX;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutoeEx {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task1 = () -> System.out.println("Executing task1 inside" + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Executing task2 inside" + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Executing task3 inside" + Thread.currentThread().getName());

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);

        executor.shutdown(); // executor accept no new tasks and shut down after all running threads finish
    }
}
