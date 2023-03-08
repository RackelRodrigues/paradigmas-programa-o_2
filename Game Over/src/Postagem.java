import java.util.ArrayList;
import java.util.Objects;

public class Postagem {
	private int curtidas;
	private String texto;
	private ArrayList<Midias> Midias;
	
	public Postagem() {
		curtidas = 0;
		texto = "";
		Midias = new ArrayList<Midias>();
	}
	
	public Postagem(String texto) {
		curtidas = 0;
		this.texto = texto;
	}
	
	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean testePost () {
		if(texto.length() > 100) {
			System.out.println("Postagem muito grande (Maximo 100 caracteres");
			return false;
		}
		else {
			return true;
		}
	}
	
	public void adicionaPostagem(Midias postagem) {
		Midias.add(postagem);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(curtidas, texto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Postagem other = (Postagem) obj;
		return curtidas == other.curtidas && Objects.equals(texto, other.texto);
	}

	@Override
	public String toString() {
		return "Curtidas=" + curtidas + ", texto=" + texto;
	}
	
	
}

