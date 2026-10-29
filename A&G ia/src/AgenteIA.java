
public class AgenteIA implements Geravel {
	private String nome;
	private String modelo;
	
	public AgenteIA(String nome, String modelo) {
		super();
		this.setNome(nome);
		this.setModelo(modelo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
