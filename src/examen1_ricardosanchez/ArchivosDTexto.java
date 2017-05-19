package examen1_ricardosanchez;

public class ArchivosDTexto extends Archivos{
    private String Texto;

    public ArchivosDTexto() {
        super();
    }

    public ArchivosDTexto(String Texto) {
        this.Texto = Texto;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    @Override
    public String toString() {
        return "ArchivosDTexto{" + "Texto=" + Texto + '}';
    }
    
    
}
