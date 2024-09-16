//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBancaria {

        private Cliente titular;
        private double saldo;
        private String numeroConta;

    public ContaBancaria(Cliente titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public double deposito(double valor) {
        return this.saldo = this.saldo + valor;
    }
        public double saque(double valor){
            return this.saldo=this.saldo-valor;

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroConta='" + numeroConta + '\'' +
                '}';
    }

    }


