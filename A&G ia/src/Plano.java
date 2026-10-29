
public class Plano {
	private String nome;
	private Double preco;
	private int limiteMensagem;
	private int limiteImagem;
	
	public Plano(String nome, Double preco, int limiteMensagem, int limiteImagem) {
		super();
		this.setNome(nome);
		this.setPreco(preco);
		this.setLimiteMensagem(limiteMensagem);
		this.setLimiteImagem(limiteImagem);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getLimiteMensagem() {
		return limiteMensagem;
	}

	public void setLimiteMensagem(int limiteMensagem) {
		this.limiteMensagem = limiteMensagem;
	}

	public int getLimiteImagem() {
		return limiteImagem;
	}

	public void setLimiteImagem(int limiteImagem) {
		this.limiteImagem = limiteImagem;
	}
	
	public void consultarLimites() {
	}
	
}
