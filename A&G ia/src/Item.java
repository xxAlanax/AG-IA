import java.time.LocalDateTime;

public abstract class Item {
	protected String nome;
	protected LocalDateTime dataCriacao;
	
	abstract void criar();
	abstract void excluir();
	abstract void renomear();
	
}
