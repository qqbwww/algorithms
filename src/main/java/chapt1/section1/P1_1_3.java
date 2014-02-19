package chapt1.section1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Created by qianqinbo on 14-2-19.
 */
public class P1_1_3 {

    public static void main(String[] args){
        if(args.length <3){
            StdOut.println("please enter 3 integer");
        }else{
            if((Integer.parseInt(args[0]) == Integer.parseInt(args[1])) && (Integer.parseInt(args[1]) == Integer.parseInt(args[2]))){
                StdOut.println("equals");
            }else{
                StdOut.println("not equals");
            }
        }

    }
}
