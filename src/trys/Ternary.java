package trys;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Toplama:1\nCikarma:2\nCarpma:3\nBolme:4\nLutfen yapacaginiz islemi giriniz...");
        int islem = input.nextInt();

        System.out.println("iki adet sayi giriniz...");
        double num1 =input.nextDouble();
        double num2 =input.nextDouble();

        Object r =islem==1 ? (num1+num2) : (islem==2 ? (num1-num2) : (islem==3 ? (num1*num2) :(islem==4 ? (num1/num2): "Yapilacak islem yok")));
        System.out.println(r);


    }
}
