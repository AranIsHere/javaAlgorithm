package basicPractice;

import java.util.Scanner;

/**
 * 兔子问题 斐波那契数列求值
 * 
 * @author Aran 题目： 古典问题：有一对兔子， 从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *         假如兔子都不死，问每个月的兔子总数为多少？ 1，1，2，3，5，8，13 涉及知识：菲波那切数列，递归
 */

public class Rabbit{
    // 第一种方法：循环
    public  static void main(String[] args) {
        int initCount = 1;
        int preOneCount = 1;
        int preTwoCount = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入月份数");
        int monthEnd = s.nextInt();
        int curCount = 1;
        for(int i = 1;i<=monthEnd;i++){
            if(i == 1 || i == 2){
                curCount = initCount;
            }else{
                curCount = preOneCount + preTwoCount;
                preTwoCount = preOneCount;
                preOneCount = curCount;
               

            }
            System.out.println("第"+i+"个月的兔子的数量是"+curCount);
        }
    }
}
