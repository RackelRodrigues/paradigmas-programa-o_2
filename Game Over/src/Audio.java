import java.util.Objects;

public class Audio extends Midias {
	private String caminho;
	java.util.Random r = new java.util.Random();
	
	public Audio() {
		caminho = String.valueOf(Long.toHexString(r.nextLong()));
	}
	
	public String caminho() {
		return caminho;
	}
	
  @Override
	public int hashCode() {
		return Objects.hash(caminho, r);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Audio other = (Audio) obj;
		return Objects.equals(caminho, other.caminho) && Objects.equals(r, other.r);
	}
}
