package jp.ac.uryukyu.ie.e215751;

import java.util.ArrayList;
//import java.util.Collections;

public class Number {
    public static void main(String[] argas){
        //int eat = 0;
        //int bite = 0;
    
        MakeNumber mn = new MakeNumber();
        mn.makeNumber();
        ArrayList<Integer> list = mn.getList();

        while(true){
            int eat = 0;
            int bite = 0;
            CommandSelector co = new CommandSelector();
            co.selectNumber();
            ArrayList<Integer> select = co.getSelect();
    
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(list.get(j)==select.get(i)){
                        if(j==i){
                            eat++;
                        }else{
                            bite++;
                        }
                    }
                }
            }
            System.out.println(eat+"eat,"+bite+"bite");
        
        if(eat == 3){
            System.out.println("正解です！");
            break;
        }
        }
    }

}
