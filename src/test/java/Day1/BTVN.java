package Day1;

public class BTVN {
    public static void main(String arg[]) {
//        double x = 11;
        // use if else
//        if (x >= 0 && x < 3.5) {
//            System.out.println("Hoc luc kem");
//        } else if (x >= 3.5 && x < 5.0) {
//            System.out.println("Hoc luc yeu");
//        } else if (x >= 5 && x < 6.5) {
//            System.out.println("Hoc luc trung binh");
//        } else if (x >= 6.5 && x < 8.0) {
//            System.out.println("Hoc luc kha");
//        } else if (x >= 8.0 && x <= 10.0) {
//            System.out.println("Hoc luc gioi");
//        } else {
//            System.out.println("Khong Thoa dieu kien");
//        }
        // use switch case -> Type should be cast to "int" to use switch case
        /* if(x>=0 && x<3.5 || x>=3.5 && x<5.0 || x>=5 && x<6.5 || x>=6.5 && x<8.0 || x>=8.0 && x<=10.0){
          switch (x) {
            case 0 :
                System.out.println("Hoc luc kem");
                break;
            case 3.5:
                System.out.println("Hoc luc yeu");
                break;
            case 5:
                System.out.println("Hoc luc trung binh");
                break;
            case 6.5:
                System.out.println("Hoc luc kha");
                break;
            case 8.0:
                System.out.println("Hoc luc gioi");
                break;
            default:
                System.out.println("Khong Thoa dieu kien");
        }
        }*/
//        use fuction check
        check(0);
        check(-1);
        check(3.4);
//        use array
//        double [] test1 = new double[5];
//        double[] numbers = {-1, 0, 3.4, 5};
//        System.out.println(numbers[0]);
//        String[] text = {"Tran", "My", "Huong", "tran"};
//        for (int i = 0; i < text.length; i++) {
//            System.out.print(text[i]);
//        }
//        for (String i : text) {
//            System.out.print(i);
//        }

        String[] fruits = {"Apple", "Pear", "Strawberry", "apple", "ApplE"};
        for (String fruit : fruits) {
            System.out.println("In het ra: " + fruit);
            if (fruit.equalsIgnoreCase("apple")) {
                System.out.println(fruit);
            }
        }
    }

    public static void check(double x) {
        String message = "";
        if (x >= 0 && x < 3.5) {
            message = "Hoc luc kem";
        } else if (x >= 3.5 && x < 5.0) {
            message = "Hoc luc yeu";
        } else if (x >= 5 && x < 6.5) {
            message = "Hoc luc trung binh";
        } else if (x >= 6.5 && x < 8.0) {
            message = "Hoc luc kha";
        } else if (x >= 8.0 && x <= 10.0) {
            message = "Hoc luc gioi";
        } else {
            message = "Khong Thoa dieu kien";
        }
    }

}
