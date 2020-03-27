package br.com.unicesumar.encapsulamento;

public class Curso {

    private String nome;
    private String professor;
    private String tema;
    private Double valor;

    public Curso() { }

    public Curso(String nome, String professor, String tema, double valor) {
        this.nome = nome;
        this.professor = professor;
        this.tema = tema;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) throws Exception {
        if(valor > 0 && valor < 1000.0){
           this.valor = valor;
        }else{
            throw new Exception("Numero não pode ser negativo, zero e maior que mil !!!");
        }
    }

    @Override
    public String toString() {
        return "Curso{ " +
                "nome ='" + nome + '\'' +
                ", professor = '" + professor + '\'' +
                ", tema = '" + tema + '\'' +
                ", valor= R$ " + valor +
                '}';
    }
}
