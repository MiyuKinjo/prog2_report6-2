package jp.ac.uryukyu.ie.e215751;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MakeNumberTest {
    /**
     * ランダムに生成された数値が３桁のリストになっていることを検証する。
     * 
     * 検証手順
     * (1)ランダムに生成された数値が入ったリストを用意。
     * 
     * (2)リストのサイズを取得し、３になっていることを期待する。
     */
    
     @Test
    void MakeNumberTest(){
        MakeNumber mn = new MakeNumber();
        mn.makeNumber();
        ArrayList<Integer> list = mn.getList();
        int size = list.size();
        assertEquals(size,3);
    }
}
    
