package uf3practica2;

import java.util.List;

public class Lector {

    private List<Llibre> llibres;

    private int llibresActuals;

    private final int QUANTITAT_MAXIMA_LLIBRES = 3;

    public Lector(List<Llibre> llibres, int llibresActuals) {
        this.llibres = llibres;
        this.llibresActuals = llibresActuals;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }

    public int getLlibresActuals() {
        return llibresActuals;
    }

    public void setLlibresActuals(int llibresActuals) {
        this.llibresActuals = llibresActuals;
    }
    
}
