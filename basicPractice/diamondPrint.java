package basicPractice;

/**
 * 题目：打印出菱形
 * 
 * 程序分析：
 * 先把图形分成两部分看待，前四行一个规律，后三行一个规律，利用双重for循环，第一层控制行，第二层控制列
 */
public class diamondPrint {
    public static void main(String[] args){
        int arr[] = {1,3,6,8,6,3,1};
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < arr[i];j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 4; i < arr.length;i++){
            for(int j = arr[i];j < 8;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < arr[i];j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}