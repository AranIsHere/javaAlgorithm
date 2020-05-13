package basicPractice;

/**
 * 题目：有1，2，3，4几个数字，能组成多少个互不相同且不重复的三位数？请输出。
 * 
 * 程序分析：
 * 可将各个数字填充到个、十、百位
 * 
 */
public class NumFillWithNum{
    public static void main(String[] args){
            var a = 0;
            var b = 0;
            var c = 0;
            
            for(a = 1; a < 5; a++){
                for(b = 1; b < 5; b ++){
                    for(c = 1; c < 5;c++){
                        if( a != c && a != b && b != c){
                            System.out.println(a*100 + b * 10 + c);
                        }
                    }
                }
            }
    }
}