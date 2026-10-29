import java.time.LocalDateTime;

public class Mensagem {
	private LocalDateTime dataEnvio;
	private String conteudo;
	private String remetente;
	
	public Mensagem(LocalDateTime dataEnvio, String conteudo, String remetente) {
		super();
		this.setDataEnvio(dataEnvio);
		this.setConteudo(conteudo);
		this.setRemetente(remetente);
	}

	public LocalDateTime getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	
	public void enviarMensagem(Mensagem novamensagem) {
		
	}
}
