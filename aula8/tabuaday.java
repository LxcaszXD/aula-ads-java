package aula8;

public class tabuaday {

    public static void main(String[] args) {
        
        for (int tabuada = 10; tabuada  >= 0; tabuada--) {
            System.out.println("\nTabuada do " + tabuada);
            
            for (int x = 0; x <= 10; x++) {
                int valor = tabuada * x;
                System.out.println(tabuada + " x " + x + " = " + valor);

            }
        }
    }
}
