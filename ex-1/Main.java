import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int op;
        boolean menu = true;

        String nome = "null";
        String login =  "null";
        String senha = "null";

        String verificaLogin;
        String verificaSenha;

        while(menu == true){

            System.out.println("|-------------------------------|");
            System.out.println("|         Sistema Teste         |");
            System.out.println("|-------------------------------|");
            System.out.println();
            System.out.println();
    
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Login");
            System.out.println();
            System.out.println("Qualquer outro valor para sair...");


            System.out.print("Digite um valor para continuar >> ");
            op = input.nextInt();
    
            input.nextLine();

            switch (op) {
                case 1:
                    System.out.println("|-------------------------------|");
                    System.out.println("|            Cadastro           |");
                    System.out.println("|-------------------------------|");
                    System.out.println();
                    System.out.println();
                    System.out.print("Digite seu nome: ");
                    nome = input.nextLine();

                    System.out.print("Digite seu login: ");
                    login = input.nextLine();

                    System.out.print("Digite sua senha: ");
                    senha = input.nextLine();
                break;
            
                case 2:
                    System.out.println("|-------------------------------|");
                    System.out.println("|             Login             |");
                    System.out.println("|-------------------------------|");
                    System.out.println();
                    System.out.println();
                    System.out.print("Login: ");
                    verificaLogin = input.nextLine();
                    System.out.print("Senha: ");
                    verificaSenha = input.nextLine();

                    if (verificaLogin.equals(login) && verificaSenha.equals(senha)) {
                        System.out.println("Login realizado com sucesso...");
                    } else {
                        System.out.println("Credenciais incorretas...");
                    }
                break;

                default:
                    menu = false;
                break;
            }
        }
    }
}
