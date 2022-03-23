
//mi clase en java
public class HolaMundo {

    public static void main(String args[]) {

        var numero = 2;
        var numeroTexto = "numero desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";

                break;
            case 2:
                numeroTexto = "numero dos";
                break;

            case 3:
                numeroTexto = "numero tres";
                break;
            case 4:
                numeroTexto = "numero cuatro";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);

    }

}
