package trys;

import java.util.Scanner;

public class KrediKarti {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Isim Soyisminizi ve Kredi Karti Numaranizi giriniz...");
        String nameCc=input.nextLine().replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim().toLowerCase();

        String name1 = nameCc.toUpperCase().split(" ")[0];
        String name2 = nameCc.toUpperCase().split(" ")[1];
        String ccNum = nameCc.toUpperCase().split(" ")[2];
        String name1Star = name1.substring(0,1)+name1.substring(1).replaceAll("[\\w]","*");
        String name2Star = name2.substring(0,1)+name2.substring(1).replaceAll("[\\w]","*");



        if (ccNum.length()!=16){
            System.out.println("Lutfen Kredi Karti Numaranizi 16 hane olarak giriniz...");
        }else {
            String ccLastFour=ccNum.substring(12);
            System.out.println("Name : "+name1Star+" "+name2Star);
            System.out.println("CCN  : **** **** **** "+ccLastFour);

        }







    }
}
