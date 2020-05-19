package basicPractice;

public class MultiplyList {
    public static void main(String[] args){
        for(var i = 1;i <= 9 ; i++){
            for(var j = 1; j <= i;j++){
            System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println("");
        }
        
    }
}