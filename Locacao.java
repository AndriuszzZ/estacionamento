import java.util.ArrayList;

public class locacao {
    
    private int id;
    private String data;
    
    puplic static ArrayList<Locacao> locacao = new ArrayList<>();
    
    puplic Locacao(
        int id,
        String data
    ){
        this.id = id;
        this.data = data;
        
        locacao.setlocacao(this);
        
        locacao.add(this);
    }
    
    @Override
    public String toString() {
        return "Id: " + id + "\n"
        + "Data: " + data + "\n";
    }
    puplic int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
    public static Locacao verificaId(int id) throws Exception{
        for (Locacao locacao : locacao) {
            if (limpeza.id == id) {
                return limpeza;
            }
        }
        throw new Exception("Limpeza não encontrada");
    }
}
