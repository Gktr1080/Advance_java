import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius");
        double r = sc.nextDouble();
        System.out.println("The parimeter of circle is: " + 2*Math.PI*r);
        System.out.println("The area of circle is: " + Math.PI*r*r);
        sc.close();
    }
    
}
