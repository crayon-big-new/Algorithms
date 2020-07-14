package exercises.chapter1_1;

public class exercise15 {

    // 第一种方法
//    public static int[] histogram(int[] a, int M) {
//
//        int[] b = new int[M];
//
//        for(int i = 0; i < b.length; i++) {
//            for(int j = 0; j < a.length; j++) {
//                if(a[j] == i) {
//                    b[i]++;
//                }
//            }
//        }
//        return b;
//
//    }
    //第二种方法
    public static int[] histogram(int[] a, int M) {

        int[] b = new int[M];

        for(int i = 0; i < a.length; i++) {

            if(a[i] < M) {

                b[a[i]]++;
            }
        }

        return b;
    }

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 3, 5, 4, 5, 4, 7, 8, 5, 6, 6, 2, 3, 1};
        int[] b = histogram(a, 7);

        for(int i : b) {
            System.out.println(i);
        }
    }
}
