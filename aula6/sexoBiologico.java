import java.util.Scanner;

public class sexoBiologico{
    public static void main(String[] args) {
        String sexo;
        int idade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu sexo biológico: ");
        sexo = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (sexo.equals("m" ) || sexo.equals("M")) {
            if (idade >= 18) {
                System.out.println("Alistamento obrigatório!");
            }else{
                System.out.println("Alistamento não obrigatório");
            }
        }else{
            System.out.println("Dispensado");
        }

        // System.out.println(idade >= 18  ?"Alistamento obrigatório": "Dispensado");
    }
}