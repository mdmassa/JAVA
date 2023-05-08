package unifesspa.exerciciofixacao05;

public class Conta {
    private int numConta;
    private String titular;
    private double saldo;

    public Conta(int numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public Conta(int numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }
    
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void sacar(double valor){
        double taxa = 5.0;
        saldo -= valor + taxa;
    }
    
    public String toString(){
        return "\n============= Dados da conta =============" +
               "\nNumero da conta: " + numConta +
               "\nNome do titular: " + titular +
               "\nSaldo: R$ " + String.format("%.2f", saldo);
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
