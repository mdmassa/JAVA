/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

/**
 *
 * @author mariaeduardamassa
 */
public class Disciplina {
    private String nome;
    private int ano;
    private Aluno[] matriculados;

    public Disciplina(String nome, int ano, Aluno[] matriculados) {
        this.nome = nome;
        this.ano = ano;
        this.matriculados = matriculados;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the matriculados
     */
    public Aluno[] getMatriculados() {
        return matriculados;
    }

    /**
     * @param matriculados the matriculados to set
     */
    public void setMatriculados(Aluno[] matriculados) {
        this.matriculados = matriculados;
    }
}
