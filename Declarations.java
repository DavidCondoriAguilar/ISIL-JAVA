import java.util.Scanner;

public class Declarations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.println("House");
                break;
            case 2:
                System.out.println("Room");
                break;
            case 3:
                System.out.println("Fabric");
                break;

            default:
                System.out.println("Invalid type");

                break;
        }
        scanner.close();
    }
}
