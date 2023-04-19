public class Funciones {
    public static void main(String[] args) {
        double radio = 4;
        //Area de un circulo
        //pi * radio^2
        System.out.println(circleArea(5));

        //Area de una esfera
        //4 * PI * radio^2
        System.out.println(sphereArea(radio));

        //Volumen de una esfera
        //(4/3) * pi * r3
        System.out.println(sphereVolumen(2));

        //Para ver las especificaciones de las recomendaciones
        //que hace java, por ejemplo, teclea conv para que java
        //te recomiende coverToDolar, ahí saldrá una ventanita
        //luego presiona Ctrl + q para que te salga otra ventanita
        //con las especificaciones de la documentación que creaste.

    }
    //Para documentar más ràpido: click derecha a la función, luego a
    //Show Context Action > Add Javadoc
    /**
     * @param r
     * @return
     */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * @param r
     * @return
     */
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * @param r
     * @return
     */
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    //Comentario para documentación
    /**
     * Descripción: función que especificando una moneda devuelve la cantidad en dólares
     * @param quantity Cantidad de dinero.
     * @param currency Moneda; solo acepta MXN y COP.
     * @return quantity devuelve la cantidad en dólares.
     */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity *= 0.58;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
