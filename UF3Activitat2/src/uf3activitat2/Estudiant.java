package uf3activitat2;

public class Estudiant extends Persona {

    private String matricula;

    private String cicle;

    public Estudiant(String matricula, String cicle, String nom, int edat) {
        super(nom, edat);
        this.matricula = matricula;
        this.cicle = cicle;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public void mostraMajoriaEdat() {
        
        if (getEdat() >= 18) {
            System.out.println("Es major d'edat");
        } else {
            System.out.println("Es menor d'edat");
        }
        
    }
}
