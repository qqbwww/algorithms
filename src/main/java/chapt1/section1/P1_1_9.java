package chapt1.section1;

/**
 * Created by qianqinbo on 14-2-19.
 * 编写一段代码，将一个正整数N用二进制标识并转换为一个String类型的值s
 */
public class P1_1_9 {

    public static void example(int N){
        String s = "";
        for ( int n = N; n > 0; n /=2 ){
            s = (n % 2) + s;
        }
        System.out.println(s);
    }

    public static void api(int N){
        System.out.println(Integer.toBinaryString(N));
    }

    public static void main(String[] args) {
        example(8);
        api(16);
    }
}
