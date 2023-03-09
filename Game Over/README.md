Sobre o sistema: A loja de Games foi feita para quem gosta de aventuras e um bom jogo. Sua missão como aluno é realizar a implementação do sistema da loja. A loja será composta por jogadores que poderão realizar cadastro no sistema, cada jogador deve ter apenas uma timeline, na qual ele poderá inserir posts à vontade. Logicamente uma loja de jogos precisa ter jogos, não é mesmo? No sistema da loja deverá ser possível realizar a criação de jogos. Esses jogos por sua vez poderão ser adicionados à conta do jogador, que realizar a sua compra.
<br/>
 - O sistema deve permitir o cadastro, a atualização e exclusão de um jogador, para a criação do jogador as seguintes informações serão necessárias: {Nome, Sobrenome, Nickname, E-mail, Idade, Senha}. Lembre-se de verificar e não deixar que dados inválidos sejam repassados para criação de jogadores, nome null, e-mail vazio, idade abaixo de 18 anos, etc. 
<br/>
 - Deve ser possível criar posts que contenham um texto e um número de curtidas. Detalhe: O texto do post deve ter no máximo 100 caracteres, mais que isso não deve ser permitido inserir na timeline do jogador. 
<br/>
 - Cada Post possui mídias associadas, que podem ser Áudio, Vídeo ou Imagem. Cada mídia do Post possui um caminho em String que indica a sua localização. 
O post pode possuir várias mídias simultaneamente.
<br/>
- Cada jogador da rede deverá ter sua timeline. E deverá ser única para cada jogador. A timeline contém um id que a identifica e uma lista ordenada de posts do jogador. Os posts devem estar ordenados de acordo com a ordem em que foram inseridos pelo jogador. Deve ser possível recuperar os posts da timeline de um jogador. 
<br/>
- Deve ser possível criar Jogos no sistema, cada jogo possui um id, nome e um preço. Bem como, deve ser possível atualizar o nome do jogo e deletar o mesmo através do id. O id de cada Jogo deve ser único. 
<br/>
- Cada jogador pode ter uma coleção de jogos, e assim adicionar quantos jogos quiser. Deve ser possível visualizar todos os jogos que foram adicionados à conta do jogador no formato {ID = xxxx, Nome = xxxx, Preço = xxxx}.
<br/>
- Deve ser possível calcular a influência de um jogador de acordo com o seu tipo, o sistema possui dois tipos de jogadores: Noob e o Captain. A influência é calculada de acordo com a quantidade de curtidas que cada um recebeu nos seus posts, para isso a soma total de curtidas deve ser feita. Segue a regra abaixo para o cálculo da influência: Influência Noob: (Total de curtidas * 1,8) e Influência Captain: (Total de curtidas * 2,3). Os números multiplicados são os fatores de cada jogador. Aqui assumimos que os jogadores de início devem ser cadastrados como Noob ou Captain, não ocorrendo nenhuma mudança de tipo durante o tempo de execução.
<br/>

- Deve ser possível visualizar todos os jogadores cadastrados no sistema, no seguinte formato: 

| Nome: nome + sobrenome|
| Nickname: nickname    |
| Idade: idade          |


