import java.util.ArrayList;
import java.util.List;

public class Banco {


        private static final String NOME = "DIO_BANCO";
        private List<Agencia> agencias = new ArrayList<>();

        public String getNome() {
                return NOME;
        }

        public List<Agencia> getAgencias(){
                return this.agencias;
        }
}
