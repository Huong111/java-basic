package Day1;

public class Swap {
    public static void main(String arg[]) {
        int x = 10;
        int y = 5;
        int temp;
        System.out.println("x="+ x);
        System.out.println("y="+ y);
        // swap 1
      //  temp =x;
      //  x=y;
      //  y=temp;

        //swap here 2
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x="+ x);
        System.out.println("y="+ y);
    }
}
