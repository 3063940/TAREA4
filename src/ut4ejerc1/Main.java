package ut4ejerc1;

public class Main {
    public static void main(String[] args) {

        Fecha objFecha1 = new Fecha();

        objFecha1.setDia(25);
        objFecha1.setAnio(2024);

        System.out.println(objFecha1.toString());
        if (objFecha1.isSummer()) { // antes de poner el if/else salía un true o un false, asi al menos puede poner el mensaje.
            System.out.println("Es verano");
        }
        else {
            System.out.println("No es verano");
        };

        Fecha objFecha2 = new Fecha(29, EnumMes.FEBRERO, 2024);

        System.out.println(objFecha2.toString());
        if (objFecha2.isSummer()) {
            System.out.println("Es verano");
        }
        else {System.out.println("No es verano");};
    }
}