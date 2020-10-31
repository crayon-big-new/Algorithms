package example;

import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;

public class SelectSort {
    
    public static void sort(Comparable[] a) {
        //i从0到a.length - 1
        for(int i = 0; i < a.length; i++) {
            //将i对应元素设为最小值
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                //如果a[j]小于a[i](后面的小于前面的)，就把min设为j
                if(less(a[j], a[min])) {
                    min = j;
                }
            }
            //每结束一个循环，就交换最小值和a[i]
            exch(a, i, min);
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
        Integer[] numbers = new Integer[100000];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        sort(numbers);
        System.out.println(isSorted(numbers));
    
    }
    
}
