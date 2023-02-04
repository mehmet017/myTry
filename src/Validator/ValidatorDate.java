package Validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidatorDate {
    public static void main(String[] args) {
        System.out.println(getValidDate());
    }

    public static String getValidDate() {

        String dateStr="";
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        dateStr = scanner.nextLine();
        try {
            dateStr=formatter.format(LocalDate.parse(dateStr,formatter));
        }catch (DateTimeParseException e){
            System.out.println("Gecersiz bir tarih girdiniz tekrar deneyiniz");
            System.out.println("(gg/aa/yyyy) seklinde giriniz");
            getValidDate();
        }

        return dateStr;
    }

}
