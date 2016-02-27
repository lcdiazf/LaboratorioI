/*
 * El programa imprime espacios y asteriscos primero imprimiendo 
 * 4 espacios y 1 asteriscos, y va disminuyendo los espacios en 1 y aumentando 
 * los asteriscos (2*contador)-1 hasta llegar a 9((2*contador=5)-1)
 */
 
/**
 *
 * @author Luis Carlos Diaz y Juan Pablo Huertas M
 * @version 1.0
 */
public class DiagramaDeFlujo2 {

    /**
     * @param args permite leer variables
     */
    public static void main(String[] args) {
        /**
         * @param ast contiene un asterisco
         * @param esp contiene un espacio
         */
        int cuenta_as=1,contador=1,blan=1,num=5;
        String ast="*";
        String esp=" ";
        System.out.print("");
        while(contador<=num){
            for(blan=num-contador;blan>0;blan--){
                System.out.print(esp);
            }
            for(cuenta_as=1;cuenta_as<(2*contador);cuenta_as++){
                System.out.print(ast);
            }
            contador++;
            System.out.print("");
        }
    }
    
}
