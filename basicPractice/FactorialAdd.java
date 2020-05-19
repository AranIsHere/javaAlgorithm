package basicPractice;

/**
 * 题目：求1+2!+3!+4!+...+20!的值
 * 
 * 程序分析：此程序只是把累加编程了类乘
 */
public class FactorialAdd {
    public static void main(String[] args){
        int sum = 0;
        int data = 1;
        for (int i = 1; i < 20; i++) {
            data = data*i;
            sum+=data;
        }
        System.out.println(sum);
    }
}