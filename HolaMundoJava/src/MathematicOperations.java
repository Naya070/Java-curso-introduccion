public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        double radio = 4;
        //devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        //devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));
        //compara dos números y devuelve el mayor
        System.out.println(Math.max(x,y));
        //devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        //pi * radio^2
        System.out.println(Math.PI * Math.pow(radio,2));

        //Area de una esfera
        //4 * PI * radio^2
        System.out.println(4 * Math.PI * Math.pow(radio,2));

        //Volumen de una esfera
        //(4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(radio,3));
    }
}
