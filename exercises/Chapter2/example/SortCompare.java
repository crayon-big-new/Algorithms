package example;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Scanner;

public class SortCompare {
    
    //计算该排序算法的运行时间
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if(alg.equals("Insertion")) {
            InsertSort.sort(a);
        } else if(alg.equals("Selection")) {
             {
                SelectSort.sort(a);
            }
        } else if(alg.equals("Shell")) {
            ShellSort.sort(a);
        }
        return timer.elapsedTime();
    }
    
    /**
     *
     * @param alg：指定排序算法
     * @param N：指定数组大小
     * @param T：指定重复次数
     * @return 运行时间
     */
    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for(int t = 0; t < T; t++) {
            for(int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total = total + time(alg, a);
        }
        return total;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alg1 = in.nextLine();
        String alg2 = in.nextLine();
        int N = in.nextInt();
        int T = in.nextInt();
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        System.out.printf("对于 %d 个随机Double值,重复运行了 %d 次\n", N,T);
        System.out.printf(alg1 + "算法的运行速度比" + alg2 + "算法快 %.2f 倍", t2/t1);
        in.close();
    }
}
