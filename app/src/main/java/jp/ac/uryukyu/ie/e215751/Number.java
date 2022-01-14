package jp.ac.uryukyu.ie.e215751;

import java.util.ArrayList;
import java.util.Collections;

public class Number {
   
    public static void main(String[] argas){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0;i < 10;i++){
            list.add(i);
        }

        Collections.shuffle(list);
        System.out.println(list);
    }
}
