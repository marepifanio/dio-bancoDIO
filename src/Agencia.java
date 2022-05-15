import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private static int ID = 1;

    private final List<Conta> contas = new ArrayList<>();

    public Agencia() {
        this.ID = Agencia.ID++;
    }

    public static int getID() {
        return ID;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void imprimirContas(){
        for (Conta conta : this.getContas()) {
            conta.imprimirInfosComuns();
        }
    }

    public Conta getContaByNomeCliente(String nomeCliente){
        for (Conta conta : this.getContas()){
            if (conta.cliente.getNome() == nomeCliente){
                return conta;
            }
        }
        return null;
    }
}
