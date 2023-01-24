package trys;

public class Socrative230101 {
    public static void main(String[] args) {

        String s = "abcd";

        try {

            Object obj = new Integer(12);

            s = (String)obj;

        }catch(ClassCastException e){

            System.out.println("Good");

        }

        System.out.println(s);

    }


}
