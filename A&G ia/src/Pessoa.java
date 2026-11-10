
public class Pessoa extends Usuario {
	private String email;
	private String senha;
	private Plano plano;
	private boolean logado;
	
	public Pessoa() {
		super();
	};

	public Pessoa(String nome, String email, String senha, Plano plano, boolean login) {
		super(nome);
		this.email = email;
		this.senha = senha;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}




}


