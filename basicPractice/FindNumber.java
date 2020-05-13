package basicPractice;

/**
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，这个数是多少
 * 程序分析：
 * 在10万以内分析，先将该数加上100后再开放，再将该数加上168后再开方，如果开放后得的结果满足如下条件，即是结果
 */
public class FindNumber {
    public static void main(String[] args){
        for(var i = 0; i < 100000;i++){
            if(Math.sqrt(i+100) % 1 == 0 && Math.sqrt(i+168) % 1 == 0){
                System.out.println("这个数是："+i);
            }
        }
    }
}