package basicPractice;

import java.util.Scanner;

/**
 * 题目：
 * 给出一个不多于5位的正整数，要求：它是几位数，二：逆序打印出各位数字
 */
public class NumberCount {
    public static void main(String[] args){
      m2();
    }

    //方法一
    public static void m1(){
        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[5];
        var b = 0;
        var n = 0;
        for (int i = 4; i >= 0 ; i--) {
            b = (int) Math.pow(10, i);
            if(num / b != 0 && i >= n){
                n = i+1;
            }
            a[i] = num / b;
            num = num - a[i] * b;
        }
        System.out.println("位数"+n);
        for(int j = 0; j < n;j++){
            if(a[j] != -1){
                System.out.println(a[j] + "\t");
            }
        }
        System.out.println("");
    }
    //方法二
    public static void m2(){
        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int numLength = num.length();
        System.out.println("位数："+numLength);
        for (int i = numLength - 1; i >= 0; i--) {
            System.out.println(num.charAt(i)+"\t");
        }
    }
}