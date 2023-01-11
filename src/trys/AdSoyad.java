package trys;

import java.util.Scanner;

public class AdSoyad {
    public static void main(String[] args) {
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
        Scanner input=new Scanner(System.in);
        System.out.println("Isim ve Soyisminizi giriniz...");
        String name=input.nextLine();

       String []partName=name.split(" ");
       System.out.println("Ad: "+partName[0].toUpperCase());
       System.out.println("Soyad: "+partName[1].toUpperCase());




        System.out.println("Ad ve soyadinizi arada bir bosluk olacak sekilde giriniz.");
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);
        String ad = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];
        String adIlkHarf = ad.substring(0,1).toUpperCase();
        String soyadIlkHarf = soyAd.substring(0,1).toUpperCase();

        String adFormat = adIlkHarf+ad.substring(1);
        String soyadFormat = soyadIlkHarf+soyAd.substring(1);

        System.out.println("Ad: "+adFormat);
        System.out.println("Soyad: "+soyadFormat);





    }
}
