
public class Problema4 {

    public static void main(String[] args) {
        //Productos
        boolean productos[] = new boolean[10];
        int codigo[] = new int[10];
        String descripcion[] = new String[10];
        int precio[] = new int[10];
        //Ventas
        boolean ventas[] = new boolean[10];
        int fecha[] = new int[10];
        int vendedor[] = new int[10];
        int producto[] = new int[10];
        int cantidad[] = new int[10];
        int pago[] = new int[10];
        //Vendedor
        boolean vendedores[] = new boolean[10];
        int id[] = new int[10];
        String nombre[] = new String[10];
        String apellido[] = new String[10];
        //Fecha
        int fechas[] = new int[10];
        int dia[] = new int[10];
        int mes[] = new int[10];
        int año[] = new int[10];
        int hora[] = new int[10];

        java.util.Scanner input= new java.util.Scanner(System.in);

        inicializar(productos, codigo, descripcion, precio, ventas, fecha, vendedor, producto, cantidad, pago, vendedores, id, nombre,  apellido);
boolean l=true;
while(l){
    System.out.print("Sistema de Ventas de un Importante Local Comercial\n\n");
    System.out.print("1.Registrar un producto\n");
    System.out.print("2.Registrar una venta\n");
    System.out.print("3.Registrar un vendedor\n");
    System.out.print("4.Vendedor con mayores ventas\n");
    System.out.print("5.Lista ventas por debito\n");
    System.out.print("6.Salir");
int o=input.nextInt();
switch(o){
    case 1:
IngresarProductos(productos, codigo, descripcion, precio);
    break;
    case 2:
NuevaVenta( ventas, fecha, vendedor, producto, cantidad, pago, codigo, id, dia, mes, año, hora, nombre, apellido, precio);
    break;
    case 3:
IngresarVendedores(vendedores, id, nombre, apellido);
    break;
    case 4:
MayorVenta( vendedor, cantidad,  producto, id, nombre, apellido, vendedores);
    break;
    case 5:
ventadevito( pago, vendedor, producto, cantidad);
    break;
    case 6:
l=false;
    break;
    default:
System.out.print("\nOpcion invalida");
    break;
}
}
    }

    public static void inicializar(boolean[] productos, int codigo[], String descripcion[], int precio[], boolean ventas[], int fecha[], int vendedor[], int producto[], int cantidad[], int pago[], boolean vendedores[], int id[], String nombre[], String apellido[]) {
        for (int n = 0; n < 10; n++) {
            codigo[n] = 0;
            descripcion[n] = "";
            precio[n] = 0;
            fecha[n] = 0;
            vendedor[n] = 0;
            producto[n] = 0;
            cantidad[n] = 0;
            pago[n] = 0;
            id[n] = 0;
            nombre[n] = "";
            apellido[n] = "";
        }
    }

    public static void IngresarProductos(boolean[] productos, int[] codigo, String[] descripcion, int[] precio) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean seguir = true;
        int o;
        while (seguir) {

            System.out.print("1.Ingresar un nuevo producto.\n2. Regresar\n");
            o = input.nextInt();
            switch (o) {
                case 1:
                    int n = BuscarEspacio(productos);
                    if (n == -1) {
                        System.out.print("No se pueden ingresar mas productos.");
                        break;
                    }
                    System.out.print("\nNuevo Producto\n");
                    System.out.print("\nIngrese el codigo del producto: ");
                    codigo[n] = input.nextInt();
                    System.out.print("\nIngrese una breve descripcion: ");
                    descripcion[n] = input.nextLine();
                    System.out.print("\nIngrese el precio: ");
                    precio[n] = input.nextInt();
                    productos[n] = true;
                    System.out.print("\n\nPRODUCTO AGREGADO\n\n");
                    break;
                case 2:
                    seguir = false;
                    break;
                default:
                    System.out.print("\nOpcion Invalida\n");
                    break;
            }
        }
    }

    public static int BuscarEspacio(boolean[] arreglo) {
        for (int n = 0; n < 10; n++) {
            if (arreglo[n] == false) {
                return n;
            }
        }
        return -1;
    }

    public static void IngresarVendedores(boolean[] vendedores, int[] id, String[] nombre, String[] apellido) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean seguir = true;
        int o;
        while (seguir) {

            System.out.print("1.Ingresar un nuevo vendedor.\n2. Regresar\n");
            o = input.nextInt();
            switch (o) {
                case 1:
                    int n = BuscarEspacio(vendedores);
                    if (n == -1) {
                        System.out.print("No se pueden ingresar mas vendedores.");
                        break;
                    }
                    System.out.print("\nNuevo Vendedor\n");
                    System.out.print("\nIngrese el id: ");
                    id[n] = input.nextInt();
                    System.out.print("\nIngrese el nombre: ");
                    nombre[n] = input.nextLine();
                    System.out.print("\nIngrese el apellido: ");
                    apellido[n] = input.nextLine();
                    vendedores[n] = true;
                    System.out.print("\n\nPRODUCTO AGREGADO\n\n");
                    break;
                case 2:
                    seguir = false;
                    break;
                default:
                    System.out.print("\nOpcion Invalida\n");
                    break;
            }
        }
    }

    public static void NuevaVenta(boolean[] ventas, int[] fecha, int[] vendedor, int[] producto, int[] cantidad, int[] pago, int[] codigo, int[] id, int[] dia, int[] mes, int[] año, int[] hora, String[] nombre, String[] apellido, int[] precio) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean seguir = true;
        int o;
        while (seguir) {

            System.out.print("1.Ingresar una nueva venta.\n2. Regresar\n");
            o = input.nextInt();
            switch (o) {
                case 1:
                    int n = BuscarEspacio(ventas);
                    if (n == -1) {
                        System.out.print("No se pueden ingresar mas ventas.");
                        break;
                    }
                    System.out.print("\nNuevo Venta\n");
                    System.out.print("\nIngrese la fecha: ");
                    System.out.print("\nDia: ");
                    dia[n] = input.nextInt();
                    System.out.print("\nMes: ");
                    mes[n] = input.nextInt();
                    System.out.print("\nAño: ");
                    año[n] = input.nextInt();
                    System.out.print("\nHora(hhmm): ");
                    hora[n] = input.nextInt();
                    System.out.print("\nIngrese el id del vendedor: ");
                    int ve = input.nextInt();

                    while (Buscar(id, ve) == -1) {
                        System.out.print("\nVendedor no registrado.\nIngreselo nuevamente: ");
                        ve = input.nextInt();
                    }
                    vendedor[n] = ve;
                    System.out.print("\nIngrese el codigo del producto vendido: ");
                    int co = input.nextInt();

                    while (Buscar(codigo, co) == -1) {
                        System.out.print("\nProducto no registrado.\nIngreselo nuevamente: ");
                        co = input.nextInt();
                    }
                    producto[n] = co;
                    System.out.print("\nIngrese la cantidad: ");
                    cantidad[n] = input.nextInt();
                    System.out.print("\nIngrese la forma de pago:\n0->Efectivo\n1->Debito\n2->Tarjeta\n");
                    pago[n] = input.nextInt();
                    ventas[n] = true;
                    System.out.print("\n\nVenta Registrada\n\n");
                    factura(n, ventas, fecha, vendedor, producto, cantidad, pago, codigo, id, dia, mes, año, hora, nombre, apellido,  precio);
                    break;
                case 2:
                    seguir = false;
                    break;
                default:
                    System.out.print("\nOpcion Invalida\n");
                    break;
            }
        }
    }

    public static int Buscar(int arreglo[], int num) {
        for (int n = 0; n < 10; n++) {
            if (arreglo[n] == num) {
                return n;
            }
        }
        return -1;
    }

    public static void factura(int n, boolean[] ventas, int[] fecha, int[] vendedor, int[] producto, int[] cantidad, int[] pago, int[] codigo, int[] id, int[] dia, int[] mes, int[] año, int[] hora, String[] nombre, String[] apellido, int[] precio) {

        int vennum = Buscar(id, vendedor[n]);
        int pronum = Buscar(codigo, producto[n]);

        System.out.print("\nImportante Local Comercial\n\n");
        System.out.print("Fecha: " + dia[n] + "/" + mes[n] + "/" + año + " " + (hora[n] / 10) + ":" + (hora[n] % 10) + "\n");
        System.out.print("Vendedor: " + nombre[vennum] + apellido[vennum] + "\n");
        System.out.print("Codigo\tCant.\tV.Unit.\tTotal");
        System.out.print(producto[n] + "\t" + cantidad[n] + "\t" + precio[pronum] + "\t" + (precio[pronum] * cantidad[n]));
        System.out.print("Pago: ");
        switch (pago[n]) {
            case 0:
                System.out.print("Efectivo");
                break;
            case 1:
                System.out.print("Devito");
                break;
            case 2:
                System.out.print("Tarjeta");
                break;
        }
    }

public static void MayorVenta(int[] vendedor,int[] cantidad, int[] producto, int[] id, String[] nombre, String[] apellido, boolean[] vendedores){
int vent[]=new int[10];
for (int n=0; n<10; n++) {
    if (vendedores[n]) {
        vent[n]=cantidad[Buscar(vendedor, id[n])]*producto[Buscar(vendedor, id[n])];
    }else
    {
        vent[n]=0;
    }
}
int mayor=0;
for (int n=0;n<10 ; n++) {
    if(vent[n]>mayor){
        mayor=vent[n];
    }
}

int nmayor=Buscar(vent, mayor);

System.out.print("\nEl vendedor con mayor cantidad de ventas fue " + nombre[nmayor] + apellido[nmayor] + " con un total de ventas de " + mayor);

}

public static void ventadevito(int[] pago,int [] vendedor, int[] producto, int[] cantidad){
System.out.print("\nPagos con Devito.\n");
  for (int n=0;n<10 ; n++) {
    if(pago[n]==1){
        System.out.print("\nid\tTotal\n");
        System.out.print(vendedor[n] + "\t" + (producto[n]*cantidad[n]));
    }
}
}
}
