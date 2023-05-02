package unifesspa.exerciciofixacao02;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario();
        
        System.out.print("Nome: ");
        f1.nome = input.nextLine();
        
        System.out.print("Salario bruto: ");
        f1.salarioBruto = input.nextDouble();
        
        System.out.print("Imposto: ");
        f1.imposto = input.nextDouble();
        
        System.out.println("Funcionario: " + f1.nome + ", R$ " + f1.salarioBruto);
        
        System.out.print("Deseja aumentar o salario em quantos porcento?: ");
        double porcentagem = input.nextDouble();
        f1.aumentarSalario(porcentagem);
        
        System.out.println(f1);
                
    }
}
