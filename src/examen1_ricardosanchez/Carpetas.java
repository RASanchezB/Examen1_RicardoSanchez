package examen1_ricardosanchez;

import java.util.ArrayList;

public class Carpetas extends Archivos{
    private ArrayList <ArchivosDTexto> ADT = new ArrayList();

    public Carpetas() {
        super();
    }

    public ArrayList<ArchivosDTexto> getADT() {
        return ADT;
    }

    public void setADT(ArrayList<ArchivosDTexto> ADT) {
        this.ADT = ADT;
    }

    @Override
    public String toString() {
        return "Carpetas{" + "ADT=" + ADT + '}';
    }
    
    
}
