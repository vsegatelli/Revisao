package br.com.digitalhouse;

public class Aula {
    public String materia;
    public Float horaInicio;
    public Float horaFim;

    public Aula (){}

    public Aula(String novaMateria, Float inicio, Float fim){
        materia = novaMateria;
        horaInicio = inicio;
        horaFim = fim;
    }
}
