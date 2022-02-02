
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author dual110
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables:
        int selectorMenú;
        String nombreDoc = "";
        //Instancias
        File carpeta = new File("C:\\Users\\DUAL110\\Desktop\\ficherosJava");
        Scanner scan = new Scanner(System.in);
        FileWriter fichero = null;
        PrintWriter pw = null;

        do {

            System.out.println("¿Qué quieres hacer?:\n\n 1- Crear un archivo.\n 2- Modificar archivos\n 3- Listar archivos\n 0- Salir");
            selectorMenú = scan.nextInt();

            if (selectorMenú == 1) {
                System.out.println("Introduce un nombre para el fichero: ");
                scan.nextLine();
                nombreDoc = scan.nextLine();
            } else if (selectorMenú == 2) {
                System.out.println("Introduce el nombre del fichero en el que escribir.");
                scan.nextLine();
                nombreDoc = scan.nextLine();
            } else if (selectorMenú == 4) {
                System.out.println("Introduce el nombre del fichero que quieres eliminar.");
                scan.nextLine();
                nombreDoc = scan.nextLine();
            }

            //Menú para seleccionar la función 
            switch (selectorMenú) {
                case 1:
                    crearDocumento(fichero, pw, nombreDoc); break;
                case 2:
                    continuarDocumento(fichero, pw, nombreDoc); break;
                case 3:
                    listarDocumentos(carpeta); break;
                case 4: 
                    eliminarDocumento(nombreDoc); break;
                default:
                    break;
            }
            //Fin de bucle de control de flujo
        } while (selectorMenú != 0);

    }

    public static void crearDocumento(FileWriter fichero, PrintWriter pw, String name) {
        try {
            fichero = new FileWriter("C:/Users\\DUAL110\\Desktop\\ficherosJava\\" + name + ".txt");//El segundo valor permite escribir al final del fichero.
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++) {
                pw.println("Texto de prueba num: " + i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // Nos aseguramos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void continuarDocumento(FileWriter fichero, PrintWriter pw, String name) {
        try {
            fichero = new FileWriter("C:/Users/DUAL110/Desktop/ficherosJava/" + name + ".txt", true);//El segundo valor permite escribir al final del fichero.
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++) {
                pw.println("Texto de prueba num: " + i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // Nos aseguramos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void listarDocumentos(File carpeta) {
        String[] listado = carpeta.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            return;
        } else {
            System.out.println("Documentos: \n");
            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i]);
            }
            System.out.println("\n");
        }
    }

    public static void eliminarDocumento(String name) {

        File archivo = new File("C:/Users/DUAL110/Desktop/ficherosJava/" + name + ".txt");
        if (archivo.delete()) {
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        } else {
            System.out.println("El fichero no puede ser borrado");
        }
    }

}
