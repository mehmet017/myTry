package trys;

import java.util.ArrayList;
import java.util.List;

public class RandomArray {
    public static void main(String[] args) {
        //Example 2: Bir Integer List'teki 7 haric tum elemanlarin degerlerini 3 artiriniz
        List<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(2);
        numbs.add(7);
        numbs.add(4);
        numbs.add(5);
        System.out.println(numbs);

        for (Integer w : numbs) {
            if (w==7){
                continue;
            }
            numbs.set(numbs.lastIndexOf(w),w+1);

        }
        System.out.println(numbs);
    }

}