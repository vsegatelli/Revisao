package br.com.digitalhouse;

public class Curso {
    public String nomeCurso;
    public String conjuntoAula;
    public String [listaAlunos];

    public Curso (){}

    public Curso (String curso, String aula, String alunos){
        nomeCurso = curso;
        conjuntoAula = aula;
        listaAlunos = alunos;
    }

}
