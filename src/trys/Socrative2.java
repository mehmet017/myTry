package trys;

import java.util.Scanner;

public class Socrative2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int gecici;
        System.out.println("Dizinin uzunlugunu giriniz...");
        int dizin=scan.nextInt();
        int [] dizi = new int[dizin];

        for(int i = 0; i < dizin; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
        for(int i = 0; i < dizin-1; i++)
        {
            for(int j = i+1; j < dizin; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < dizin; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
        }


    }
}
