public class impressaoNumeros {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i > 52) {
                i += 1;
            }
            System.out.println(i);
        }
    }
}
