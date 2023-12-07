import model.Saludador;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Prueba de funciones lambda:

        Saludador s1 = nombre -> System.out.println("Hola: " + nombre);
        s1.saludar("Alejandro");

        //La anterior implementación sin lambdas sería así:

        Saludador s2 = new Saludador() {
            @Override
            public void saludar(String nombre) {
                System.out.println("Hola: " + nombre);
            }
        };

        s2.saludar("Pedro");
        //Cosas a tener en cuenta en cuanto a la estructura de los lambdas:
        /**
         * Si el parámetro de entrada es solo uno no requiere paréntesis, sucede lo mismo con las instrucciones internas.
         */
    }
}