/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1.pkg6;

/**
 * @author Juan Pablo Huertas Mendez y Luis Carlos Diaz
 */
public class Laboratorio16 {

    /**
     * @param args permite leer variables
     */
    public static void main(String[] args) {
        int x;
        int economica[][] = new int[7][6];
        String nombresc[][] = new String[7][6];
        int cedulasc[][]=new int [7][6];
        int ejecutiva[][]=new int [2][4];
        String nombresj[][]=new String [2][4];
        int cedulasj[][] = new int[2][4];
        for (int i = 0; i < 7; i++) {
           for(int e=0;e<6;e++){
               economica[i][e]=0;
           }
        }
        for(int i=0;i<2;i++){
            for(int e=0;e<4;e++){
                ejecutiva[i][e]=0;
            }
        }
        do {
            int opcion;
            String nombre;
            int cedula;
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Asignar sillas");
            System.out.println("2. Anular reserva");
            System.out.println("3. Generar reportes");
            java.util.Scanner l = new java.util.Scanner(System.in);
            opcion = l.nextInt();
            switch (opcion) {
                case 1: {
                    int ver=0;
                    int opcion2;
                    System.out.println("Nombre:");
                    nombre = l.next();
                    System.out.println("Cedula:");
                    cedula = l.nextInt();
                    System.out.println("Desea:");
                    System.out.println("1.Clase ejecutiva\n2.Clase econ\u00f3mica");
                    opcion2 = l.nextInt();
                    if (opcion2 == 1) {//clase ejecutiva
                        int ubicacion;
                        System.out.println("1.Ventana \n2.pasillo?");
                        System.out.println("ventana|1|2||pasillo||3|4|ventana");
                        ubicacion = l.nextInt();
                        if (ubicacion == 1) {//ubicacion=ventana
                            for(int i=0;i<2;i++){
                                for(int e=0;e<4;e++){
                                    if(e==0||e==3){
                                        if(ejecutiva[i][e]==0){
                                            ejecutiva[i][e]=1;
                                            nombresj[i][e]=nombre;
                                            cedulasj[i][e]=cedula;
                                            e=4;
                                            i=2;
                                            ver=1;
                                            System.out.println("Su compra fue exitosa");
                                        }
                                    }
                                }
                            }
                            if(ver==0){
                                System.out.println("No hay puestos en la ventana");
                            }
                        } else if (ubicacion == 2) {//ubicacion pasillo
                            for(int i=0;i<2;i++){
                                for(int e=0;e<4;e++){
                                    if(e==1||e==2){
                                        if(ejecutiva[i][e]==0){
                                            ejecutiva[i][e]=1;
                                            nombresj[i][e]=nombre;
                                            cedulasj[i][e]=cedula;
                                            e=4;
                                            i=2;
                                            ver=1;
                                            System.out.println("Su compra fue exitosa");
                                        }
                                    }
                                }
                            }
                            if(ver==0){
                                System.out.println("No hay puestos en el pasillo");
                            }
                        }
                    } else if (opcion2 == 2) {//clase economica
                        int opcion3;
                        System.out.println("1.pasillo\n2.centro\n3.ventana");
                        opcion3=l.nextInt();
                        switch(opcion3){
                            case 1:{
                                for(int i=0;i<7;i++){
                                    for(int e=0;e<6;e++){
                                        if(e==2||e==3){
                                            if(economica[i][e]==0){
                                                economica[i][e]=1;
                                                nombresc[i][e]=nombre;
                                                cedulasc[i][e]=cedula;
                                                e=6;
                                                i=7;
                                                ver=1;
                                                System.out.println("Su compra fue excitosa ");
                                            }
                                        }
                                    }
                                }
                                if(ver==0){
                                    System.out.println("No hay puestos en el pasillo");
                                }
                                break;
                            }
                            case 2:{
                                for(int i=0;i<7;i++){
                                    for(int e=0;e<6;e++){
                                        if(e==1||e==4){
                                            if(economica[i][e]==0){
                                                economica[i][e]=1;
                                                nombresc[i][e]=nombre;
                                                cedulasc[i][e]=cedula;
                                                e=6;
                                                i=7;
                                                ver=1;
                                                System.out.println("Su compra fue excitosa");
                                            }
                                        }
                                    }
                                }
                                if(ver==0){
                                    System.out.println("No hay puestos en el centro");
                                }
                                break;
                            }
                            case 3:{
                                for(int i=0;i<7;i++){
                                    for(int e=0;e<6;e++){
                                        if(e==0||e==5){
                                            if(economica[i][e]==0){
                                                economica[i][e]=1;
                                                nombresc[i][e]=nombre;
                                                cedulasc[i][e]=cedula;
                                                e=6;
                                                i=7;
                                                ver=1;
                                                System.out.println("Su compra fue excitosa");
                                            }
                                        }
                                    }
                                }
                                if(ver==0){
                                    System.out.println("No hay puestos en el ventana");
                                }
                                break;
                            }
                        }
                    }
                break;                    
                }
                case 2: {
                    int anular;
                    System.out.println("Cedula:");
                    anular=l.nextInt();
                    for(int i=0;i<7;i++){
                        for(int e=0;e<6;e++){
                            if(cedulasc[i][e]==anular){
                                economica[i][e]=0;
                                cedulasc[i][e]=0;
                                nombresc[i][e]=null;
                                System.out.println("Anulado");
                            }
                        }
                    }
                    for(int i=0;i<2;i++){
                        for(int e=0;e<4;e++){
                            if(cedulasj[i][e]==anular){
                                ejecutiva[i][e]=0;
                                cedulasj[i][e]=0;
                                nombresj[i][e]=null;
                                System.out.println("anulado");
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    int ocupadas=0;
                    for(int i=0;i<2;i++){
                        for(int e=0;e<4;e++){
                            if(ejecutiva[i][e]==1){
                                ocupadas++;
                            }
                        }
                    }
                    int perdida;
                    int puesto;
                    System.out.println("Sillas ejecutivas ocupadas:"+ocupadas);
                    System.out.println("Ingrese la cedula que desea buscar:");
                    perdida=l.nextInt();
                    for(int i=0;i<2;i++){
                        for(int e=0;e<4;e++){
                            if(cedulasj[i][e]==perdida){
                                if(i==0){
                                    puesto=e+1;
                                    System.out.println("Se encuentra en la silla"+puesto);
                                }
                                else{
                                    puesto=4+e+1;
                                    System.out.println("Se encuentra en la silla"+puesto);
                                }
                            }
                        }
                    }
                    for(int i=0;i<7;i++){
                        for(int e=0;e<6;e++){
                            if(cedulasc[i][e]==perdida){
                                puesto=i+i+i+i+i+i+e+9;
                                System.out.println("Se encuentra en la silla "+puesto);
                            }
                        }
                    }
                    for(int i=0;i<7;i++){
                        for(int e=0;e<6;e++){
                            if(economica[i][e]==0){
                                puesto=i+i+i+i+i+i+e+9;
                                System.out.println("Se encuentra la silla economica "+puesto);
                                e=6;
                                i=7;
                            }
                        }
                    }
                    int neconomica=0;
                    for(int i=0;i<7;i++){
                        for(int e=0;e<6;e++){
                            if(economica[i][e]==0){
                                if(e==0||e==5){
                                    neconomica++;
                                }
                            }
                        }
                    }
                    System.out.println("Numero de puestos disponibles en ventana en la clase economica:"+neconomica);
                    //funcion de nombres
                    for(int i =0;i<7;i++){
                        for(int e=0;e<6;e++){
                            for(int q=e+1;q<6;q++){
                                if(nombresc[i][e].equals(nombresc[i][q])){                                    
                                        System.out.println("Existen 2 : "+nombresc[i][e]);                                    
                                }else{}
                            }   
                        }
                    }
                    break;
                }
            }
            System.out.println("Desea realizar otra accion?");
            System.out.println("1. si\n2. no");
            x = l.nextInt();
        } while (x == 1);
    }
}
