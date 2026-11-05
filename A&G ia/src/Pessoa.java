
public class Pessoa extends Usuario {
	private String email;
	private boolean plano;
	private boolean logado;
	


	public Pessoa(String nome, String email, boolean plano, boolean login) {
		super(nome);
		this.email = email;
		this.plano = plano;
		this.setLogado(login);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void fazerLogin() {
		this.setLogado(true);
	}
	
	public void criarConta() {
		
	}
	public void VerPlano() {
	}

	public boolean isPlano() {
		return plano;
	}

	public void setPlano(boolean plano) {
		this.plano = plano;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}




}


