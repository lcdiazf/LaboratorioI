/*
 * Juego de adivinar un numero aleatorio
 * que adicionalmente dice si el numero que se dijo es 
 * mayor o menor que el numero respuesta y tiene maximo 7 intentos
 */

/**
 *
 * @author Luis Carlos Diaz y Juan Pablo Huertas M
 * @version 1.0
 */
public class DiagramaDeFlujo4 {

    /**
     * @param args permite leer valores ingresados por teclado
     */
    public static void main(String[] args) {
        String juegoNuevo="si";
        while(juegoNuevo == "si"){
            Adivina();
            System.out.print("Desea jugar de nuevo(si/no): ");
            java.util.Scanner l=new java.util.Scanner(System.in);
            juegoNuevo=l.next();
            System.out.println();
        }
    }
    public static void Adivina(){
        int respuesta =(int) Math.floor((Math.random()*100)+1);
        int adivinador = 0;
        int a = 1;
        System.out.println("Respuesta:"+respuesta);
        System.out.println("a:"+a);
        while(respuesta != adivinador){
            System.out.println("Adivine el numero");
            java.util.Scanner l= new java.util.Scanner(System.in);
            adivinador = l.nextInt();
            if(adivinador < respuesta){
                System.out.println("Menor...");
            }
            else{
                if(adivinador>respuesta){
                    System.out.println("Mayor...");
                }
                else if (respuesta==adivinador){System.out.println("Ganaste");}
            }
            a++;
            System.out.println("A:"+a);
        }
        System.out.println("a"+a);
        if(a >7){
            System.out.println("Perdiste");
        }
    }
    
}
