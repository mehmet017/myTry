package trys;

import java.util.Scanner;

public class RepeatChar {
    public static void main(String[] args) {
/* ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 manav,
      2 sarkuteri,
      3 market
      secime gore urunleri listele ve
      fiyatlari gelsin
              *
* Basrili Market alış-veriş programı.
      1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

      No   Ürün    Fiyat
              ===== ======= ========
      00 Domates 2.10 TL ,
       01 Patates 3.20 TL ,
       02 Biber 1.50 TL ,
       03 Soğan 2.30 TL  ,
       04 Havuç 3.10 TL
      05 Elma 1.20 TL
      06 Muz 1.90 TL
      07 Çilek 6.10 TL
      08 Kavun 4.30 TL
      09 Üzüm 2.70 TL
      10 Limon 0.50 TL
              *
* 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
      * 3. Adım: Kaç kg satın almak istediğini sorunuz.
      4. Adım: Alınacak bu ürünü
              * sepete ekleyiniz ve Sepeti yazdırınız.
      5. Başka bir ürün alıp almak
              * istemediğini sorunuz.
      6. Eğer devam etmek istiyorsa yeniden ürün seçme
              * kısmına yönlendiriniz.
      7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
              * ödeme sonrasında programı bitiriniz
              */
        System.out.println("1 Manav\n2 Sarkuteri\n3 Market\nAlisveris yapmak istediğiniz reyonu seçiniz");
        System.out.println("   No   Ürün    Fiyat\n" +
                "                ===== ======= ========\n" +
                "        00 Domates 2.10 TL ,\n" +
                "         01 Patates 3.20 TL ,\n" +
                "         02 Biber 1.50 TL ,\n" +
                "         03 Soğan 2.30 TL  ,\n" +
                "         04 Havuç 3.10 TL\n" +
                "        05 Elma 1.20 TL\n" +
                "        06 Muz 1.90 TL\n" +
                "        07 Çilek 6.10 TL\n" +
                "        08 Kavun 4.30 TL\n" +
                "        09 Üzüm 2.70 TL\n" +
                "        10 Limon 0.50 TL");

        Scanner input=new Scanner(System.in);
        double sepet=0;


        do{
            System.out.println("Almak istediğin ürünün kodunu giriniz");
            int urunno=input.nextInt();
            System.out.println("Almak istediğiz ürün miktarını giriniz");
            int miktar= input.nextInt();

            switch (urunno){
                case 00:
                    sepet=sepet+miktar*2.10;
                    break;
                case 01:
                    sepet=sepet+miktar*3.20;
                    break;
                case 02:
                    sepet=sepet+miktar*1.50;
                    break;
                case 03:
                    sepet=sepet+miktar*2.30;
                    break;
                case 04:
                    sepet=sepet+miktar*3.10;
                    break;
                case 05:
                    sepet=sepet+miktar*1.20;
                    break;
                case 06:
                    sepet+=miktar*1.90;
                    break;
                case 07:
                    sepet=miktar*6.10;
                    break;
                case 8:
                    sepet+=miktar*4.30;
                    break;
                case 9:
                    sepet+=miktar*2.70;
                    break;
                case 10:
                    sepet+=miktar*0.50;
                    break;

            }
            System.out.println("sepet = " +sepet+" TL");

            System.out.println("devam etmek istiyorsanız D,bitirmek istiyorsanız Q tuşuna basın");
            String d=input.next();
           if (d.equalsIgnoreCase("q")){
               break;
           } else if (d.equalsIgnoreCase("d")) {
               continue;
           }


        }while (true);




    }
}