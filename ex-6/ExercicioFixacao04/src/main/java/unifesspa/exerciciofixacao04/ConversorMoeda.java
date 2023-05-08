package unifesspa.exerciciofixacao04;

public class ConversorMoeda {
    public static double valor;
    
    public static void dolarParaReal(double dolar, double valor){
        ConversorMoeda.valor = dolar * valor;
    }
    
    public static double totalEmReais(){
        double iof = 0.06;
        return (iof * valor) + valor;   
    } 
}
