import java.util.ArrayList;

public abstract class Veiculo implements GetId {

    private int id;
    private String nome;

    private ArrayList<veiculo> veiculos;

    protected Veiculo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.idlocacao = locacao.getId();
    }
}    
