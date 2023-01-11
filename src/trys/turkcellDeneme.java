package trys;

public class turkcellDeneme {
    public static void main(String[] args) {

        int number =625;
        String numStr=String.valueOf(number);
        int length=numStr.length();
        String digit=numStr.substring(0,length-1);
        String lastDigit= numStr.substring(length-1,length);

        int num1=Integer.parseInt(digit);
        int num2=Integer.parseInt(lastDigit);

        String str1= String.valueOf(num1*++num1);
        System.out.println("str1 = " + str1);
        String str2= String.valueOf(num2*num2);
        System.out.println("str2 = " + str2);
        double a= Math.pow(number,2);
        System.out.println("a = " + a);


        boolean result= Integer.parseInt(str1+str2)==Math.pow(number,2);
        System.out.println("result = " + result);

    }
}
