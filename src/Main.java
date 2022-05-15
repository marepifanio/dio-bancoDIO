public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Agencia ag = new Agencia();
        banco.getAgencias().add(ag);

        Cliente marcelo = new Cliente("Marcelo");
        Conta contaMarcelo = new ContaPoupanca(marcelo,ag);
        ag.getContas().add(contaMarcelo);
        contaMarcelo.depositar(100);

        Cliente fulano = new Cliente("Fulano");
        Conta contaFulano = new ContaCorrente(fulano, ag);
        ag.getContas().add(contaFulano);
        contaFulano.depositar(250);

        ag.imprimirContas();

        System.out.println(banco.getNome());

    }
}
