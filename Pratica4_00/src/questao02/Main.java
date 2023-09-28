package questao02;

public class Main{
    public static void main(String[] args) {
       ContaCorrente cc = new ContaCorrente(500);
       cc.depositar(1000);
       cc.sacar(300);

       ContaPoupanca cp = new ContaPoupanca(500);
       cp.depositar(1000);
       cp.sacar(25);

       GeradorExtratos gerador = new GeradorExtratos();
       gerador.geradorConta(cc);
       gerador.geradorConta(cp);
    }
}