package basicPractice;

/**
 * 题目：
 * 有5个人坐在一起，问第5个人多少岁？他说他比第四个人大2岁，问第四个人岁数，他说比第三个人大2岁，问第三个人又说比第2个人大两岁
 * 问第二个人，说比第一个人大两岁，
 * 请问第五个人多大？
 * 
 * 程序分析:
 * 利用递归方法，递归分为回推和递推两个阶段，
 * 要想知道第五个人的岁数，需知道第四个人岁数，依次类推，推到第一个人（10岁），再往回推
 */
public class HowOld {
    public static void main(String[] args){
        System.out.println(getAge(5));
    }

    public static int getAge(int n){
        int c;
        if(n == 1){
            c =  10;
        }else{
            c = getAge(n-1) + 2;
        }
        return c;
    }
}