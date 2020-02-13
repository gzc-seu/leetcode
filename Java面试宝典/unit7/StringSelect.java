package TestTest.Java.unit7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringSelect {
    public static void main(String[] args) throws IOException {
        System.out.println("输入一个字符串");
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String data = bu.readLine();
        //String data="aavzcadfdsfsdhshgWasdfasdfdddaaa";
        getMax(data);
    }
    public static void getMax(String data){
        char[] chars = data.toCharArray();
        List<String> list=new ArrayList<>();
        Set<String> set=new TreeSet<>();
        for(int i=0;i<chars.length;i++){
            list.add(String.valueOf(chars[i]));
            set.add(String.valueOf(chars[i]));
        }
        Collections.sort(list);
        StringBuffer sb=new StringBuffer();
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next());
        }
        String str = sb.toString();
        //至此将字符串变为了有序不允许重复的set和有序且字母有重复的String
        System.out.println("set:"+set);
        System.out.println("str:"+str);
        //迭代set，使用indexOf和lastIndexOf方法操作String得到重复字母次数
        //max记录最大重复次数，maxString记录当前最大字符串
        //maxList存储所有最大字符，maxList.size()即为重复字符个数
        int max=0;
        String maxString="";
        ArrayList<String> maxList = new ArrayList<String>();
        Iterator its=set.iterator();
        while(its.hasNext()){
            String next = (String) its.next();
            int begin=str.indexOf(next);
            int end=str.lastIndexOf(next);
            int value=end-begin+1;
            if(value>max){
                maxList.clear();
                max=value;
                maxString=next;
                maxList.add(next);
            }else if(value==max){
                maxList.add(next);
            }
        }
        System.out.println("最多次数"+max);
        for (int i=0;i<maxList.size();i++) {
            System.out.println("最大字符"+maxList.get(i));
        }
    }
}
