
	public class JogadorCaptain extends Jogador {
		private double influencia;

		public JogadorCaptain() {
			super();
			influencia = 0;
		}

		public JogadorCaptain(String nome, String sobrenome, String nickname, String email, int idade, String senha, double influencia) {
			super(nome, sobrenome, nickname, email, idade, senha);
			this.influencia = influencia;
		}

		public double getInfluencia() {
			int curtidasTotal = 0;
			for(int i = 0; i < getPostagens().size(); i++) {
				curtidasTotal = curtidasTotal + getPostagens().get(i).getCurtidas();
			}
			influencia = curtidasTotal * 2.3;
			return influencia;
		}

		public void setInfluencia(double influencia) {
			this.influencia = influencia;
		}
	}



