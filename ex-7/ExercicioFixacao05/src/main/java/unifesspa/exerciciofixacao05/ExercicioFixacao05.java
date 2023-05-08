package unifesspa.exerciciofixacao05;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.println("============= Cadastrando Conta =============");
        System.out.print("Numero da conta: ");
        int numConta = input.nextInt();
        input.nextLine();
        
        System.out.print("Nome do titular da conta: ");
        String titular = input.nextLine();
        
        Conta a = new Conta(numConta, titular);
        
        System.out.print("\nDeseja realizar um deposito inicial? (s / n) ");
        String resp1 = input.nextLine();
        
        if (resp1.equals("s")) {
            System.out.print("\nDigite o valor a ser depositado: ");
            double valor = input.nextDouble();
            input.nextLine();
            
            a.depositar(valor);
            System.out.println(a.toString());
            
            System.out.print("\nDeseja realizar um saque? (s / n) ");
            resp1 = input.nextLine();
            
            if (resp1.equals("s")) {
            System.out.print("\nDigite o valor a ser sacado: ");
            valor = input.nextDouble();
            input.nextLine();
            
            a.sacar(valor);
            System.out.println(a.toString());
            
            } else {
                System.out.println("\nOperações na conta encerradas com sucesso.");
            }
        
            
        } else {
            System.out.println(a.toString());
        }
        
        input.close();
    }
}
