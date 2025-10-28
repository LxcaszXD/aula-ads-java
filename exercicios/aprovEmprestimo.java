import java.util.Scanner;

public class aprovEmprestimo {
    public static void main(String[] args) {
        try(var scanner = new Scanner(System.in)){
            System.out.print("Digite o seu salário: ");
            var salario = scanner.nextDouble();
            System.out.print("Digite o número de pendências: ");
            var pendencias = scanner.nextInt();
            
            if (salario > 2500.00 && pendencias <= 2) {
                System.out.println("Empréstimo aprovado!");
            }else{
                System.out.println("Empréstimo não aprovado!");
            }
        }
    }
}
