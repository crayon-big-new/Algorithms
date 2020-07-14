package exercises.chapter1_1;

public class exercise6 {

    //会打印斐波那契数列的前16个数字
    public static void main(String[] args) {

        int f = 0;
        int g = 1;

        for(int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
