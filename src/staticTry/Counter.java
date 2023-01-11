package staticTry;

public class Counter {
    int count;
    static int stCount;
    public Counter(){
        count++;
        stCount++;
    }
    public int getCount(){
        return count;
    }
    public static int getStCount(){
        return stCount;
    }

    public static void main(String[] args) {

        System.out.println("getStCount() = " + getStCount());


        Counter cs1=new Counter();
        System.out.println("getStCount() = " + getStCount());
        System.out.println("cs1.getCount() = " + cs1.getCount());
        Counter cs2=new Counter();
        System.out.println("getStCount() = " + getStCount());
        Counter cs3=new Counter();
        System.out.println("getStCount() = " + getStCount());
        Counter cs4=new Counter();
        System.out.println("getStCount() = " + getStCount());
        Counter cs5=new Counter();
        System.out.println("getStCount() = " + getStCount());
        Counter cs6=new Counter();


        System.out.println("count is: "+cs6.getCount());
        System.out.println("stCount is: "+cs6.getStCount());


    }
}
