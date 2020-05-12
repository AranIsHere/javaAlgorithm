package basicPractice;

import java.util.Scanner;

/**
 * 题目： 输入两个正整数m和n，求其最大公约数和最小公倍数 分析： 利用辗转相除法
 * 
 * 扩展： 什么是最大公约数：
 * 
 * 最大公因数，也称最大公约数、最大公因子，指两个或多个整数共有约数中最大的一个。
 * a，b的最大公约数记为（a，b），同样的，a，b，c的最大公约数记为（a，b，c），多个整数的最大公约数也有同样的记号。
 * 求最大公约数有多种方法，常见的有质因数分解法、短除法、辗转相除法、更相减损法。 与最大公约数相对应的概念是最小公倍数，a，b的最小公倍数记为[a，b]。
 * -------------------------- 什么是最小公倍数：
 * 两个或多个整数公有的倍数叫做它们的公倍数，其中除0以外最小的一个公倍数就叫做这几个整数的最小公倍数。
 * 整数a，b的最小公倍数记为[a，b]，同样的，a，b，c的最小公倍数记为[a，b，c]，多个整数的最小公倍数也有同样的记号。
 * 
 * 
 * @author tonylp
 */
public class commonDivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int first = a;
        int second = b;

        System.out.println("a="+ a + ";b=" + b);
        int temp;

        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("最大公约数为："+a);
        System.out.println("最小公倍数为："+first * second / a);
    }
}