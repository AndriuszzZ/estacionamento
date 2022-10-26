import java.util.ArrayList;

public class Carro extends Veiculo {

    private String placa;
    private String cor;
  
    private static ArrayList<Carro> carros = new ArrayList<>();
  
    public Carro(
      int id,
      String nome,
      String placa,
      String cor
  ) {
      super(id, nome);
      this.placa = placa;
      this.cor = cor;
      
      carros.add(this);
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
  
  public static Carro getCarro(int id) throws Exception {
    for (Carro carro : carros) {
        id (carro.getId() == id) {
            return carro;
        }
    }
    throw new Exception("Carro não encontrada");
  }
  
  public static void removeCarro(int id) throws Exception {
        Carro carro = getCarro(id);
        carro.remove(carro);
  }
  
  @Override
    public String toString() {
        return "ID" + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Placa: " + this.getPlaca() + "\n"
        + "Cor: " + this.getCor() + "\n";
    }
}
