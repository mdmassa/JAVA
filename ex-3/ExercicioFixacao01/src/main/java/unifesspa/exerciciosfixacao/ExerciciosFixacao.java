package unifesspa.exerciciosfixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosFixacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Retangulo r1 =  new Retangulo();
        
        System.out.println("Entre com a largura e altura do triangulo:");
        r1.w = input.nextDouble();
        r1.h = input.nextDouble();
        
        System.out.println(r1);
        
        input.close();
    }
}
