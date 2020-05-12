package basicPractice;

/**
 * 题目：
 * 一个数如果恰好等于除了它本身之外它的因子之和，这个数就成为”完数“，例如：6 = 1 + 2 + 3，编程找出1000以内的所有完数
 * 
 * 扩展初中知识：
 * 1.什么是整数因子？
 *  两个数相乘，如 3 * 5 = 15，则我们称3和5为15的整数因子，但不是所有的，如：
 *  1 * 15 = 15，3 * 5 = 15
 *  所以，1、3、5、15这四个数是15的所有整数因子
 * 
 *  你学会了吗？
 * 
 * @author tonylp
 */
public class PerfectNumber {
    public static void main(String[] args){
        for(var i = 1;i <=1000; i++){
            var temp = 0;
              for(var j = 1 ;j < i ; j++){
                  if(i % j == 0)
                  {
                    temp += j;
                  }
              }
              if(temp == i){
                  System.out.println(temp);
              }
        }
    }
}