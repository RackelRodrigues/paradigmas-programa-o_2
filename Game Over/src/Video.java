public class Video extends Midias {
	
	private String caminho;
	java.util.Random r = new java.util.Random();
	
	public Video() {
		caminho = String.valueOf(Long.toHexString(r.nextLong()));
	}
	public String caminho() {
		return caminho;
	}

}


