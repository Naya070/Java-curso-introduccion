public class DataTypes {
    public static void main(String[] args) {
        byte b = 1;
        // 1 byte
        //Rango: -128 a 127
        short s = 1234;
        // 2 bytes
        //Rango: -32,768 a 32,767
        int i = 25000;
        // 3 bytes
        //Rango: -2,147,483,648 a 2,147,483,647
        long l = 125666787000000L;
        // 4 bytes
        // usa una letra l al final

        float f = 5.5F;
        //4 bytes
        // usa una letra f al final
        double d = 3.1416;
        //8 bytes

        var salary = 1000; //int
        //Aquí Java está infiriendo el tipo de dato
        var pension= salary*0.03; //double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Nayarith Jiménez";
        System.out.println("EMPLOYEE: " + employeeName +
                " SALARY: " + totalSalary);

    }
}
