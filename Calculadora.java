import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado = 0;
        char operacion;

        System.out.println("Calculadora Simple (Suma y Resta)");
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+ o -): ");
        operacion = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();

        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operación no válida. Solo se permiten + y -.");
                break;
        }

        scanner.close();
    }
}
