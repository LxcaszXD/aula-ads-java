package ativ;

public class condicaoDeNumeros {
    public static void main(String[] args) {
        int n = 0;

        while (n < 100) {
            n = n + 1;
            System.out.println(n);

            if (n >= 52) {
                while (n < 100) {
                    n = n + 2;
                    System.out.println(n);
                }
            }
        }

    }
}
