package trys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringRepeatCharList {
    public static void main(String[] args) {
// Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
//         Input :   String str="Javaisalsoeasy"     Output: a s        (FOR İLE)

        Scanner input=new Scanner(System.in);
        System.out.println("Bir String dizisi giriniz...");
        String str=input.nextLine();

        String arr[] = str.split("");
        Arrays.sort(arr);
        String strIndex="";
        int count;
        List<String> newList=new ArrayList<>();

       for (int i=1;i<arr.length;i++){
                count=0;
           if (!strIndex.equals(arr[i])&&arr[i].equals(arr[i-1])){
               strIndex=arr[i];
               count++;
           }
           if (count==1){
                newList.add(strIndex);
            }

       }
        System.out.println(newList);
    }
}