package unifesspa.exerciciofixacao04;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual é o preco do dolar? ");
        double dolar = input.nextDouble();
        
        System.out.print("Quantos dolares vao ser comprados? ");
        double valor = input.nextDouble();
        
        ConversorMoeda.dolarParaReal(dolar, valor);
        
        System.out.printf("Total a ser pago em reais: %.2f", ConversorMoeda.totalEmReais());
        
    }
}
