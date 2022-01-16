package jp.ac.uryukyu.ie.e215751;

import java.util.ArrayList;
import java.util.Collections;

public class Number {
    public static void main(String[] argas){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> player = new ArrayList<Integer>();

        for(int i = 0;i < 10;i++){
            list.add(i);
            player.add(i);
        }

        Collections.shuffle(list);
        Collections.shuffle(player);
        //System.out.println(list);
        //System.out.println(list.get(0));

        ArrayList<Integer> list_3 = new ArrayList<Integer>();
        ArrayList<Integer> player_list = new ArrayList<Integer>();
        
        for(int j = 0;j < 3;j++){
            list_3.add(list.get(j));
            player_list.add(player.get(j));

        }
        System.out.println(list_3);
        System.out.println(player_list);

        System.out.println(list_3.contains(1));
        System.out.println(list_3.contains(player_list));

        int l = 0;

        for(int k = 0;k<3;k++){
            int a = list_3.get(k);
            int b = player_list.get(k);
           
            if( a == b){
                l++;
            }

        }
        System.out.println(l+"eat");

    }
}
