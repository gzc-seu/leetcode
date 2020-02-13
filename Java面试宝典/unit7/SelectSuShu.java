package TestTest.Java.unit7;

public class SelectSuShu {
    public static void main(String[] args) {
        int[] a=new int[100];
        for(int i=2;i<100;i++){
           a[i]=i;
           for(int j=2; j<=i; j++){
               if(j<i) {
                   if (a[i] % j == 0) break;
               }
               if(a[i]-j==0) System.out.println(a[i]);
           }
        }
    }
}
