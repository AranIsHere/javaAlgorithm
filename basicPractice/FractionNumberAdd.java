package basicPractice;
/**
 * 题目：有一分数序列: 2/1,3/2,5/3,8/5,13/8,21/13... ，求这个数列的前20项之和
 * 
 * 程序分析：
 * 抓住分子与分母的变化规律
 * （从第三项开始，每一项都是前两项的和）
 */
public class FractionNumberAdd {
    public static void main(String[] args){
        int[] a = new int[20];
        int[] b = new int[20];

        double sum = 0.0;

        a[0] = 2;
        a[1] = 3;
        b[0] = 1;
        b[1] = 2;

        for (int i = 2; i < 20; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        for(int j = 2; j < 20; j++){
            b[j] = b[j-1] + b[j-2];
        }
        for(int i = 0; i < 20;i++){
            sum += a[i] / b[i];
        }

        System.out.println(sum);
    }
}