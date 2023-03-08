import java.util.ArrayList;
import java.util.Objects;

public class Jogador {
  private String nome;
  private String sobrenome;
  private String nickname;
  private String email;
  private int idade;
  private String senha;
  private ArrayList<Postagem> postagens;
  ArrayList<Jogo> jogos;

  public Jogador() {
    postagens = new ArrayList<Postagem>();
    jogos = new ArrayList<Jogo>();
    nome = "-";
    sobrenome = "-";
    nickname = "-";
    email = "-";
    idade = 00;
    senha = "-";
  }

  public Jogador(String nome, String sobrenome, String nickname, String email, int idade, String senha) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.nickname = nickname;
    this.email = email;
    this.idade = idade;
    this.senha = senha;
    postagens = new ArrayList<Postagem>();
  }

  public ArrayList<Postagem> getPostagens() {
    return postagens;
  }

  public void setPostagens(ArrayList<Postagem> postagens) {
    this.postagens = postagens;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public boolean teste() {
    if (nome == null) {
      System.out.println("Nome invalido");
      return false;
    } else if (sobrenome == null) {
      System.out.println("Sobrenome invalido");
      return false;
    } else if (nickname == null) {
      System.out.println("Nickname invalido");
      return false;
    } else if (email == null) {
      System.out.println("Email invalido");
      return false;
    }

    else if (idade < 18) {
      System.out.println("Necessario ter mais de 18 anos");
      return false;
    } else if (senha == null) {
      System.out.println("Senha invalido");
      return false;
    } else {
      return true;
    }
  }

  public void apagaJogo(String id) {
    for (int i = 0; i < jogos.size(); i++) {
      Jogo jogoRemove = jogos.get(i);
      if (jogoRemove.getId().equals(id)) {
        jogos.remove(jogoRemove);
        break;
      }
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, idade, nickname, nome, senha, sobrenome);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Jogador other = (Jogador) obj;
    return Objects.equals(email, other.email) && idade == other.idade && Objects.equals(nickname, other.nickname)
        && Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
        && Objects.equals(sobrenome, other.sobrenome);
  }

  @Override
  public String toString() {
    return "Nome=" + nome + ", sobrenome=" + sobrenome + ", nickname=" + nickname + ", email=" + email
        + ", idade=" + idade + ", senha=" + senha + ", postagens=" + postagens;
  }

}

