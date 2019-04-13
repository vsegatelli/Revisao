package br.com.digitalhouse;

public class Professores implements DarAula {
    private String nome;
    private String rd;

    public Professores() {
    }

    public Professores(String novoNome, String registro) {
        nome = novoNome;
        rd = registro;
    }


    @Override
    public void darAula() {

    }

    @Override
    public void chamada() {

    }
}
