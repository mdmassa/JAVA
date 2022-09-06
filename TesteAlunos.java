/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;
import java.util.Scanner;

/**
 *
 * @author mariaeduardamassa
 */
public class TesteAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maiorNota = 0.0;
        double media = 0.0;
        String alunoMaiorNota = "";
        
        System.out.print("Quantidade de Alunos: ");
        int tamArray = input.nextInt();
        input.nextLine();
        
        System.out.println("\n==== Cadastro Disciplina ====");
        System.out.print("Nome da disciplina: ");
        String auxNomeD = input.nextLine();
        
        System.out.print("Ano: ");
        int auxAno = input.nextInt();
        input.nextLine();
        
        Aluno[] matriculados = new Aluno[tamArray];
        
        Disciplina d1 = new Disciplina(auxNomeD, auxAno, matriculados);
        
        System.out.println("\n==== Cadastro turma de " + d1.getNome() + " " + d1.getAno() + " ====");
        
        for (int i = 0; i < d1.getMatriculados().length; i++) {
            System.out.print("Nome do aluno " + (i+1) + ": ");
            String auxNomeA = input.nextLine();
            double auxNota = Math.random()*10;
            
            Aluno a = new Aluno(auxNomeA, auxNota);
            d1.getMatriculados()[i] = a;
            
            if (auxNota > maiorNota){
                alunoMaiorNota = auxNomeA;
                maiorNota = auxNota;
            }
            
            media += auxNota;
        }
        
        System.out.println("");
        
        for(Aluno iterador : matriculados){
            System.out.println("Nome do aluno: " + iterador.getNome());
            System.out.println("Nota do aluno: " + iterador.getNota() + "\n");
        }
        
        System.out.println("\nAluno com a maior nota e: " + alunoMaiorNota);
        System.out.println("Media da turma: " + media/d1.getMatriculados().length);
    }
}
