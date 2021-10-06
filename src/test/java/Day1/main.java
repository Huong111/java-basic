package Day1;

public class main {
    public static void main(String arg[]) {
       // double sum;
        double x = 10;
        double y = 20;
        double z = 30;
        //sum = x + y;

      /*  if (x<y && x>y){
            System.out.println(x);
        } else {
            System.out.println("khong thoa");
        }
        */
         compare(x, y);
        compare(50.0, 20.0);

    }
    public static void compare(double x, double y){
        System.out.println("compare");
        if (x<y ){
            System.out.println(x);
        } else {
            System.out.println("khong thoa");
        }
    }
}
