package trys;

import java.util.Arrays;
import java.util.Scanner;

public class StringRepeatChar {
    public static void main(String[] args) {
        // Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        // Input :   String str="Javaisalsoeasy"     Output: a s        (FOR İLE)
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String dizisi giriniz...");
        String str=input.nextLine();

        String arr[] = str.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String strIndex="";


        for (int i=1;i<arr.length;i++){

            if (!strIndex.equals(arr[i])&&arr[i].equals(arr[i-1])){
                strIndex=arr[i];
                System.out.print(strIndex+" ");
            }

        }
    }
}
