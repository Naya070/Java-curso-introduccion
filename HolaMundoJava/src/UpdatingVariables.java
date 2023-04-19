public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50 para descontar
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //comida: $45
        salary = salary + (30*2) -45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "Nayarith Jiménez";
        employeeName = employeeName + " Sierra";
        System.out.println(employeeName);
        employeeName = "Hola, " + employeeName;
        System.out.println(employeeName);
    }
}
