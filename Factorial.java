import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        
        long resultadoFactorial = calcularFactorial(numero);
        
        System.out.println("El factorial de " + numero + " es: " + resultadoFactorial);
        
        scanner.close();
    }
    
    // Función para calcular el factorial de un número
    public static int calcularFactorial(int n) {
        // Verificar si el número es positivo
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        
        int factorial = 1;
        
        // Calcular el factorial multiplicando los números desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}
