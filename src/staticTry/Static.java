package staticTry;

public class Static {
    static int count=0;

    public void incerement(){
        count++;
    }

    public static void main(String[] args) {
        Static obj1=new Static();

        Static obj2=new Static();

        obj1.incerement();
        System.out.println("count = " + count);
        obj2.incerement();
        System.out.println("count = " + count);
        System.out.println("Obj1: count is= "+obj1.count);
        System.out.println("Obj2: count is= "+obj2.count);




    }



}
