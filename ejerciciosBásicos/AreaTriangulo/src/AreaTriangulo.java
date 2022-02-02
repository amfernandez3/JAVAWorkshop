/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DUAL110
 */
public class AreaTriangulo {

    public static void main(String[] args) {
        //Variables
        double base, altura;
        
        //Instancia clase Scanner
        Scanner scan = new Scanner(System.in);
        
        
        //Sentencias de asignación
        System.out.println("Calculadora de Area de triángulos.");
        System.out.println("Introduce la medida de la base:");
        base = scan.nextDouble();
        System.out.println("Introduce la medida de la altura:");
        altura = scan.nextDouble();
        
        //Resultado
        System.out.println("El area del triángulo es " + (base * altura) / 2);
    }
}
