package TestTest.Java.unit7;

public class NumOfOne {
    public static void main(String[] args) {
        int n=2;
        int res=1;
        while((getOne(2)+res)!=n){
            res+=getOne(n);
            ++n;
        }
        System.out.println(n);
    }
    public static int getOne(int n){
        int number=0;
        String str=n+"";
        int len=str.length();
        if(len!=0) {
            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);
                if (c == '1') number++;
            }
        }
        return number;
    }
}
