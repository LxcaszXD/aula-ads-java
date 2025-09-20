import java.util.Scanner;

public class servir{
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println(idade >= 18  ?"Alistamento obrigatório": "Dispensado");
    }
}