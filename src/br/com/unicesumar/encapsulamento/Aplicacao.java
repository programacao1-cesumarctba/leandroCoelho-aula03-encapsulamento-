package br.com.unicesumar.encapsulamento;

public class Aplicacao {
    public static void main(String[] args) throws Exception {

            Curso curso = new Curso();
            curso.setNome("João Pedro");
            curso.setProfessor("Henrique");
            curso.setTema("Encapsulamento");
            curso.setValor(100.0);

        System.out.println(curso);

    }
}
