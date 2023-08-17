import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = myScanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = myScanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = myScanner.nextLine();

        System.out.println("Digite novamente sua senha: ");
        String confirmaSenha = myScanner.nextLine();

        liberaAcesso(nome, email, senha, confirmaSenha);

    }

    public static void liberaAcesso(String nome, String email, String senha, String confirmaSenha) {
        if (senha.equals(confirmaSenha)) {
            System.out.println("Cadastro realizado com sucesso");
        } else {
            System.out.println("As senhas devem ser iguais");
        }
    }

}
