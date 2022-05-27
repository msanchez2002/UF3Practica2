package uf3activitat2;

public class ProgramaMatricula {

    public static void main(String[] args) {
        
        Estudiant estudiant1 = new Estudiant("","","",0);
        estudiant1.setEdat(45);
        System.out.println(estudiant1.getEdat());
        estudiant1.mostraMajoriaEdat();
        
    }
}
