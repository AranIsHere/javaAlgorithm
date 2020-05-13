package basicPractice;

import java.util.Scanner;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 程序分析：
 * 以3月5日，应该先把前两个月加起来，然后再加5天即本年的第几天。
 * 特殊情况：闰年且输入月份大于3时，需考虑多加一天
 */
public class DayOfYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = sc.nextInt();
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.print("请输入日期");
        int day = sc.nextInt();
        int date = 0;
        int arr[]  = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((year % 400 == 0) && (year % 4) == 0 && (year % 100 != 0)) {
            arr[1] = 29;
        }
        for(var i = 0; i < month - 1;i++){
            date +=arr[i];
        }
        date +=day;

        System.out.println("天数为："+date);
    }
}