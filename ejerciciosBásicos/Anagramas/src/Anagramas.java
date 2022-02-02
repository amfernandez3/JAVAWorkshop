
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dual110
 */
public class Anagramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a, b;
        int j;
        int contador = 0;
        boolean anagrama = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Comprobar si dos textos son anagramas:");
        System.out.println("Introduce un texto");
        a = scan.nextLine();
        System.out.println("Introduce otro");
        b = scan.nextLine();

        if (a.length() != b.length()) {
            contador = 0;
        }
        else if(a.equalsIgnoreCase(b)){
        contador = a.length();
        }
        //En este punto las dos cadenas tienen mismo tamaño pero no son iguales.
        else {
            for (int i = 0; i < a.length(); i++) {
                anagrama = false;
                j = 0;
                do {
                    
                    if (a.charAt(i) == b.charAt(j)) {
                        anagrama = true;
                    }
                    j++;
                } while (anagrama == false && j < b.length());

                if (anagrama == true) {
                    contador++;
                }
            }
        }
        
        if(contador == a.length()){
            System.out.println("Son anagramas!" );
        }
        else{
            System.out.println("No son anagramas");
        }
        

    }

}
