import java.util.ArrayList;

public abstract class Veiculo{

    private int id;
    private String nome;

    protected Veiculo(

    int id,
    String nome
    
    ) {
        this.setId(id);
        this.setNome(nome);
    }
          

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

     public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id=" + id + "\n"
            +"nome=" + nome + "\n";

    }
}