package questao01;

public class Main{
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca(500);
        cp.setSaldo(100);
        cp.imprimeExtrato();
    }
}