package basicPractice;

import java.util.Scanner;

/**
 * 题目：
 * 输入三个整数x,y,z,请把这三个数由小到大输出。
 * 
 * 程序分析：
 * 先将x与y进行比较，如果x>y则将x与y的值进行交换
 * 然后再用x与z比较，若x>z则将x与z的值进行交换，这样使x最小
 */
public class NumberCompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入x：");
        var x = sc.nextInt();

        System.out.println("请输入y：");
        var y = sc.nextInt();

        System.out.println("请输入z：");
        var z = sc.nextInt();

        var temp = 0;

        if(x > y){
            temp = x;
            x = y;
            y = temp;
        }

        if(x > z ){
            temp = x; 
            x = z;
            z = temp;
        }
        
        if(y > z){
            temp = y;
            y = z;
            z = temp;
        }

        System.out.println("从小到大的顺序为："+x+","+y+","+z);
    }
}