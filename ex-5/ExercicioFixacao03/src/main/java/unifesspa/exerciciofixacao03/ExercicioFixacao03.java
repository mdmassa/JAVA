package unifesspa.exerciciofixacao03;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Aluno a = new Aluno();
        
        System.out.println("Digite o nome do aluno e suas 3 notas:");
        a.nome =  input.nextLine();
        a.n1 = input.nextDouble();
        a.n2 = input.nextDouble();
        a.n3 = input.nextDouble();
        
        System.out.printf("Nota final: %.2f", a.notaFinal());
        
        if(a.notaFinal() >= 60.0) {
            System.out.println("\nAprovado.");     
        } else {
            System.out.println("\nReprovado.");
            System.out.printf("Faltando %.2f pontos", a.pontosFaltando());
        }
        
        input.close();
    }
}
