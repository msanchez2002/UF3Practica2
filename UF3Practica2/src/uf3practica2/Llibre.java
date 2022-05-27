package uf3practica2;

public class Llibre {

    private String nom;

    private String tipus;

    private String editorial;

    private int any;

    private String autor;

    private String identificador;

    private String estat;

    public Llibre(String nom, String tipus, String editorial, int any, String autor, String identificador, String estat) {
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
        this.identificador = identificador;
        this.estat = estat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    
}
