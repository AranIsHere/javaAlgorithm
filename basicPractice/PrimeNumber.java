package basicPractice;

/**
 * 题目：求100以内的素数
 * 
 * 程序分析：
 * 1.什么是素数？
 * 质数又叫素数，是指在大于1的自然数中，除了1和它本身之外不再有其他因数
 * 
 * 
 * 2. 求素数为什么到平方根就可以了？
 * 因为如果一个数不是素数是合数，那么一定可以由两个自然数相乘得到，
 * 其中一个大于或等于它的平方根，一个小于或等于它的平方根，并且出现
 * ---
 * 于是，如果一个数是合数，则在平方根内，肯定有一个数可以对该数进行整除
 */
public class PrimeNumber {
    public static void main(String[] args){
        var j = 0;
        var flag = 0;
        for(var i = 2;i < 100 ; i++){
            j = (int) (Math.sqrt(i));
            for(var k = 2; k <= j;k++){
                if(i%k == 0){
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }
            flag = 0;
        }
    }
}