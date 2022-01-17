package jp.ac.uryukyu.ie.e215751;

import java.util.Scanner;
import java.util.ArrayList;

public class CommandSelector{
    ArrayList<Integer> select = new ArrayList<Integer>();

    public ArrayList<Integer> getSelect(){
        return select;
    }

    /**
     * プレイヤーが３桁の数を入力できるメソッド。
     * 入力した数値を100の位、10の位、1の位に分けてリスト化する。
     */
    public void selectNumber(){
        System.out.println("3桁の数字を入力してください");
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
    
        int len = String.valueOf(num).length();
        int d = (int)Math.pow(10,len-1);

        for(int i = 0; i < 3;i++){
            select.add(num/d);
            num %= d;
            d/=10;
        }
    }
}