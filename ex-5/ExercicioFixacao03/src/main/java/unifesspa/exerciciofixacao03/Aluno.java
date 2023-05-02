package unifesspa.exerciciofixacao03;

public class Aluno {
    public String nome;
    public double n1;
    public double n2;
    public double n3;
    
    public double notaFinal() {
        return n1 + n2 + n3;
    }
    
    public double pontosFaltando() {
        if (notaFinal() >= 60.0) {
            return 0.0;
        } else {
            return 60.0 - notaFinal();
        }
    }
}
