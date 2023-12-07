import java.util.function.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Prueba de interfaces funcionales v1

        //Interfaz function
        interfazFunction();

        //Consumer
        consumerAccept();

        //Supplier
        supplierGet();

        //Predicate
        predicateFiltro();

        //Operator
        operatorApply();

        //Bifunction
        biFunctionApply();

    }


    //Implementación de métodos que trabajan con interfaces funcionales:

    public static void interfazFunction() {
        System.out.println("\nEsta interfaz aplica la función al argumento dado: ");
        Function<String, Integer> longitud = txt -> txt.length();
        int l = longitud.apply("abcdefghijklmnopq");
        System.out.println(l);
    }

    public static void predicateFiltro() {
        System.out.println("\nEsta interfaz evalúa la veracidad del argumento: ");
        Predicate<String> filtro = txt -> txt.length() > 10;
        boolean esMayor = filtro.test("Hola mundo");
        System.out.println(esMayor);
    }

    public static void consumerAccept() {
        System.out.println("\nEsta interfaz acepta los parámetros sin retorno");
        Consumer<String> c = txt -> System.out.println("Consumer" + txt);
        c.accept("Descanso!");
    }

    public static void supplierGet() {
        System.out.println("\nEste tipo de interfaz devuelve un valor sin recibir params");
        Supplier<Double> supplier = () -> Math.random();
        Double n = supplier.get();
        System.out.println(n);
    }

    public static void operatorApply(){
        System.out.println("\nOperator aplica una función y devuelve un valor del mismo tipo");
        UnaryOperator<String> transformacion = txt -> txt.toUpperCase();
        String txt = transformacion.apply("abcdefght");
        System.out.println("El string en mayúsculas es: " + txt);
    }

    public static void biFunctionApply(){
        System.out.println("\nImplementación que recibe dos parámetros y devuelve otro");
        BiFunction<String, String, String> concatenador =
                (txt1,txt2)->new StringBuilder(txt1).append(txt2).toString();
        String txt = concatenador.apply("Hola","Mundo desde una interfaz de tipo bifunction");
        System.out.println("El texto concatenado es: " +  txt);
    }
}