package examen1_ricardosanchez;

public class Usuarios {
   private String Nombre;
   private int Edad;
   private String Profesion;
   private String Username;
   private String Contrasena;

    public Usuarios() {
    }

    public Usuarios(String Nombre, int Edad, String Profesion, String Username, String Contrasena) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Profesion = Profesion;
        this.Username = Username;
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    @Override
    public String toString() {
        return "Usuario:" + "\n   Nombre=" + Nombre + "\n   Edad=" + Edad + "\n   Profesion=" + Profesion + "\n   Username=" + Username + "\n   Contrasena=" + Contrasena;
    }
   
}
