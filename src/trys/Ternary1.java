package trys;

import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz...");
        int num= input.nextInt();

        if(num>99&&num<1000){
            System.out.println("3 Basamakli");
        } else if (num%2==0) {
            System.out.println("3 Basamakli olmayan cift sayi");
        }else {
            System.out.println("3 Basamakli olmayan tek sayi");
        }

        String g=(num>99&&num<1000) ? "3 Basamakli": (num%2==0 ?"3 Basamakli olmayan cift sayi":"3 Basamakli olmayan tek sayi" );
        System.out.println(g);




    }
}
