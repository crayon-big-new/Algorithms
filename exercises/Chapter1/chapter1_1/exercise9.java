package exercises.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class exercise9 {

    public static void main(String[] args) {

        int N = StdIn.readInt();

        String s = "";

        //余数添加到字符串s，然后除于2
        for(; N > 0; N = N / 2) {

            s = (N % 2) + s;
        }

        System.out.println(s);
    }


}
