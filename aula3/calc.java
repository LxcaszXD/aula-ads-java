import java.util.Scanner;

public class calc {
    
    public static void main(String[] args) {
        int b, a, t;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base: ");
        b = teclado.nextInt();
        System.out.println("Digite a altura: ");
        a = teclado.nextInt();
        t = b * a;
        System.out.println("Área = " + t);
    }
}
