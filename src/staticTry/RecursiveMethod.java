package staticTry;

import java.util.Scanner;

public class RecursiveMethod {
    static String isAsal(int a,int b){
        String isTrue=" sayisi Asaldir.", isFalse=" sayisi Asal Degildir.";
        if ( b <= a ){
            if ( a != b ){
                if ( a % b ==0){
                    System.out.print(a); return isFalse;
                }else return isAsal(a,b+1);
            }else {
                System.out.print(a); return isTrue;
            }
        }else {
            System.out.print(a); return isFalse;
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        a=input.nextInt();
        System.out.println(isAsal(a,2));
    }
}
