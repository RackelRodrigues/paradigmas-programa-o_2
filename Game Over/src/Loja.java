import java.util.ArrayList;
import java.util.Objects;

public class Loja {
  ArrayList<Jogador> jogadores;

  public Loja() {
    jogadores = new ArrayList<Jogador>();
  }

  public ArrayList<Jogador> getJogadores() {
    return jogadores;
  }

  public void cadastraJogador() {

  }

  public void setJogadores(ArrayList<Jogador> jogadores) {
    this.jogadores = jogadores;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jogadores);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Loja other = (Loja) obj;
    return Objects.equals(jogadores, other.jogadores);
  }

  @Override
  public String toString() {
    return "jogadores=" + jogadores;
  }

}
