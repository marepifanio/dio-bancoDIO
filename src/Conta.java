public abstract class Conta implements IConta{

    private static int SEQUENCIAL = 1;

    protected int numero;
    protected double saldo;
    protected Agencia agencia;
    protected Cliente cliente;

    public Conta(Cliente cliente, Agencia agencia) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = SEQUENCIAL++;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() { return cliente; }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia.getID()));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
