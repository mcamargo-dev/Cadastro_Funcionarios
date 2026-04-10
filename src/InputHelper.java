import java.util.Scanner;

public class InputHelper {

    static Scanner scan = new Scanner(System.in);

    public static String lerTexto(String textinho){
        System.out.println(textinho);
        return scan.nextLine();
    }

    public static double lerDouble(String texto){
        return Double.parseDouble(lerTexto(texto));
    }
}
