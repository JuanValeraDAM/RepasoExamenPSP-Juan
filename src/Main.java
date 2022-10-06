import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    /*
*
* 3. (máx. 5,00 puntos) Elabora un programa Java que muestre un menú con dos opciones:
lanzar un bloc de notas o terminar.
* La primera opción deberá lanzar un bloc de notas
en un proceso independiente, volviendo inmediatamente al menú de opciones. La
segunda opción deberá terminar el programa, pero esperando primero a que el
usuario cierre todos los blocs de notas que se hayan lanzado. Por cada bloc de notas
lanzado se deberá esperar un máximo de dos segundos; si ese tiempo se supera, se
mostrará “Dejo de esperar al bloc de notas XXX” (donde XXX es el PID del proceso en
cuestión).
*
* */


    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        List<Process> procesos = new ArrayList<>();
        ProcessBuilder pb = new ProcessBuilder("notepad");
        do {
            System.out.println("Escoge entre abrir Notepad (1) o Salir (2)");
            respuesta = sc.next();
            if(respuesta.equals("1")){
                Process proceso = pb.start();
                procesos.add(proceso);
            }
        } while (!respuesta.equals("2"));
        for (Process proceso :
                procesos) {
            if(!proceso.waitFor(2, TimeUnit.SECONDS)){
                System.out.println("Dejo de esperar al proceso "+proceso.pid());
            }
        }
/*
4. (máx. 2,00 puntos) Queremos lanzar desde Java un programa ejecutable, de manera
que toda su salida (tanto estándar como de error) quede registrada en un mismo
fichero. Indica con qué código harías estas redirecciones (sólo ese código).
 */
      //  System.setOut(new PrintStream("fichero.txt"));
      //  System.setErr(new PrintStream("fichero.txt"));



    }
}