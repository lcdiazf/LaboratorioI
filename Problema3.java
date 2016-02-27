public class Laboratorio {

public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner(System.in);
        /*int a;
a=entrada.nextInt();
         */
        boolean parqueadero[] = new boolean[87];
        int entrada[] = new int[87];
        int ganancias = 0;
        boolean l = true;
        inicializar(parqueadero, entrada, ganancias);
        while (l) {
            System.out.print("Bienvenido al sistema de parqueaderos\n1.Ingresar\n2.Retirar\n3.Ver parqueadero\n4.Espacios libres\n5.Ganancias\n6.Salir\n");
            int d;
            d = input.nextInt();
            switch (d) {
                case 1:
                    System.out.print("\n\n");
                    ingresar(parqueadero, entrada);
                    System.out.print("\n\n");
                    break;
                case 2:
                    System.out.print("\n\n");
                    ganancias += salir(parqueadero, entrada);
                    System.out.print("\n\n");
                    break;
                case 3:
                    System.out.print("\n\n");
                    verparqueadero(parqueadero);
                    System.out.print("\n\n");
                    break;
                case 4:
                    libres(parqueadero);
                    System.out.print("\n\n");
                    break;
                case 5:
                    System.out.print("\n\n");
                    ganancia(ganancias);
                    System.out.print("\n\n");
                    break;
                case 6:
                    l = false;
                    break;
                default:
                    System.out.print("\n\nOpcion invalida\n\n");
                    break;
            }

        }
    }

    public static void inicializar(boolean parqueadero[], int entrada[], int ganancias) {
        ganancias = 0;
        for (int n = 0; n < 87; n++) {
            parqueadero[n] = false;
            entrada[n] = 0;
        }
    }

    public static boolean lleno(boolean parqueadero[]) {
        for (int n = 0; n < 87; n++) {
            if (!parqueadero[n]) {
                return false;
            }
        }
        return true;
    }

    public static void ingresar(boolean parqueadero[], int entrada[]) {
        int posicion;
        int hora = 0;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Horario de atencion: 6 a 20\nIngrese la hora de entrada:");
        hora = input.nextInt();
        while (hora < 6 || hora > 20) {
            System.out.print("No hay atencion a esa hora, ingrese la hora nuevamente: ");
            hora = input.nextInt();
        }

        boolean realizado = false;
        for (posicion = 0; posicion < 87; posicion++) {
            if (parqueadero[posicion] == false) {
                realizado = true;
                break;
            }
        }
        if (realizado) {
            parqueadero[posicion] = true;
            entrada[posicion] = hora;
            System.out.println("\n\nIngreso exitoso:\nParqueadero No. " + (posicion+1)  + "\nHora de ingreso:" + hora);
        } else {
            System.out.println("No se realizo el ingreso.\n");
            if (lleno(parqueadero)) {
                System.out.println("El parqueadero esta lleno.");
            }
        }
    }

    public static int salir(boolean parqueadero[], int entrada[]) {
        int numero;
        int hora;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Ingrese el numero de parqeadero donde esta el vehiculo");
        numero = input.nextInt()-1;

        if (parqueadero[numero] == true) {

            System.out.println("Ingrese la hora de salida");
            hora = input.nextInt();

            while (hora < entrada[numero]) {
                System.out.println("Hora invalida, ingresela nuevamente:");
                hora = input.nextInt();
            }
            int total = hora - entrada[numero];
            System.out.println("Hora de ingreso: " + entrada[numero] + "\nHora de salida: " + hora);
            System.out.println("\n Cobrar " + total + " horas");
            entrada[numero]=0;
            parqueadero[numero]=false;
            return total;
        } else {
            System.out.println("No hay ningun auto en el parqueadero ingresado.");
            return 0;
        }

    }

    public static void ganancia(int ganancias) {
        System.out.println("Se han cobrado " + ganancias + " horas");
    }

    public static void libres(boolean parqueadero[]) {
        int libre = 0;
        for (int n = 0; n < 87; n++) {
            if (parqueadero[n] == false) {
                libre++;
            }
        }
        System.out.println("Hay " + libre + " lugares libres");
    }

    public static void verparqueadero(boolean parqueadero[]) {
        System.out.print("+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+");
        int numero = 0;
        System.out.print("\n");
        for (int n = 0; n < 87; n++) {
            System.out.print("|");
            if (n + 1 < 10 && !parqueadero[n]) {
                System.out.print(" ");
            }
            if (parqueadero[n]) {
                System.out.print("**");
            } else {
                System.out.print(n + 1);
            }
            if ((n + 1) % 20 == 0 && n != 0) {
                System.out.print("|\n+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+\n");
            }
        }
        System.out.print("|\n");
        System.out.print("+--+--+--+--+--+--+--+");
    }
}
