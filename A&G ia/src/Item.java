import java.time.LocalDateTime;

public abstract class Item {
	protected String nome;
	protected LocalDateTime dataCriacao;
	
	abstract void criar();
	abstract void excluir();
	abstract void renomear();
	
}

// Modificações
import java.time.LocalDateTime;

public abstract class Item {
	protected String nome;
	protected LocalDateTime dataCriacao;

	public Item(String nome) {
		this.nome = nome;
		this.dataCriacao = LocalDateTime.now();
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	abstract void criar();
	abstract void excluir();
	abstract void renomear(String novoNome);
}
