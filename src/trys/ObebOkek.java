package trys;

import java.util.Scanner;

public class ObebOkek {
        /*  Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
            Input :30  40
            Beklenen Cikti:
            30 ve 40 icin GCD = 10                 ( FOR İLE)
            30 ve 40 icin LCM = 120    */
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Iki adet tamsayi giriniz...");
            int num1=input.nextInt();
            int num2=input.nextInt();

            int limit=Math.min(num1,num2);

            int obeb=0;
            for (int i=1;i<=limit;i++){
                if (num1%i==0&&num2%i==0){
                    obeb=i;
                }

            }
            System.out.println("obeb = " + obeb);
            int okek=num1*num2/obeb;
            System.out.println("okek = " + okek);
        }
}
