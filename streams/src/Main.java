import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Trabajo con streams, funciones de la API Stream (uso en collections)

        //Suponiendo una estructura de datos llamada nombres:
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("John");
        names.add("Mariam");
        names.add("Alex");
        names.add("Mohammado");
        names.add("Mohammado");
        names.add("Vincent");
        names.add("Alex");
        names.add("Alex");

        //Podemos comenzar a trabajar con ella usando la API:
        filtradoDatos(names);

        //Tambien podemos ordenarlos usando la API
        ordenarLista(names);

        //la ordenación puede ser por tamanho también
        filtradoTamanho(names);

        //Se pueden aplicar varios filtros a la vez
        filtradoDoble(names);

        //Los streams permiten evitar resultados repetidos e incluso limitarlos a una cantidad
        sinRepeticiones(names);

        //Podemos pedir solo los x primeros números:
        listaLimitada(names);

        //Los streams permiten aplicar modificaciones a todos los elementos
        concatenarCadena(names);

        //Se pueden fusionar los elementos (.reduce(0,Integer::sum) para los enteros.
        fusionarElementos(names);
    }

    public static void ordenarLista(List<String> names){
        System.out.println("\nNombres ordenados alfabéticamente: ");
        names.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    public static void filtradoDatos(List<String> names){
        System.out.println("\nEl resultado de un filtrado por letra es: ");
        names.stream().filter(name->name.contains("o")).forEach(System.out::println);
    }

    public static void filtradoTamanho(List<String> names){
        System.out.println("\nOrdenacion por tamanho: ");
        names.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    public static void filtradoDoble(List<String> names){
        System.out.println("\nPrimero se ordena por tamanho y despues alfabeticamente");
        names.stream()
                .sorted( Comparator
                        .comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }

    public static void sinRepeticiones(List<String> names){
        System.out.println("\nLista de nombres sin repeticiones: ");
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void listaLimitada(List<String> names){
        System.out.println("\nLista limita a x resultados: ");
        names.stream()
                .limit(5)
                .forEach(System.out::println);
    }

    public static void concatenarCadena(List<String> names){
        System.out.println("Concatenando una cadena a todos los elementos");
        List<String> names2 = names.stream()
                .map(name -> name + "son")
                .collect(Collectors.toList());
        System.out.println(names2);
    }

    public static void fusionarElementos(List<String> names){
        System.out.println("\nResultado de fusionar los elementos: ");
        String nombres = names.stream()
                .reduce("",String::concat);
        System.out.println(nombres);
    }




}