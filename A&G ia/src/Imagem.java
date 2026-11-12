import java.time.LocalDateTime;

public class Imagem implements Geravel{
	private String formato;
	private LocalDateTime dataCriacao;
	
	@Override
	public String gerar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
}


// Modificações
import java.time.LocalDateTime;

public class Imagem implements Geravel {
	private String formato;
	private String descricao;
	private LocalDateTime dataCriacao;

	public Imagem(String descricao) {
		this.descricao = descricao;
		this.formato = "PNG";
		this.dataCriacao = LocalDateTime.now();
	}
	@Override
	public String gerar() {
		return "[Imagem " + formato + " gerada a partir de: \"" + descricao + "\"]";
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	
}
