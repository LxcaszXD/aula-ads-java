package aula8;

public class tabuadaDoDois {
    public static void main(String[] args) {
        int x = 0, numero = 2, resultado;

        while (x < 10) {
            x = x + 1;
            resultado = numero * x;
            System.out.print("\n" + numero + " x " + x + " = " + resultado);
        }

        
    }
}
