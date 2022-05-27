package uf3practica2;

import java.util.List;

public class Biblioteca {

    private List<Llibre> copies;

    public Biblioteca(List<Llibre> copies) {
        this.copies = copies;
    }

    public List<Llibre> getCopies() {
        return copies;
    }

    public void setCopies(List<Llibre> copies) {
        this.copies = copies;
    }

    
}
