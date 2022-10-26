import java.util.ArrayList;

public class Moto extends Veiculo {

    private String placa;
    private String cor;
    
    private static ArrayList<Moto> motos = new ArrayList<>();

    public Moto(
        int id,
        String nome,
        String placa, 
        String cor
    ) {
        super(id, nome);
        this.placa = placa;
        this.cor = cor;

        motos.add(this);
    }

    public String placa() {
        return placa;
    } 

    public void placa(String placa) {
        this.placa = placa;

    }

    public String cor() {
        return cor;
    } 

    public void cor(String cor) {
        this.cor = cor;

    }

    public static Moto getMoto(int id) throws Exception {
       for (Moto moto : motos) {
            if (moto.getId() == id) {
                return moto;
            }
       }
       throw new Exception("moto não encontrada");
    }

    public static void removeMoto(int id) throws Exception {
        Moto moto = getMoto(id);
        motos.remove(moto);
    }

    @Override
    public String toString() {
        return "ID" + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "placa: " + this.getPlaca() + "\n"
        + "Cor: " + this.getCor() + "\n";
    }
        
}
