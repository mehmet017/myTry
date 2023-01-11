package trys;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int a =input.nextInt();
        long b = 1;
        for (int i=1;i<a+1;i++){
            b=b*i;
        }
        System.out.println("Sayinin Faktoriyeli: "+b);






    }
}
