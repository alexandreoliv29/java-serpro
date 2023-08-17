import java.util.Scanner;

public class Metereologia {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura: ");
        int temperatura = myScanner.nextInt();
        int somaTemperaturas = 0;
        int counter = 0;

        while (temperatura != 0) {
            counter += 1;
            somaTemperaturas += temperatura;
            System.out.println("Digite uma temperatura: ");
            temperatura = myScanner.nextInt();
        }

        if (temperatura == 0) {
            counter += 1;
            System.out.println("somaTemperaturas: " + somaTemperaturas);
            System.out.println("counter: " + counter);
            System.out.println("A media das temperaturas e: " + (somaTemperaturas / counter));
        }
    }
}
