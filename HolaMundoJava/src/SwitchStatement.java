public class SwitchStatement {
    public static void main(String[] args) {
        String profe = "Oscar";
        switch (profe) {
            case "Anahí":
                System.out.println("¡Profesora de Java!");
                break;
            case "Oscar":
                System.out.println("¡Profesor de React.js!");
                break;
            case "JuanDC":
                System.out.println("Oye niño, ¿qué haces aquí?");
                break;
            default:
                System.out.println("¡Un nuevo profe!");
                break;
        }
    }
}
