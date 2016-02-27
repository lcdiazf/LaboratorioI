/*
 * Permite determinar cuando pasa de una funcion a otra y cuando se acaba el main
 */
package laboratorio.pkg1.pkg3;

/**
 *
 * @author Luis Carlos Diaz y Juan Pablo Huertas M
 * @version 1.0
 */
public class Laboratorio13 {

    /**
     * @param args permite leer variables
     */
    public static void main(String[] args) {
        System.out.println("Primera funcion en main");
        func1();
        func2();
        System.out.println("se termina el main");
    }
    public static void func1(){
        System.out.println("Segunda funcion");
    }
    public static void func2(){
        System.out.println("Tercera funcion");
    }    
}
