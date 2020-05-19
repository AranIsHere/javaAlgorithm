package basicPractice;

/**
 * 题目：
 * 利用递归的方式求5!
 * 
 * 程序分析：
 *  公式：fn = fn_1 * 4
 */
public class FactorialAddByFactorial {
    public static void main(String[] args){
        int sum = factorialAdder(5);
        System.out.println(sum);
    }

    public static int factorialAdder(int n){
        if(n > 0){
            return n * factorialAdder(n - 1);
        }else{
            return 1;
        }
    }
}