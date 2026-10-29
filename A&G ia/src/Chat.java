import java.util.ArrayList;

public class Chat extends itens {
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
