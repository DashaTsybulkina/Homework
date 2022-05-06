public class HomeWork {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        System.out.println(sum(100, 200));
        System.out.println(sum(0, 0));
        System.out.println(sum(Integer.MAX_VALUE/2, Integer.MAX_VALUE/2+1));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(max(10, 10));
        System.out.println(max(-1, 5));
        System.out.println(max(20000, 1));
        System.out.println(calculateHypotenuse(3, 4));
        System.out.println(calculateHypotenuse(9, 16));
        System.out.println(calculateHypotenuse(0, 0));

    }

    private static void printLiterals() {
        System.out.println(true);
        System.out.println("котик");
        System.out.println('a');
        //число 4 в 2-й
        System.out.println(0b100);
        //число 4 в 8-й
        System.out.println(004);
        // число 4 в 10-й
        System.out.println(4);
//      число 4 в 16-й
        System.out.println(0x4);
//      число 4 в float
        System.out.println(4F);
//      число 4 в double
        System.out.println(4.0);
    }

    public static int sum(int a, int b) {
        int sum = 0;
        int temp = Integer.MAX_VALUE - a;
        if (temp < b){
            return -1;
        }
        sum = a + b;
        return sum;
    }

    public static int max(int a, int b) {
        if (a>b){
            return a;
        }
        return b;
    }

    public static double calculateHypotenuse(int a, int b) {
        double hypotenuse;
        hypotenuse = Math.sqrt(a*a+b*b);
        return hypotenuse;
    }
}
