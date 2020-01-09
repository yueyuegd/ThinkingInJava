package concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author zhangyue95
 * @date 2020/1/8.
 * 使用Fork/Join计算斐波那契数列
 */
public class FibonacciForkJoinDemo {

    public static void main(String[] args) {
        //创建分治任务线程池
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        //创建分治任务
        Fibonacci fibonacci = new Fibonacci(30);
        //启动分治任务
        Integer result = forkJoinPool.invoke(fibonacci);
        //输出结果
        System.out.println(result);

    }

    static class Fibonacci extends RecursiveTask<Integer> {
        final int n;
        Fibonacci(int n) {
            this.n = n;
        }

        @Override
        protected Integer compute() {
            if (n <= 1) {
                return n;
            }
            Fibonacci f1 = new Fibonacci(n - 1);
            //创建子任务
            f1.fork();
            Fibonacci f2 = new Fibonacci(n - 2);
            //等待子任务结果，并合并结果
            return f2.compute() + f1.join();
        }
    }
}
