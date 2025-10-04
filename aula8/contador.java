package aula8;

public class contador {
    public static void main(String[] args) {
        int contador = 0, acumulador = 0;

        while (contador <= 1000) {
            contador = contador + 1;
            acumulador = acumulador + contador;
            System.out.print("\nacumulador: " + acumulador + " contador: " + contador);
        }
    }
}
