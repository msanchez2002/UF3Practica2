package uf3activitat2;

public class Docent extends Persona {

    private String modul;

    public Docent(String modul, String nom, int edat) {
        super(nom, edat);
        this.modul = modul;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    
}
