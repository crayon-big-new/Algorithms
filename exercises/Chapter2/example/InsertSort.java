package example;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.Stopwatch;

public class InsertSort {
    
    public static void sort(Comparable[] a) {
        int N = a.length;
        //i从1开始，不需要排第一个元素，一直到最后一个
        for(int i = 1; i < N; i++) {
            //j不能为0，即第一个元素
            for(int j = i; j > 0; j--) {
                //如果a[j] < a[j + 1]，交换元素
                if(less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                    //如果a[j]大于a[j - 1]，自然大于a[j - 1]前所有元素，所以结束这次循环
                } else {
                    break;
                }
            }
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
        Integer[] numbers = new Integer[1000000];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        sort(numbers);
        System.out.println(isSorted(numbers));
    }
    
}
