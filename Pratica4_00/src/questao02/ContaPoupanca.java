package questao02;

public class ContaPoupanca extends Conta {
        private double saldo;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor){
        this.saldo =+ saldo;
    }
    @Override
    public void sacar(double valor){
        this.saldo =- valor;
    }

}
