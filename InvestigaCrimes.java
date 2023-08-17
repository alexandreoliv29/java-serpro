import java.util.Scanner;

public class InvestigaCrimes {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int classificacao = 0;
        int resposta = 0;

        System.out.println("Telefonou para a vitima?");
        String resposta1 = myScanner.nextLine();
        if (resposta1.equals("sim")) {
            classificacao += 1;
        }

        System.out.println("Esteve no local do crime?");
        String resposta2 = myScanner.nextLine();
        if (resposta2.equals("sim")) {
            classificacao += 1;
        }

        System.out.println("Mora perto da vitima?");
        String resposta3 = myScanner.nextLine();
        if (resposta3.equals("sim")) {
            classificacao += 1;
        }

        System.out.println("Devia para a vitima?");
        String resposta4 = myScanner.nextLine();
        if (resposta4.equals("sim")) {
            classificacao += 1;
        }

        System.out.println("Ja trabalhou com a vitima?");
        String resposta5 = myScanner.nextLine();
        if (resposta5.equals("sim")) {
            classificacao += 1;
        }

        System.out.println("classificacao: " + classificacao);
        mostraClassificacao(classificacao);
    }

    public static void mostraClassificacao(int classificacao) {
        if (classificacao == 0 || classificacao == 1) {
            System.out.println("Inocente");
        } else if (classificacao == 2) {
            System.out.println("Suspeito");
        } else if (classificacao == 3 || classificacao == 4) {
            System.out.println("Cúmplice");
        } else {
            System.out.println("Assassino");
        }
    }
}
