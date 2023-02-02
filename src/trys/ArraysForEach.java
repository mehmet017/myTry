package trys;

import java.util.Arrays;

public class ArraysForEach {
    public static void main(String[] args) {
        String [] str1={"John","Brad","Ange","Sofia","Emily"};
        String [] str2={"sofia","brad","grace","emily","hazel"};

        int size=0;
        for(String w:str1){
            for(String k:str2){
                if(w.equalsIgnoreCase(k)){
                    size++;
                }
            }
        }
        int idx=0;
        String [] str3=new String[size];
        for(String w:str1){
            for(String k:str2){
                if(w.equalsIgnoreCase(k)){
                    str3[idx]=k;
                    idx++;
                }
            }
        }
        System.out.println(Arrays.toString(str3));

    }
}
