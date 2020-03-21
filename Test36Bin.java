package TestTest;

/**
 * 36进制由0-9，a-z，共36个字符表示，最小为'0'
 * '0''9'对应十进制的09，'a''z'对应十进制的1035
 * 例如：'1b' 换算成10进制等于 1 * 36^1 + 11 * 36^0 = 36 + 11 = 47
 * 要求按照加法规则计算出任意两个36进制正整数的和
 * 如：按照加法规则，计算'1b' + '2x' = '48'
 *
 * 要求：不允许把36进制数字整体转为10进制数字，计算出10进制数字的相加结果再转回为36进制
 *
 */
public class Test36Bin {
    public static void main(String[] args) {
        String s = addFunWithStr("1b", "2x");
        System.out.println(s);
    }

    public static String addFunWithStr(String param1, String param2){
        String symbol = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb=new StringBuffer();
        int l1=param1.length()-1;
        int l2=param2.length()-1;
        int temp=0;//进位
        while(l1>=0&&l2>=0){
            int r1=find(param1.charAt(l1));
            int r2=find(param2.charAt(l2));
            int sum=r1+r2+temp;
            if(sum>=36){
                temp=1;
                sb.append(symbol.charAt(sum-36));
            }else{
                temp=0;
                sb.append(symbol.charAt(sum));
            }
            l1--;
            l2--;
        }
        while(l1>=0){
            int sum=temp+find(param1.charAt(l1));
            if(sum>=36){
                temp=1;
                sb.append(symbol.charAt(sum-36));
            }else{
                temp=0;
                sb.append(symbol.charAt(sum));
            }
            l1--;
        }
        while(l2>=0){
            int sum=temp+find(param2.charAt(l2));
            if(sum>=36){
                temp=1;
                sb.append(symbol.charAt(sum-36));
            }else{
                temp=0;
                sb.append(symbol.charAt(sum));
            }
            l2--;
        }
        StringBuffer reverse = sb.reverse();
        return reverse.toString();
    }

    public static int find(char ch){
        int ret = -1;
        if (ch >='0' && ch <= '9') {
            ret = ch - '0';
        } else if (ch >= 'a' && ch <= 'z') {
            ret = (ch - 'a') + 10;
        }
        return ret;
    }
}
