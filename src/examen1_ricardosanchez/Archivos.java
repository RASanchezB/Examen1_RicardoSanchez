package examen1_ricardosanchez;

import java.util.ArrayList;

public class Archivos extends Proyectos{
    private String NombreA;
    private int tamano;
    private ArrayList<Carpetas> PC = new ArrayList();
    private ArrayList<ArchivosDTexto> PAT = new ArrayList();

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

    public ArrayList<Carpetas> getPC() {
        return PC;
    }

    public void setPC(ArrayList<Carpetas> PC) {
        this.PC = PC;
    }

    public ArrayList<ArchivosDTexto> getPAT() {
        return PAT;
    }

    public void setPAT(ArrayList<ArchivosDTexto> PAT) {
        this.PAT = PAT;
    }

    @Override
    public String toString() {
        return "Archivos:" + "\n   Nombre del Archivo=" + NombreA + "\n   tamano=" + tamano;
    }
    
}
