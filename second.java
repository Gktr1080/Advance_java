import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("The addition of two numbers is: " + (a+b));
        System.out.println("The subtraction of two numbers is: " + (a-b));
        System.out.println("The multiplication of two numbers is: " + (a*b));
        System.out.println("The division of two numbers is: " + (a/b));
        System.out.println("The modulus of two numbers is: " + (a%b));
        System.out.println("The power of two numbers is: " + (a^b));
        sc.close();
    }
    
}
