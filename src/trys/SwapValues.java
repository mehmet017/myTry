package trys;

import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        int a = 6;
        int b = 15;


        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a; "+a);
        System.out.println("b: "+b);


        System.out.println("yasinizi giriniz:");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int yas =Integer.parseInt(s);
        System.out.println(yas);




    }
}
