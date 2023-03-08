public class Main {
	public static void main(String[] args){
		Jogador jogador1 = new Jogador("Augusto", "Lacerda", "Eagle", "AugustoLacerda@gmail.com", 19, "Augusto123");
		Loja loja1 = new Loja();
		Postagem postagem1 = new Postagem("Iae glr");
		int indiceJogador = 0;
		
		
		
		if (jogador1.teste()) {
			loja1.jogadores.add(jogador1);
		}
		
		if (postagem1.testePost()) {
			loja1.getJogadores().get(indiceJogador).getPostagens().add(indiceJogador , postagem1);
		}	
		
		for(int i = 0; i < loja1.getJogadores().size(); i++) {
			System.out.println("Nome= "+loja1.getJogadores().get(i).getNome()+" "+loja1.getJogadores().get(i).getSobrenome()+"\nNickname= "+loja1.getJogadores().get(i).getNickname()+"\nIdade= "+ loja1.getJogadores().get(i).getIdade());
		}
		
	}
}
