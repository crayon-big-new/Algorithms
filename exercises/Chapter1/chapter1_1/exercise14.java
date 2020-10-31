package exercises.chapter1_1;

public class exercise14 {


    //计算2的n次幂
    public static double power(int n) {

        double answer = 1.0;

            for(; n > 0; n--) {
                answer = answer * 2.0;
            }

        return answer;
    }

    /**
     * 返回一个不大于log_2(N)的最大整数，不能使用Math库
     */
    public static int lg(int N) {

       int i = 0;

       for (; power(i) <= (double)N; i++);

        return i - 1;

    }

    public static void main(String[] args) {

        System.out.println(lg(33));


    }
}
