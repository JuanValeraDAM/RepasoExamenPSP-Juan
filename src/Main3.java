import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main3 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream flujoSalida = new PrintStream("salida.txt");
        System.setOut(flujoSalida);
        System.setErr(flujoSalida);

        System.out.println("hola");
        System.err.println("y adios");
        System.out.println("y hola de nuevo");
        System.out.println("vale o no");
    }
}
