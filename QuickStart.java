import java.util.Scanner;

/**
 * QuickStart
 */
public class QuickStart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rectangle height: ");
        int height = scanner.nextInt();
        
        System.out.print("Enter rectangle width: ");
        int width = scanner.nextInt();
        
        Rectangle rectangle = new Rectangle();
        rectangle.height = height;
        rectangle.width = width;
        
        System.out.println("Rectangle area: " + calcularRectangleArea(rectangle));
        
        scanner.close();

        // System.out.print("Enter the first number: ");
        // int num1 = scanner.nextInt();
        
        // System.out.print("Enter the second number: ");
        // int num2 = scanner.nextInt();
        
        // System.out.print("Enter the third number: ");
        // int num3 = scanner.nextInt();
        
        // System.out.print("Enter the fourth number: ");
        // int num4 = scanner.nextInt();
        
        // boolean allEqual = areAllEqual(num1, num2, num3, num4);
        // if (allEqual) {
        //     System.out.println("All numbers are equal.");
        // } else {
        //     System.out.println("Not all numbers are equal.");
        // }
        
        // scanner.close();
    
    }

    public static int calcularRectangleArea(Rectangle rectangle) {
        return rectangle.height * rectangle.width;
    }

    public static boolean areAllEqual(int num1, int num2, int num3, int num4) {
        return num1 == num2 && num1 == num3 && num1 == num4;
    }
}