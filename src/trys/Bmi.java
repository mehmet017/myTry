package trys;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz...");
        int kilo=input.nextInt();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy=input.nextDouble();
        double bmi=kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz : "+bmi);
        if (bmi<18.5){
            System.out.println("Zayifsin...");
        } else if (bmi<25) {
            System.out.println("Ideal kilodasin...");
        } else if (bmi<30) {
            System.out.println("Sismansin...");
        }else {
            System.out.println("Obezsin...");
        }
    }
}
