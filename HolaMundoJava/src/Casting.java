public class Casting {
    public static void main(String[] args) {
        double dogsQuantity = 30.0;
        double monthlyDogs = dogsQuantity / 12.0;
        // monthlyDogs: 2.5 (pero no es posible, ¡no rescatamos medio perrito!)

        int estimatedMonthlyDogs = (int) monthlyDogs;
        // estimatedMonthlyDogs: 2

        // Recuerda que el casteo no redondea, solo quita los decimales:
        System.out.println(Math.sqrt(3)); // 1.7320508075688772
        System.out.println((int) Math.sqrt(3)); // 1


        int a = 30;
        int b = 12;

        System.out.println(a / b); // 2
        System.out.println((double) a / b); // 2.5

        int x = 30;
        int y = 12;

        double z = x / y;
        System.out.println(z); // 2.0 (??)

        double z2 = (double) a / b;
        System.out.println(z2); // 2.5

    }
}
