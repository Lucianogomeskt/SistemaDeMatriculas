package model;
import java.util.UUID;


public class Curso {

    private UUID id;
    private String nomeCurso;
    private int cargaHoraria;

    public Curso(String nomeCurso, int cargaHoraria){
        this.id = UUID.randomUUID();
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getNomeCurso(){

        return nomeCurso;
    }

    public int getCargaHoraria(){

        return cargaHoraria;
    }

    public UUID getId() {

        return id;
    }
}
