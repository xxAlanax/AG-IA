import java.util.ArrayList;

public class Projeto extends itens{
	private ArrayList<Chat> chatsProjeto;

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

	public ArrayList<Chat> getChatProjeto() {
		return chatsProjeto;
	}

	public void setChatProjeto(ArrayList<Chat> chatsProjeto) {
		this.chatsProjeto = chatsProjeto;
	}
	
	public void adicionarChat(Chat novoChat) {
	}
	
	public void removerChat(Chat chat) {
	}
	

	public  ArrayList<Chat> listarChats() {
		return this.chatsProjeto;
	}


}
