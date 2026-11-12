import java.util.ArrayList;

public class Projeto extends Item{
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


	// Modificações
	import java.util.ArrayList;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Projeto extends Item {
	private ArrayList<Chat> chats;

	public Projeto(String nome) {
		super(nome);
		this.chats = new ArrayList<>();
	}

	@Override
	void criar() {
		this.dataCriacao = LocalDateTime.now();
	}

	@Override
	void excluir() {
		chats.clear();
	}

	@Override
	void renomear(String novoNome) {
		this.nome = novoNome;
	}

	void adicionarChat(Chat chat) {
		if (!chats.contains(chat)) {
			chats.add(chat);
		}
	}

	void removerChat(Chat chat) {
		chats.remove(chat);
	}

	ArrayList<Chat> listarChats() {
		return chats;
	}
}


}
