import java.util.Objects;

public class Jogo {

  private String nome;
  private double preco;
  private String id;
  java.util.Random r = new java.util.Random();

  public Jogo() {
    nome = "-";
    id = String.valueOf(Long.toHexString(r.nextLong()));
    preco = 00;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void mudaNome(String novoNome) {
    nome = novoNome;
  }

  public void visualizaJogo(){
    System.out.println("ID= "+id+"Nome= "+nome+"Preço= "+preco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, preco, r);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Jogo other = (Jogo) obj;
    return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
        && Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco) && Objects.equals(r, other.r);
  }
}