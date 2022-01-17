package jp.ac.uryukyu.ie.e215751;

import java.util.ArrayList;
import java.util.Collections;

public class MakeNumber {
    ArrayList<Integer> ramdomList = new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> getList(){
        return list;
    }
    /**
     * 重複しない３桁の数をランダムに生成するメソッド。
     */
    public void makeNumber(){

        for(int i = 0;i < 10;i++){
            ramdomList.add(i);
        }

        Collections.shuffle(ramdomList);
        
        for(int j = 0;j < 3;j++){
            list.add(ramdomList.get(j));
        }

        //　↓正解の数字を表示する。
        //System.out.println(list);
    }
}
