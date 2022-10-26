import java.util.ArrayList;

public class Bicicleta extends Veiculo {

    private String marca;
    private String cor;
    
    private static ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public Bicicleta(
        int id,
        String nome,
        String marca, 
        String cor
    ) {
        super(id, nome);
        this.marca = marca;
        this.cor = cor;

        bicicletas.add(this);
    }

    public String marca() {
        return marca;
    } 

    public void marca(String marca) {
        this.marca = marca;

    }

    public String cor() {
        return cor;
    } 

    public void cor(String cor) {
        this.cor = cor;

    }

    public static Bicicleta getBicicleta(int id) throws Exception {
       for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getId() == id) {
                return bicicleta;
            }
       }
       throw new Exception("Bicicleta não encontrada");
    }

    public static void removeAve(int id) throws Exception {
        Bicicleta bicicleta = getBicicleta(id);
        bicicletas.remove(bicicleta);
    }

    @Override
    public String toString() {
        return "ID" + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Marca: " + this.getMarca() + "\n"
        + "Cor: " + this.getCor() + "\n";
    }
        
}
