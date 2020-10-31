package example;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.Stopwatch;

public class ShellSort {
    
    public static void sort(Comparable[] a) {
        int N = a.length, h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            //i从h开始，因为0 ~ (h - 1)是各子数组的第一个元素
            for(int i = h; i < N; i++) {
                //j>=h，因为当j为子数组的第二个元素时，j - h就是子数组第一个。每次都要比较a[j]和a[j-1]
                for(int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
    
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    public static boolean isSorted(Comparable[] a) {
        for(int i = 1; i < a.length; i++) {
            if(less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    
    public static void show(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10000000];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        sort(numbers);
        System.out.println(isSorted(numbers));
        
    }
    
}

