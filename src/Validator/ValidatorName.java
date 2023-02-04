package Validator;

import java.util.Scanner;

public class ValidatorName {
    public static void main(String[] args) {
        System.out.println(isValidFirstName());

    }

    public static String isValidFirstName() {

        Scanner scan = new Scanner(System.in);
        String nameAll = "";
        do {
            nameAll = scan.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
            int size= nameAll.split(" ").length;
            if (size==3){
               String name[] = nameAll.split(" ");
               String name1=name[0].substring(0,1).toUpperCase()+name[0].substring(1);
               String name2=name[1].substring(0,1).toUpperCase()+name[1].substring(1);
               String name3=name[2].toUpperCase();
               nameAll=name1+" "+name2+" "+name3;
               break;
            } else if (size==2) {
                String name[] = nameAll.split(" ");
                String name1=name[0].substring(0,1).toUpperCase()+name[0].substring(1);
                String name2=name[1].toUpperCase();
                nameAll=name1+" "+name2;
                break;
            }else {
                System.out.println("Isminizi dogru bir sekilde girmediniz!!!");
                System.out.println("Lutfen isminizi ve soyisminizi girmeyi tekrar deneyiniz");
                isValidFirstName();
            }
        } while (true);
        return nameAll;
    }

}
