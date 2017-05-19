package examen1_ricardosanchez;

import java.util.ArrayList;

public class Proyectos extends Usuarios{
    private String NombreP;
    private ArrayList<Archivos> Archivos = new ArrayList();
    private ArrayList<Usuarios> Colaboradores = new ArrayList();
    private int CantidadComit;

    public Proyectos() {
        super();
    }

    public Proyectos(String NombreP, int CantidadComit) {
        this.NombreP = NombreP;
        this.CantidadComit = CantidadComit;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public ArrayList<Archivos> getArchivos() {
        return Archivos;
    }

    public void setArchivos(ArrayList<Archivos> Archivos) {
        this.Archivos = Archivos;
    }

    public ArrayList<Usuarios> getColaboradores() {
        return Colaboradores;
    }

    public void setColaboradores(ArrayList<Usuarios> Colaboradores) {
        this.Colaboradores = Colaboradores;
    }

    public int getCantidadComit() {
        return CantidadComit;
    }

    public void setCantidadComit(int CantidadComit) {
        this.CantidadComit = CantidadComit;
    }

    @Override
    public String toString() {
        return "Proyectos:" + "\n   Nombre" + NombreP + "\n   Archivos=" + Archivos.toString() + "\n   Colaboradores=" + Colaboradores + "\n   CantidadComit=" + CantidadComit;
    }
    
}
