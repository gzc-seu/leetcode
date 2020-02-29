package TestTest;

import java.util.Scanner;

/**
 * 约瑟环问题。
 * 30个人围成一个圈，从第一个开始一次报数，
 * 每数到第九人丢出去，剩15人结束。
 */
public class Ring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //n为总人数
        int[] rings=new int[n];
        for(int i=0;i<n;i++){
            rings[i]=1;
        }
        int sum=n,count=0,index=0;//sum为总数，count计数到9，index为数组下标
        while(sum>15){
            count++;
            if(rings[index]==0){
                index++;
                if(index==n) index=0;
            }
            if(count==9){
                rings[index]=0;
                count=0;
                sum--;
            }
            index++;
            if(index==n) index=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(rings[i]+"-");
        }
    }
}
