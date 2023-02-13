package uk.ac.sussex.inf.ianw.os.concurrency;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static final int SIZE = 1000;
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int[] array = new int[SIZE];
        for(int i = 0;i< SIZE;i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        SumTask task = new SumTask(0,SIZE-1, array);
        System.out.println(pool.invoke(task));
    }
}
