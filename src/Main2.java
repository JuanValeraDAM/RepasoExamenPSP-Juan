import java.io.*;
import java.nio.file.Files;

public class Main2 {
    public static void main(String[] args) throws IOException {
        /*
        //    5. (máx. 4,00 puntos) Elabora un programa Java que lance en un proceso independiente el
//    comando “tasklist” de Windows, pasándole el argumento “/nh”. Deberá mostrar por
//    consola la salida de este proceso, añadiendo al principio de cada línea un número de línea.
         */

        ProcessBuilder pb = new ProcessBuilder("tasklist", "/nh");
        InputStream inputStream = pb.start().getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String linea;
        int contador = 0;
        while ((linea = br.readLine()) != null) {
            linea = (contador++) + " " + linea;
            System.out.println(linea);
        }
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);


    }
}
