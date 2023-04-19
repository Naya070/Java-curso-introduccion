public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true; // también podría ser false
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");
        }
    }
}
