import java.time.LocalDateTime;

public abstract class itens {
	protected String nome;
	protected LocalDateTime dataCriacao;
	
	abstract void criar();
	abstract void excluir();
	abstract void renomear();
	
}
