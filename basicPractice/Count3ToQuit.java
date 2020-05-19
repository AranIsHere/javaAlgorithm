package basicPractice;

import java.util.Scanner;

/**
 * 题目：
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的退出圈子，问最后留下的是原来第几号的那位？
 * 
 * @author tonylp
 */
public class Count3ToQuit {
    public static void main(String[] args){
        System.out.println("请输入总人数：");
        Scanner sc = new Scanner(System.in);
        int perCounter = sc.nextInt();

        int[] countedPer = new int[perCounter];
        int i = 0;
        int curNumber = 0;
        while(perCounter > 1){
            if(countedPer[i] == 0){
                curNumber++;
                if(curNumber == 3){
                    curNumber = 0;
                    countedPer[i] = 1;
                    perCounter --;
                }
            }
            i++;
            if(i == countedPer.length){
                i = 0;
            } 
        }
        for (int j = 0; j < countedPer.length; j++) {
            if(countedPer[j] != 1){
                System.out.println(j+1);
            }
        }

    }
}