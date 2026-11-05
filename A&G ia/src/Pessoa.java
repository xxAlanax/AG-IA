
public class Pessoa extends Usuario {
	private String email;
	private Plano plano;
	private boolean logado;
	


	public Pessoa(String nome, String email, Plano plano, Boolean login) {
		super(nome);
		this.email = email;
		this.setPlano(plano);
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

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}




}


