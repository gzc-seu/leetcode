package TestTest.Java.unit7;

public class PrintString {
    static int count=0;

    public static void main(String[] args) {
        String s ="12234";
        Pailie(s,"");
    }
    static void Pailie(String s, String p){
        if(s.length()<1){
            count++;
            if(""!=p) System.out.println(p);
        }else{
            int index[] = new int[s.length()];
            for(int i=0; i<s.length(); i++){//该字符首次索引
                index[i] = s.indexOf(s.charAt(i));//Returns the index within this string of the first occurrence of the specified character
            }
            for(int i=0; i<s.length(); i++){
                if(i==index[i]){//保证相同字符中的第一次调用
                    Pailie(s.substring(1),p+s.substring(0,1));
                }
                s = s.substring(1) + s.substring(0,1);//循环移位，使每次都是在起始位置选择第一个Pailie(s.substring(1),p+s.substring(0,1));----bug:原来的s未释放
            }
        }
    }
}
