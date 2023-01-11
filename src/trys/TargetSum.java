package trys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static int maxIceCream(int[] costs, int coins) {
        coins=7;
        costs = new int[]{1, 6, 3, 1, 2, 5};
        Arrays.sort(costs);
        int sum=0;
        int counter=0;

        for(int i=0;i<costs.length;i++ ){
            if(sum>coins){
                break;
            }
            sum+=costs[i];
            counter++;
        }
        System.out.println(counter);

        return counter;
    }

    public static void main(String[] args) {
        maxIceCream(new int[]{10, 6, 8, 7, 7, 8},5);
    }
}


