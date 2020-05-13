package basicPractice;

/**
 * 题目：
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class BallDrop {
    public static void main(String[] args){
        double a = 100;
        double sum = 100;
        for(int i = 2; i <= 10; i++){
            a = a * 0.5;
            sum += a * 0.2;
        }
        System.out.println("a="+a);
        System.out.println("sum="+sum);
    }
}