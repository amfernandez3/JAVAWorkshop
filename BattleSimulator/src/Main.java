//Program for battle simulator for a RPG
//Imports:
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //Creamos los objetos de personajes:
        Personaje protagonista =  new Personaje(20,5,2,1);
        Personaje enemigo1 =  new Personaje(10,3,1,1);


        //Comienzo del programa
        System.out.println("Bienvenido al simulador de batalla!");



        while(protagonista.getVitalidad() > 0 && enemigo1.getVitalidad() > 0){
            System.out.println("Tu personaje tiene: " + protagonista.getVitalidad() + "pv Y el enemigo:" + enemigo1.getVitalidad() + "pv");
            System.out.println("Atacas al enemigo!");
            calcularRondaBatalla(protagonista,enemigo1);
            if(enemigo1.getVitalidad()>0){
                System.out.println("El enemigo ataca!");
                calcularRondaBatalla(enemigo1,protagonista);
            }
        }

    }

    public static void calcularRondaBatalla(Personaje personaje1, Personaje personaje2){
        //Damos por hecho que la vitalidad es positiva, calculamos el daño:
        personaje1.setVitalidad(personaje1.getVitalidad() - calcularResultadoRonda(personaje1, personaje2));

    }

    public static int calcularResultadoRonda(Personaje personaje1, Personaje personaje2){
        //Declaración de variables
        int resultado = 0;
        Random random = new Random();

        //Control del daño entre ataque y defensa
        if(personaje1.getAtaque() > personaje2.getDefensa()){
            resultado = personaje1.getAtaque() - personaje2.getDefensa();
        }
        else if(personaje1.getAtaque() > personaje2.getDefensa()) {
            resultado = random.nextInt(2); //Desde cero hasta 2 no incluido
        }
        else{
            resultado = 1;
        }
        System.out.println("El daño causado es: "+ resultado);
        return resultado;

    }
}