package trys;

import java.util.Scanner;

public class Qae {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplam dakika giriniz: ");
        long dakika =scan.nextLong();
        int yilDakika=60*24*365;
        int gunDakika=60*24;
        int yil=(int)(dakika/yilDakika);
        int gun=(int)((dakika-(yil*yilDakika))/gunDakika);


        System.out.println("yil = " + yil);
        System.out.println("gun = " + gun);


    }
}