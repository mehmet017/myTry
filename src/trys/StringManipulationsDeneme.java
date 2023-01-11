package trys;

public class StringManipulationsDeneme {
    public static void main( String[] args) {
         /*
            Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane sembol olsun
                        vi)En az bir tane rakam olsun
         */

            String s = "Java 15 is easy";
       String m=s.replaceAll("","**");
        System.out.println(m);
        int a=15,b=22;

        String cumle="Hert dert Java gibi olsa";
        System.out.println(cumle.substring(2,7));
        System.out.println(cumle.replaceFirst("e","*"));

        System.out.println(cumle.length()+ " harftan olusur" );
        String c ="1234";
        String d ="33";
        System.out.println(String.valueOf(c));


    }
}
