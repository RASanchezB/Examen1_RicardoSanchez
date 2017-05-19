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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        ArrayList<Usuarios> U = new ArrayList();
        
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
                        U.add(new Usuarios(Nombre,Edad,Profesion,Username,Contrasena));
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
                    while (opMod > U.size() || opMod < 0){
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
                    while (opElim > U.size() || opElim < 0){
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
                        if(U.get(i).getUsername().equals(LUsername)){
                            NumUs = i;
                        }
                    }
                    if(NumUs == -1){
                        System.out.println("No hay un usuario con ese username");  
                    }else{
                        System.out.println("Ingrese su contrasena");
                        String LContrasena = sc.next();
                        if(U.get(NumUs).getContrasena().equals(LContrasena)){
                            
                        }else{
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
