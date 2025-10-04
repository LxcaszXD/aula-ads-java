package aula8;

public class tabuada {

    public static void main(String[] args) {
        int tabuada = 1, x, valor;

        while (tabuada <= 10) {
            x = 0;

            System.out.println("\nTabuada do " + tabuada);
            while (x <= 10) {
                valor = tabuada * x;
                System.out.println(tabuada + " x " + x + " = " + valor);
                x++;
            }
            tabuada++;
        }
    }
}
