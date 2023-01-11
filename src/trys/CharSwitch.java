package trys;

import java.util.Scanner;

public class CharSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 integer");
        int a=input.nextInt();
        int b=input.nextInt();
        int obeb=0;
        for(int i=1;i<a*b;i++){
            if (a%i==0&&b%i==0) {
                obeb=i;
            }
        }
        int okek=a*b/obeb;
        System.out.println("OBEB for "+a+" and "+b+" = "+obeb);
        System.out.println("OKEK for "+a+" and "+b+" = "+okek);





    }
}
