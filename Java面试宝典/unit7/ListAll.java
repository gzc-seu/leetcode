package TestTest.Java.unit7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListAll {
    public static void main(String[] args) throws Exception{
        String[] array=new String[]{"1","2","3"};
        listAll(Arrays.asList(array),"");
    }
    public static void listAll(List<String> candidate,String prefix){
        System.out.println(prefix);
        for(int i=0;i<candidate.size();i++){
            List temp=new LinkedList(candidate);
            System.out.println("temp is:"+temp);
            listAll(temp,prefix+temp.remove(i));
        }
    }
}
