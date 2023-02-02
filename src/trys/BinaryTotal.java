package trys;

public class BinaryTotal {

    public static void main(String[] args) {

        int a = 100010;
        int b = 110010;

        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int size = Math.max(strA.length(), strB.length());

        String sum = "";
        int artan = 0;
        for (int i =size-1; i >= 0; i--) {


            if (artan == 0) {
                if (strA.charAt(i) + strB.charAt(i) == 0) {
                    sum = "0"+sum;
                } else if (strA.charAt(i) + strB.charAt(i) == 1) {
                    sum = "1"+sum;
                } else {
                   sum = "0"+sum;
                   artan=1;

                }

            } else if (artan == 1){
                if (strA.charAt(i) + strB.charAt(i) == 0) {
                    sum ="1"+sum;
                    artan=0;
                } else if (strA.charAt(i) + strB.charAt(i) == 1) {
                    sum ="0"+sum;
                } else {
                    sum ="1"+sum;
                }
            }


        }
        System.out.println(sum);
    }
}