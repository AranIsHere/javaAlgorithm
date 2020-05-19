package basicPractice;

import java.util.ArrayList;
import java.util.Scanner;
 

/**
 * 题目：打印出杨辉三角形
 * 
 * 程序分析： 1.先实现基本功能，即每一行的数要符合杨辉三角的规律 2.美化
 */
public class YHtrigon {
    public static void main(String[] args) {
        System.out.println("请输入要打印的行数：");
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();
        m4(lineCount);
    }



    // 二维数组实现杨辉三角-非递归方式
    public static void m1(int line) {
        // 申请数组存放杨辉三角数值
        int[][] YH = new int[line][];

        for (int i = 0; i < YH.length; i++) {
            // 初始化每一行的数字个数
            YH[i] = new int[i + 1];
        }

        // 利用杨辉三角的计算公式，初始化数组
        for (int i = 0; i < YH.length; i++) {
            // 得出每一行的各个数字
            for (int j = 0; j < YH[i].length; j++) {
                // 1. 每一行的首位固定为1
                YH[i][0] = YH[i][i] = 1;
                if (i > 0 && j > 0 && j < i) {
                    // 2.其余数字的值等于其上一行对角两数之和
                    YH[i][j] = YH[i - 1][j] + YH[i - 1][j - 1];
                }

            }
        }

        // 遍历输出
        for (int i = 0; i < YH.length; i++) {
            // 计算出每一行应该输出的 \t 并输出
            for (int j = 0; j < (line - i - 1) / 2; j++) {
                System.out.print("  ");
            }
            // 输出每一行的数值
            for (int j = 0; j < YH[i].length; j++) {

                System.out.printf("%4d", YH[i][j]);

            }
            System.out.println();
        }

    }

    //使用两个一维数组打印杨辉三角-非递归方式
    public static void m2(int lineCount){
        
        //preLine数组，用于保存上一行的数值
        int[] preLine = new int[lineCount];

        for(int i = 1; i <= lineCount ; i++){
            //curLine 数组，保存当前行数值
            int[] curLine = new int[i];
             
            for(int j = 0 ; j < i ; j++){
                if(j == 0 || j == i){
                    
                    curLine[j] = preLine[j] = 1;
                }

                if(j != 0 && j != 0 && j < i){
                    curLine[j] = preLine[j-1] + preLine[j];
                }
                
            }

            for(int k = 0 ; k < i ; k++){
                preLine[k] = curLine[k]; 
            }

            for (int k = 0; k < lineCount - i; k++) {
                System.out.print("  ");
                
            }
            for(int k = 0 ; k < i ; k++){
                System.out.printf("%4d",curLine[k]);
            }
        System.out.println();    
        }
    }

    //使用一个一维数组打印杨辉三角-非递归方式
    public static void m3(int lineCount){
        /**
         * 数组YH：用于存放数组的数量，其中
         * 数量为等差数列求和
         */
        int YH[] = new int[(1+lineCount) * lineCount / 2];
        
        for(int i = 0 ; i < lineCount; i++){
            
            //打印空格
            for(int j = 0; j < lineCount - i - 1; j++){
                System.out.print("  ");
            }

            // temp 表示已经存储的数字个数(整行数)
            int temp = (1 + i) * i / 2;
            for(int j = 0 ; j < i;j++){

                if(j == 0 || j == i){
                    YH[temp + j] = 1;
                }else{
                    YH[temp + j] = YH[temp + j - i] + YH[temp + j - i -1];
                  
                }
                System.out.printf("%4d",YH[temp+j]);
            }
            System.out.println();
        }

    }


    //递归方法打印杨辉三角
    public static void m4(int lineCount){
        for(int i = 0; i <= lineCount;i++){
            //打印空格
            for(int j = 1; j<= lineCount - i;j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <=i;k++){
                System.out.printf("%4d",fun4M4(i,k));
            }
            System.out.println();
        }
    }

    public static int fun4M4(int i,int j){
        if(j == 1 || j == i){
            return 1;
        }else{
            return fun4M4(i-1,j) + fun4M4(i-1,j-1);
        }

    }
}