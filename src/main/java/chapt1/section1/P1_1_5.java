package chapt1.section1;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

import java.util.Random;

/**
 * Created by qianqinbo on 14-2-19.
 */
public class P1_1_5 {

    public static void main(String[] args){
        double a = StdRandom.random();
        double b = StdRandom.random();

        StdOut.println(a);
        StdOut.println(b);
        if( a>0 && a <1.0 && b > 0.0 && b < 1.0){
            StdOut.println(true);
        }else{
            StdOut.println(false);
        }
    }
}
