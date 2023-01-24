package trys;

public class Socrative2301 {
    public static void main(String[] args) {
        int num1=2;
        int num2=22;
        try {

            System.out.println(num1/num2);

        }catch(ArithmeticException e) {

            System.out.println("Do not divide by 0");

        }finally {

            System.out.println("Done");

        }


    }
}
