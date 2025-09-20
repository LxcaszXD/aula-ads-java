import java.util.Scanner;

public class servir2{
    public static void main(String[] args) {
        char sexo;
        int idade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu sexo biológico: ");
        sexo = entrada.next().charAt(0);
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if ((sexo == 'M'|| sexo == 'm') && idade >= 18) {
            System.out.println("Alistamento obrigatório!");
            
        }else{
            System.out.println("Dispensado!");
        }
    }
}