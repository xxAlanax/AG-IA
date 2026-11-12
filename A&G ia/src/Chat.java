import java.util.ArrayList;

public class Chat extends Item {
	private int qtdmensagens;
	private ArrayList<Mensagem> conversa;
	
	
	public Chat(int qtdmensagens, ArrayList<Mensagem> conversa) {
		super();
		this.setQtdmensagens(qtdmensagens);
		this.setConversa(conversa);
	}
	
	@Override
	void criar() {
		// TODO Auto-generated method stub
	}

	@Override
	void excluir() {
		// TODO Auto-generated method stub	
	}

	@Override
	void renomear() {
		// TODO Auto-generated method stub
	}
	
	void busca() {
	}
	
	void adicionarMensagem(Mensagem novaMensagem) {
		
	}

	public int getQtdmensagens() {
		return qtdmensagens;
	}

	public void setQtdmensagens(int qtdmensagens) {
		this.qtdmensagens = qtdmensagens;
	}

	public ArrayList<Mensagem> getConversa() {
		return conversa;
	}

	public void setConversa(ArrayList<Mensagem> conversa) {
		this.conversa = conversa;
	}
 
}


//Modificações
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Chat extends Item {
	private int qtdmensagens;
	private ArrayList<Mensagem> conversa;

	public Chat(String nome) {
		super(nome);
		this.conversa = new ArrayList<>();
		this.qtdmensagens = 0;
	}

	@Override
	void criar() {
		this.dataCriacao = LocalDateTime.now();
	}

	@Override
	void excluir() {
		conversa.clear();
		qtdmensagens = 0;
	}

	@Override
	void renomear(String novoNome) {
		this.nome = novoNome;
	}

	boolean busca(String palavra) {
		for (Mensagem m : conversa) {
			if (m.getConteudo().toLowerCase().contains(palavra.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	void adicionarMensagem(Mensagem novaMensagem) {
		conversa.add(novaMensagem);
		qtdmensagens = conversa.size();
	}

	public int getQtdmensagens() {
		return qtdmensagens;
	}

	public void setQtdmensagens(int qtdmensagens) {
		this.qtdmensagens = qtdmensagens;
	}

	public ArrayList<Mensagem> getConversa() {
		return conversa;
	}

	public void setConversa(ArrayList<Mensagem> conversa) {
		this.conversa = conversa;
	}
}
