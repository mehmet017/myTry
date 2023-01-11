package aracSigorta;

import java.util.Scanner;

public class Arac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sigorta donemini giriniz. \n1-Sigorta Donemi\n2-Sigorta Donemi");
        int donem=input.nextInt();
        System.out.println("Arac tipini seciniz. \notomobil/kamyon/otobus/motorsiklet");
        String vehicle=input.next();

        switch (donem){
            case 1:
                switch (vehicle){
                    case "otomobil":
                        System.out.println("otomobil: 2000 TL");
                        break;
                    case "kamyon":
                        System.out.println("kamyon: 3000 TL");
                        break;
                    case "otobus":
                        System.out.println("Otobusunuz tip1 ise 1'e tip2 ise 2'ye basiniz");
                        int busType=input.nextInt();
                        switch (busType){
                            case 1:
                                System.out.println("otobus: 4000 TL");
                                break;
                            case 2:
                                System.out.println("otobus: 5000 TL");
                                break;
                        }
                    case "motorsiklet":
                        System.out.println("motorsiklet: 1500 TL");
                        break;

                }
                break;
            case 2:
                switch (vehicle){
                    case "otomobil":
                        System.out.println("otomobil: 2500 TL");
                        break;
                    case "kamyon":
                        System.out.println("kamyon: 3500 TL");
                        break;
                    case "otobus":
                        System.out.println("Otobusunuz tip1 ise 1'e tip2 ise 2'ye basiniz");
                        int busType=input.nextInt();
                        switch (busType){
                            case 1:
                                System.out.println("otobus: 4500 TL");
                                break;
                            case 2:
                                System.out.println("otobus: 5500 TL");
                                break;
                        }
                    case "motorsiklet":
                        System.out.println("motorsiklet: 1750 TL");
                        break;

                }
                break;

            default:
        }


    }
}
