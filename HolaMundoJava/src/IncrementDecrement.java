public class IncrementDecrement {
    public static void main(String[] args) {
        // Incremento postfijo:
        int vidas = 5;
        int regalo = 100 + vidas++;

        System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
        // Regalo: 105, vidas: 6

        // Incremento prefijo:
        int lives = 5;
        int gift = 100 + ++vidas;

        System.out.println("Regalo: " + gift + ", vidas: " + lives);
// Regalo: 106, vidas: 6
    }
}
