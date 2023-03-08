public class Imagem extends Midias {
	private String caminho;
	java.util.Random r = new java.util.Random();
	
	public Imagem() {
		caminho = String.valueOf(Long.toHexString(r.nextLong()));
	}
	
	public String caminho() {
		return caminho;
	}

}
