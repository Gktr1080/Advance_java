import java.util.*;
public class fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1");
        double x1 = in.nextDouble();
        System.out.println("Enter x2");
        double x2 = in.nextDouble();
        System.out.println("Enter y1");
        double y1 = in.nextDouble();
        System.out.println("Enter y2");
        double y2 = in.nextDouble();

        System.out.println(
                "Difference between two points is: " + Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));

        in.close();

    }

}
