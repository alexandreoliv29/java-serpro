import java.util.Scanner;

public class Atletismo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite três valores de tempo gasto referentes a cada corredor: ");

        int valor1 = myScanner.nextInt();
        int valor2 = myScanner.nextInt();
        int valor3 = myScanner.nextInt();

        verificaValor(valor1, valor2, valor3);
    }

    public static void verificaValor(int valor1, int valor2, int valor3) {
        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("O corredor um ganhou a corrida");
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("O corredor dois ganhou a corrida");
        } else if (valor3 < valor1 && valor3 < valor2) {
            System.out.println("O corredor três ganhou a corrida");
        } else {
            System.out.println("Não houve ganhador na corrida");
        }
    }
}
