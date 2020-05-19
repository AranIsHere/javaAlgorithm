package basicPractice;

/**
 * 题目：
 * 海滩上有一堆桃子，五只猴子来分，第一只猴子把这堆桃子平均分成五份，多了一个，这只猴子把多的一个
 * 扔进海中，拿走一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔进海中，拿走一份，第三、
 * 第四、第五只猴子都是这样做的，问海滩上原来有多少个桃子？
 *  
 * @author 秋夫人
 * 
 * 借鉴上述作者文章，原文地址：https://blog.csdn.net/wangnanwlw/article/details/52488132
 */
public class MonkeyTakePeach {
    public static void main(String[] args){
        int num = 0;// 假设最后每份一个
        int total = 0;// 桃子总数

        boolean isOut = false;

        while(!isOut){
            //五个猴子，算四遍即可，因为只需四次满足两个条件
            for(int i = 0; i <4; i++){
                //第一次分桃子，原有桃子满足：（total - 1） % 5 = 0
                if(i == 0){
                    total = num * 5 + 1;
                }

                //第二次及以后分桃，剩余桃子数除了满足第一个条件，还要满足是4的倍数，即 [total - (total - 1) % 5 ] % 4 = 0
                if(total % 4 == 0){
                    //当前剩余桃子数量
                    int curPeachCount = (total / 4) * 5 + 1;
                    System.out.println("分前"+ curPeachCount + "个桃子，第"+ (i + 2) + "个猴子，每份（"+curPeachCount+" - 1）/ 5="+(curPeachCount - 1)/5+"个桃子，剩余("+curPeachCount+"-1)-("+curPeachCount+"-1) / 5 = "+((curPeachCount - 1) - (curPeachCount -1)/5)+"个桃子");
                    total = (total / 4) * 5 + 1;
                    //i为 0 1 2 3 即满足两个条件的数据，进行4次运算，就算成功，此时的桃子数是最小的个数
                    if(i == 3){
                        isOut = true;
                    }
                }else{
                    break;
                }
            }
            num ++;
        }
        System.out.println(total);
    }
}