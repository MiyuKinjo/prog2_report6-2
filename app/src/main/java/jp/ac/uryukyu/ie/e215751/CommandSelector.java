package jp.ac.uryukyu.ie.e215751;

import java.util.Scanner;
import java.util.ArrayList;

public class CommandSelector{
    
    public static void main(String[] args){
        System.out.println("キーボードから入力してください");
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        System.out.println("入力された文字は「" + num + "」です");

        ArrayList<Integer> player = new ArrayList<Integer>();

        int len = String.valueOf(num).length();
        int d = (int)Math.pow(10,len-1);

        for(int i = 0; i < 3;i++){
            player.add(num/d);
            num %= d;
            d/=10;
        }
        System.out.println(player);

    }

    
    

}