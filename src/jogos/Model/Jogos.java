package jogos.Model;

public class Jogos {

	private String Tema;
	private String nomeDoJogo;
	private String localização;
	private int disponibilidade;

	public Jogos(String tema, String nomeDoJogo, String localização, int disponibilidade) {
		Tema = tema;
		this.nomeDoJogo = nomeDoJogo;
		this.localização = localização;
		this.disponibilidade = disponibilidade;
	}

	public String getTema() {
		return Tema;
	}

	public void setTema(String tema) {
		Tema = tema;
	}

	public String getNomeDoJogo() {
		return nomeDoJogo;
	}

	public void setNomeDoJogo(String nomeDoJogo) {
		this.nomeDoJogo = nomeDoJogo;
	}

	public String getLocalização() {
		return localização;
	}

	public void setLocalização(String localização) {
		this.localização = localização;
	}

	public int getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(int disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public boolean verificarDisponibilidade() {
		return disponibilidade > 0;

	}

	public void emprestarJogo() {
		if (disponibilidade > 0) {
			disponibilidade--;
			System.out.println("Parabéns jogador, seu emprestimo foi concluído!");
		} else {
			System.out.println("Eita, parece que esse não está disponível...");
		}
	}

	public void devolverJogo() {
		disponibilidade++;
		System.out.println("Hummmm... Cheirinho de gente responsável! <3");
	}

	public void adicionarLocalizacao(String novaLocalizacao) {
		this.localização = novaLocalizacao;
		System.out.println("Localização atualizada para: " + novaLocalizacao);
	}
}
