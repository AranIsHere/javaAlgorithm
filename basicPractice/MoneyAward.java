package basicPractice;

import java.util.Scanner;

/**
 * 题目：
 * 企业发放的奖金根据利润提成：
 * （1）利润（I）低于或等于10万元时，奖金可提成10%
 * （2）利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 * （3）20到40万元之间时，高于20万元部分的部分，可提成5%
 * （4）40到60万元之间时，高于40万元的部分，可提成3%
 * （5）60到100万之间时，高于60万元的部分可提成1.5%
 * （6）超过100万元的部分，按1%提成
 *  从键盘输入当月利润I，求应发放的利润总数
 * 
 * 程序分析：
 * 请利用数轴分解，定位。注意定义时需把奖金定义成 长整形（Long）
 * 
 */
public class MoneyAward {
        public static void main(String[] args){
            long reward = 0;
            double per1 = 0.1,per2 = 0.075,per3 = 0.05,per4 = 0.03,per5 = 0.015,per6 = 0.01;
            Scanner sc = new Scanner(System.in);
            long profit = sc.nextLong();
            if(profit > 0 && profit <= 100000 ){
                reward = (long)(profit * per1);
            }else if(profit <= 200000){
                reward = (long)(100000 * per1 + (profit - 100000) * per2);
            }else if(profit <= 400000){
                reward = (long)(100000 * per1 + 100000 * per2 + (profit - 200000) * per3);
            }else if(profit <=600000){
                reward = (long)(100000 * per1 + 100000 * per2 + 200000 * per3 + (profit - 400000) * per4);
            }else if(profit <= 100000){
                reward  = (long)(100000 * per1 + 100000 * per2 + 200000 * per3 + 200000 * per4 + (profit - 600000) * per5);
            }else if(profit > 1000000){
                reward  = (long)(100000 * per1 + 100000 * per2 + 200000 * per3 + 200000 * per4 + 400000 * per5 + (profit - 1000000) * per6);

            }

            System.out.println("所得提成"+reward);
        }
}