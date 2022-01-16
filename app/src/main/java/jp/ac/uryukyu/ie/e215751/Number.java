package jp.ac.uryukyu.ie.e215751;

import java.util.ArrayList;
import java.util.Collections;

public class Number {
    public static void main(String[] argas){

        CommandSelector co = new CommandSelector();
        co.selectNumber();
        ArrayList<Integer> select = co.getSelect();
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> player = new ArrayList<Integer>();

        for(int i = 0;i < 10;i++){
            list.add(i);
            player.add(i);
        }

        Collections.shuffle(list);
        Collections.shuffle(player);

        ArrayList<Integer> list_3 = new ArrayList<Integer>();
        ArrayList<Integer> player_list = new ArrayList<Integer>();
        
        for(int j = 0;j < 3;j++){
            list_3.add(list.get(j));
            player_list.add(player.get(j));

        }
        System.out.println(list_3);
        //System.out.println(player_list);

        //System.out.println(list_3.contains(1));
        //System.out.println(list_3.contains(player_list));

        int eat = 0;
        int bite = 0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(list_3.get(j)==select.get(i)){
                    if(j==i){
                        eat++;
                    }else{
                        bite++;
                    }
                }
            }
        }
        System.out.println(eat+"eat,"+bite+"bite");
        
    }

}
