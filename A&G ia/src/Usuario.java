
public class Usuario {
	private String nome;
	private String email;
	private boolean plano;
	private boolean login;
	
	
	public Usuario(String nome, String email, boolean plano, boolean login) {
		super();
		this.nome = nome;
		this.email = email;
		this.setPlano(plano);
		this.setLogin(login);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void fazerLogin() {
		this.setLogin(true);
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

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}



}
