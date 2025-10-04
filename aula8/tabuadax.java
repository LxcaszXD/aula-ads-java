package aula8;

public class tabuadax {

    public static void main(String[] args) {
        
        for (int tabuada = 0; tabuada  <= 10; tabuada++) {
            System.out.println("\nTabuada do " + tabuada);
            
            for (int x = 0; x <= 10; x++) {
                int valor = tabuada * x;
                System.out.println(tabuada + " x " + x + " = " + valor);

            }
        }
    }
}
