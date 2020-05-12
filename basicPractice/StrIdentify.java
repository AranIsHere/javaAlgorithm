package basicPractice;

import java.util.Scanner;

/**
 * 题目：
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其他字符的个数。
 * 程序分析：
 * 利用while循环，条件为输入的字符不能为'\n'.
 * 
 * @author tonylp
 */
public class StrIdentify {
    public static void main(String[] args){
        var abcCount = 0;
        var spaceCount = 0;
        var numCount = 0;
        var otherCount = 0;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(var i = 0; i < ch.length; i++){
            if(Character.isDigit(ch[i])){
                numCount++;
            }else if(Character.isSpaceChar(ch[i])){
                spaceCount++;
            }else if(Character.isLetter(ch[i])){
                abcCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("字母的个数："+abcCount);
        System.out.println("数字个数："+numCount);
        System.out.println("空格个数："+spaceCount);
        System.out.println("其他字符个数："+otherCount);
    }
}