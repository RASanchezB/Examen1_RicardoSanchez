package examen1_ricardosanchez;

public class Archivos extends Proyectos{
    private String NombreA;
    private int tamano;

    public Archivos() {
        super();
    }
    
    public Archivos(String NombreA, int tamano) {
        this.NombreA = NombreA;
        this.tamano = tamano;
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Archivos:" + "\n   Nombre del Archivo=" + NombreA + "\n   tamano=" + tamano;
    }
    
}
