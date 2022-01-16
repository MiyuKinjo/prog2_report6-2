package jp.ac.uryukyu.ie.e215751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandSelector{
    //public static void main(String[] args){
    CommandSelector(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("キーボードから入力してください");

        String str = null;
        try{
            str = br.readLine();
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("入力された文字は「" + str + "」です");
    }
}