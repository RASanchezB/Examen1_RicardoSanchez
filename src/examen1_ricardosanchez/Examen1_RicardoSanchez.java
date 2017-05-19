package examen1_ricardosanchez;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen1_RicardoSanchez {

    //Objetos usuarios
    static String Nombre;
    static int Edad;
    static String Profesion;
    static String Username;
    static String Contrasena;
    static ArrayList<Proyectos> UP = new ArrayList();
    //Objetos proyectos
    static String NombreP;
    static ArrayList<Archivos> Archivos = new ArrayList();
    static ArrayList<Usuarios> Colaboradores = new ArrayList();
    static int CantidadComit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        ArrayList<Usuarios> U = new ArrayList();
        ArrayList<Proyectos> P = new ArrayList();

        do {
            System.out.println("---Menu Principal---"
                    + "\n 1)Registrar usuario"
                    + "\n 2)Modificar usuario"
                    + "\n 3)Eliminar usuario"
                    + "\n 4)Listar usuario"
                    + "\n 5)Log In"
                    + "\nIngrese el numero de la opcion que desea:");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1://Crear nuevo usuario=============================================================================================
                    char resp2;
                    do {
                        System.out.println("Registro");
                        System.out.println("Ingrese un nombre:");
                        Nombre = sc.next();
                        System.out.println("Ingrese su edad");
                        Edad = sc.nextInt();
                        System.out.println("Ingrese su profesion");
                        Profesion = sc.next();
                        System.out.println("Ingrese un nombre de usuario");
                        Username = sc.next();
                        System.out.println("Cree una constrsena");
                        Contrasena = sc.next();
                        U.add(new Usuarios(Nombre, Edad, Profesion, Username, Contrasena));
                        System.out.println("Desea ingresar a otro usuario [S/N]");
                        resp2 = sc.next().charAt(0);
                    } while (resp2 == 'S' || resp2 == 's');
                    break;

                case 2://Modificar usuario =============================================================================================
                    System.out.println("Modificar usuarios");
                    for (int i = 0; i < U.size(); i++) {
                        System.out.println("Usuario #" + i + " " + U.get(i));
                    }
                    System.out.println("Ingrese el numero del usuario que desea modificar");
                    int opMod = sc.nextInt();
                    while (opMod > U.size() || opMod < 0) {
                        System.out.println("Numero invalido. Ingrese otro:");
                        opMod = sc.nextInt();
                    }
                    System.out.println("Cual de los siguientes desea cambiar:"
                            + "\n 1) Username"
                            + "\n 2) Contrasena"
                            + "\nIngrese el numero del objeto a cambiar");
                    int opMod2 = sc.nextInt();

                    switch (opMod2) {
                        case 1://Cambiar username------------------------------------------------------------------------------------
                            System.out.println("Ingrese el nuevo username");
                            Username = sc.next();
                            U.get(opMod).setUsername(Username);
                            break;
                        case 2://cambiar contrasena---------------------------------------------------------------------------------
                            System.out.println("Ingrese la nueva contrasena");
                            Contrasena = sc.next();
                            U.get(opMod).setContrasena(Contrasena);
                            break;
                        default:
                            break;
                    }
                    break;

                case 3://Eliminar usuarios===========================================================================================
                    System.out.println("Eliminar usuarios");
                    for (int i = 0; i < U.size(); i++) {
                        System.out.println("Usuario #" + i + " " + U.get(i));
                    }
                    System.out.println("Ingrese el numero del usuario a eliminar");
                    int opElim = sc.nextInt();
                    while (opElim > U.size() || opElim < 0) {
                        System.out.println("Numero invalido. Ingrese otro:");
                        opElim = sc.nextInt();
                    }
                    U.remove(opElim);
                    break;

                case 4://Listar usuarios=============================================================================================
                    System.out.println("Listar usuarios");
                    for (int i = 0; i < U.size(); i++) {
                        System.out.println("Usuario #" + i + " " + U.get(i));
                    }
                    break;

                case 5://Log In======================================================================================================
                    int NumUs = -1;
                    System.out.println("LOG IN");
                    System.out.println("Ingrese su Usernarme");
                    String LUsername = sc.next();
                    for (int i = 0; i < U.size(); i++) {
                        if (U.get(i).getUsername().equals(LUsername)) {
                            NumUs = i;
                        }
                    }
                    if (NumUs == -1) {
                        System.out.println("No hay un usuario con ese username");
                    } else {
                        System.out.println("Ingrese su contrasena");
                        String LContrasena = sc.next();
                        if (U.get(NumUs).getContrasena().equals(LContrasena)) {
                            int Cantidadcomit = 0;
                            char resp3 = 'n';
                            do {
                                System.out.println("Lista de proyectos");
                                for (int i = 0; i < U.get(NumUs).getUP().size(); i++) {
                                    System.out.println("Proyecto #" + i + "   " + U.get(NumUs).getUP().get(i));
                                }
                                System.out.println("Menu del usuario:"
                                        + "\n 1) Crear proyecto"
                                        + "\n 2) Modificar proyecto"
                                        + "\n 3) Eliminar proyecto"
                                        + "\n 4) Log out"
                                        + "Ingrese el numero de la opcion que desea:");
                                int opcionPro = sc.nextInt();
                                switch (opcionPro) {
                                    case 1://Crear archivo ---------------------------------------------------------------------------
                                        System.out.println("Ingrese el nombre:");
                                        NombreP = sc.next();
                                        U.get(NumUs).getUP().add(new Proyectos(NombreP, Cantidadcomit));
                                        System.out.println("Ingrese el nombre de los colaboradores");
                                        String colab = sc.next();
                                        for (int i = 0; i < U.size(); i++) {
                                            if (U.get(i).getUsername().equals(colab)) {

                                            }
                                        }
                                        break;
                                    case 2://Modificar proyecto------------------------------------------------------------------------
                                        System.out.println("Modificar proyectos");
                                        for (int i = 0; i < U.get(NumUs).getUP().size(); i++) {
                                            System.out.println("Proyecto #" + i + "   " + U.get(NumUs).getUP().get(i));
                                        }
                                        System.out.println("Ingrese el numero del proyecto a modificar");
                                        int modPro = sc.nextInt();
                                        System.out.println("Lista de archivos en el proyecto");
                                        for (int i = 0; i < U.get(NumUs).getUP().get(modPro).getArchivos().size(); i++) {
                                            System.out.println("Archivo #" + i + "   " + U.get(NumUs).getUP().get(modPro).getArchivos());
                                        }
                                        System.out.println("Menu de modificacion de proyectos"
                                                + "\n 1)Crear archivo"
                                                + "\n 2)Modificar archivo"
                                                + "\n 3)Eliminar archivo"
                                                + "\n 4)Ingresar comando"
                                                + "\n 5)Volver");
                                        break;

                                    case 3://Eliminar proyecto-------------------------------------------------------------------------
                                        System.out.println("Eliminar proyectos");
                                        for (int i = 0; i < U.get(NumUs).getUP().size(); i++) {
                                            System.out.println("Proyecto #" + i + "   " + U.get(NumUs).getUP().get(i));
                                        }
                                        System.out.println("Ingrese el numero del proyecto a eliminar");
                                        int modelim = sc.nextInt();
                                        U.get(NumUs).getUP().remove(modelim);
                                    default:
                                        break;
                                }
                                System.out.println("Desea regresar al menu del proyecto [S/N]");
                                resp3 = sc.next().charAt(0);
                            } while (resp3 == 's' || resp3 == 'S');

                        } else {
                            System.out.println("Contrsena incorrecta");
                        }
                    }
                    break;

                default:
                    break;
            }

            System.out.println("Desea regresar al menu principal [S/N]");
            resp = sc.next().charAt(0);
        } while (resp == 'S' || resp == 's');
    }

}
