package Validator;

import java.util.Scanner;

public class ValidatorTcNo {
    public static void main(String[] args) {
        System.out.println(getValidTcNumber());
    }

    public static String getValidTcNumber() {

        Scanner scanner = new Scanner(System.in);
        String tcNo = "";
        do {
            tcNo = scanner.next();
            String x = tcNo.replaceAll("[\\d]", "");
            if (!x.isEmpty()) {
                System.out.println("Sayi disinda karakter girmeyiniz!");
                System.out.println("Tekrar deneyiniz");
            }
            else if (tcNo.length() != 11|| tcNo.charAt(0) == '0') {
                System.out.println("TC kimlik numarasi 11 haneden olusmalidir");
                System.out.println("Tekrar deneyiniz");
            }
            else{
                break;
            }
        } while (true);

        return tcNo;
    }
}
