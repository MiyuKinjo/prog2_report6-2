package jp.ac.uryukyu.ie.e215751;

public class RuleExplanation {
    /**
     * ルール説明をするメソッド。
     */
    public void print(){
        String text = "ゲームを開始します。\n" + 
        "0~9の重複しない３桁の数を当ててください。\n" + 
        "数字と位置が合っていた場合、eat \n" + 
        "数字が合っていて位置が違う場合、bite \n" +
        "とカウントされます。";
        System.out.println(text);   
    }   
}
