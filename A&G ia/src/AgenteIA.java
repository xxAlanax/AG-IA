
public class AgenteIA extends Usuario implements Geravel {
	private String modelo;
	
	public AgenteIA(String nome, String modelo) {
		super(nome);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String gerar() {
		return null;
	}
	
	
}


// Modificações
public class AgenteIA extends Usuario implements Geravel {
	private String modelo;
	
	public AgenteIA(String nome, String modelo) {
		super(nome);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String gerarResposta(String pergunta) {
		return "Recebi sua mensagem: \"" + pergunta + "\". (resposta simulada do modelo " + modelo + ")";
	}

	@Override
	public String gerar() {
		return gerarResposta("");
	}
}
