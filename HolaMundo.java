//mi clase en java
public class HolaMundo {

    public static void main(String args[]) {

        var mes = 3;
        var estacion = "mes desconocido";

        switch (mes) {
            case 1: case 2: case 3:;
                estacion = "invierno";

                break;
            case 4: case 5: case 6:;
                estacion = "otoño";
                break;

            case 7: case 8: case 9: ;
                estacion = "primavera";
                break;
            
            case 10: case 11: case 12: ;
               estacion = "verano";
                break;
        }
        System.out.println("estacion = " + estacion);

    }
}