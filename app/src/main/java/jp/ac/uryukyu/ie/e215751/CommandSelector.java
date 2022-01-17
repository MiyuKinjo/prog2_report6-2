package jp.ac.uryukyu.ie.e215751;

import java.util.Scanner;
import java.util.ArrayList;

public class CommandSelector{
    ArrayList<Integer> select = new ArrayList<Integer>();

    public ArrayList<Integer> getSelect(){
        return select;
    }

    //public static void main(String[] args){
    public void selectNumber(){
        System.out.println("3桁の数字を入力してください");
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        //System.out.println("入力された文字は「" + num + "」です");

        //ArrayList<Integer> select = new ArrayList<Integer>();
    
        int len = String.valueOf(num).length();
        int d = (int)Math.pow(10,len-1);

        for(int i = 0; i < 3;i++){
            select.add(num/d);
            num %= d;
            d/=10;
        }
        //System.out.println(select);
    }
}