package exercicio1oo;

public class Contabancaria {
    String numero;
    double saldo=0;
    double saque;
    double deposito;

    void depositar(double valor){
        this.saldo += valor;
    }
    void sacar(double valor) {
        this.saldo -= valor;
    }
}
