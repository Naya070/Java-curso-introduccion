public class LogicOperations {
    public static void main(String[] args) {
        boolean condicionA = true; // verdadero
        boolean condicionB = false; // falso

        boolean condicionC = 2 + 2 == 4; // verdadero
        boolean condicionD = 2 + 2 == 5; // falso

        boolean condicionE = "Pepito" == "Pepito"; // verdadero
        boolean condicionF = "Pepito" == "Pepe"; // falso


    boolean noHayInternet = false;
    boolean hayInternetPeroMuyPoquito =true;
    boolean hayBuenInternetPeroNoEsSuficiente =false;


    if (noHayInternet) {
        System.out.println("No hay Internet");
    } else if (hayInternetPeroMuyPoquito) {
        System.out.println("Tienes muy poquito Internet");
    } else if (hayBuenInternetPeroNoEsSuficiente) {
        System.out.println("Casi casi, falta solo un poquito más");
    } else {
        System.out.println("¡Tienes suficiente Internet!");
    }
    }
}
