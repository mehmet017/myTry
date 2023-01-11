package staticTry;

import java.util.Scanner;

public class RecursiveOzYinelemeli {

    static  String isAsal(int a, int b){
        String isTrue=" sayisi Asal Sayidir.", isFalse=" sayisi Asal Degildir";
        if (b<=a){
            if (b != a){
                if (a%b==0){
                    System.out.print(a); return isFalse;
                }else {
                    return isAsal(a,b+1);
                }
            }else {
                System.out.println(a); return isTrue;
            }
        }else {
            System.out.println(a);
            return isFalse;
        }


    }



    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        a=input.nextInt();
        System.out.println(isAsal(a,2));
    }
}
