package br.com.digitalhouse;

public class Aluno {
    private String Ra;
    private String nome;
    private String sobrenome;


    public  Aluno(){}

    public  Aluno (String registro, String novoNome, String novoSobrenome){
        Ra = registro;
        nome = novoNome;
        sobrenome = novoSobrenome;
    }

    public String getRa() {
        return Ra;
    }

    public void setRa(String ra) {
        Ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
