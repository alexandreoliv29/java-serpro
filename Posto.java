
public class Posto {
    public static void main(String[] args) {

        double valorLitro = 5;

        mostraTabela(valorLitro);

    }

    public static void mostraTabela(double valorLitro) {
        int litros = 0;
        double valorTotal = 0;
        for (int i = 0; i <= 50; i++) {
            litros = i;
            valorTotal = (litros * valorLitro);
            System.out.println("Valor do litro " + valorLitro + " Quantidade de litros " + litros + " Valor total " + valorTotal);

        }
    }
}
