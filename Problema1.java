/*
 * Sistema informático que permite administrar las elecciones 
 * a alcalde de los diferentes municipios del departamento de 
 * Topaiti. máximo 20 municipios y 20 candidatos
 */

/**
 *
 * @author Luis Carlos Diaz y Juan Pablo Huertas
 * @version 1.0
 *
 */
public class Problema1 {

    /**
     * @param args permite leer datos de entrada
     */
    public static void main(String[] args) {
        /**
         * @param a variable que almacena si desea ejecutar el programa de nuevo
         */
        int a = 1;
        do {
            java.util.Scanner l = new java.util.Scanner(System.in);
            int cantidadm = 21, cantidadc = 21;
            while (cantidadm > 20) {
                System.out.println("¿Cu\u00e1ntos municipios tienen candidatos para inscribir?");
                cantidadm = l.nextInt();
                if (cantidadm > 20) {
                    System.out.println("Los municipios no pueden ser m\u00e1s de 20");
                }
            }
            while (cantidadc > 20) {
                System.out.println("¿Cu\u00e1ntos candidatos tiene para cada municipio?");
                cantidadc = l.nextInt();
                if (cantidadc > 20) {
                    System.out.println("Los candidatos no pueden ser m\u00e1s de 20");
                }
            }
            String votacion[][] = new String[cantidadm][cantidadc + 1];
            for (int i = 0; i < cantidadm; i++) {
                System.out.println("Ingrese el nombre del municipio " + (i + 1));
                votacion[i][0] = l.next();
            }
            for (int e = 0; e < cantidadm; e++) {
                for (int i = 1; i < (cantidadc + 1); i++) {
                    System.out.println("Ingrese el nombre del candidato " + (i) + " del municipio " + (e + 1));
                    votacion[e][i] = l.next();
                }
            }
            int vota[][] = new int[cantidadm][cantidadc];
            for (int e = 0; e < cantidadm; e++) {
                for (int i = 0; i < cantidadc; i++) {
                    System.out.println("Ingrese los votos de " + votacion[e][i + 1]);
                    vota[e][i] = l.nextInt();
                }
            }
            System.out.print("\t   |");
            for (int i = 0; i < cantidadc; i++) {
                System.out.print("Candidato " + (i + 1) + " | ");
            }
            System.out.println(" ");
            for (int e = 0; e < cantidadm; e++) {
                System.out.print("Municipio " + (e + 1) + "| ");
                for (int i = 0; i < cantidadc; i++) {
                    System.out.print("  ");
                    System.out.print(vota[e][i] + "       |");
                }
                System.out.println();
            }
            for (int i = 0; i < cantidadm; i++) {
                System.out.println("Municipio " + (i + 1) + " = " + votacion[i][0]);
                for (int e = 0; e < cantidadc; e++) {
                    System.out.println("\tcandidato " + (e + 1) + " = " + votacion[i][e + 1]);
                }
            }
            int totalVotos[] = new int[cantidadm];
            for (int i = 0; i < cantidadm; i++) {
                totalVotos[i] = 0;
                for (int e = 0; e < cantidadc; e++) {
                    totalVotos[i] = totalVotos[i] + vota[i][e];
                }
            }
            for (int i = 0; i < cantidadm; i++) {
                for (int e = 0; e < cantidadc; e++) {
                    System.out.println(votacion[i][e + 1] + ": " + vota[i][e] + " = " + (((double) vota[i][e] / (double) totalVotos[i]) * 100) + "% de los votos");
                }
            }
            /**
             * @param m Es la variable auxiliar que cambia los votos del mayor por los del menor
             * @param ma Es la variable auxiliar que cambia los nombres si existe un candidato con mas votos que el anterior
             */
            int m;
            String ma;
            for (int i = 0; i < cantidadm; i++) {
                for (int e = 0; e < cantidadc; e++) {
                    for (int q = e + 1; q < cantidadc; q++) {
                        if (vota[i][e] < vota[i][q]) {
                            m = vota[i][e];
                            vota[i][e] = vota[i][q];
                            vota[i][q] = m;
                            ma = votacion[i][e+1];
                            votacion[i][e+1] = votacion[i][q+1];
                            votacion[i][q + 1] = ma;
                        }
                    }
                }
                System.out.println("El mas votado en " + votacion[i][0] + " fue " + votacion[i][1] + " con " + vota[i][0] + " votos");
                if (vota[0][0] < vota[i][0]) {
                    m = vota[i][0];
                }else  {m= vota[0][0];}
                if(i==cantidadm-1){
                    System.out.println("El mayor votado de todos los municipios obtuvo "+m+" votos");
                }
            }
            int n;
            /**
             * @param n determina si en el municipio alguien obtuvo mas de 50% de votos sino imprime los 2 con mayor votos
             */
            for (int i = 0; i < cantidadm; i++) {
                n=1;
                for (int e = 0; e < cantidadc; e++) {
                    if ((((double) vota[i][e] / (double) totalVotos[i]) * 100) > 50) {
                        System.out.println("El ganador con mas de 50 % de los votos en " + votacion[i][0] + " es " + votacion[i][e + 1]);   
                        n=0;
                    } 
                }
                if(n==1){
                    System.out.println("Los que pasan a segunda ronda en "+votacion[i][0]+" son "+votacion[i][1]+" y "+votacion[i][2]);
                }
            }
            System.out.println("El orden de candidatos descendentemente es:");
            for (int i = 0; i < cantidadm; i++) {
                for (int e = 0; e < cantidadc+1; e++) {
                    System.out.print(votacion[i][e]+"  ; ");
                }
                System.out.println();
            }
            System.out.println("Si desea volver a ejecutar el programa presione 1");
            System.out.println("Si desea salir presione 2");
            a = l.nextInt();
            
        } while (a == 1);
    }
}
