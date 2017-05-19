package examen1_ricardosanchez;

import java.util.ArrayList;

public class Carpetas extends Archivos{
    private ArrayList <ArchivosDTexto> ADT = new ArrayList();
    private ArrayList <Carpetas> AC = new ArrayList();

    public Carpetas() {
        super();
    }

    public ArrayList<ArchivosDTexto> getADT() {
        return ADT;
    }

    public void setADT(ArrayList<ArchivosDTexto> ADT) {
        this.ADT = ADT;
    }

    public ArrayList<Carpetas> getAC() {
        return AC;
    }

    public void setAC(ArrayList<Carpetas> AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return "Carpetas{" + "ADT=" + ADT + '}';
    }
    
    
}
