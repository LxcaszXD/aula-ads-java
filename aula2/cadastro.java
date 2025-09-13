import java.util.Scanner;

public class cadastro{

    public static void main(String[] args) {
        String nome, profissao;
        int idade;
        System.out.println("Digite seu nome: ");
        Scanner teclado = new Scanner(System.in);
        nome = teclado.nextLine();
        System.out.println("Digite sua profissão: ");
        profissao = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Ktchau!!!");
    }

}