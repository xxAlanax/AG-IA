import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Pessoa> usuarios = new ArrayList<>();
	static Plano gratuito = new Plano("Gratuito", 0.0, 50, 5);
	
	public static void criarConta() {

	    System.out.println("\n====== CRIAR CONTA ======");

	    System.out.print("Nome: ");
	    String nome = teclado.nextLine();

	    System.out.print("Email: ");
	    String email = teclado.nextLine();

	    for (Pessoa p : usuarios) {
	        if (p.getEmail().equalsIgnoreCase(email)) {
	            System.out.println("Email já cadastrado!");
	            return;
	        }
	    }
	    
	    System.out.print("Senha: ");
	    String senha = teclado.nextLine();

	    Pessoa novaPessoa = new Pessoa( nome, email, senha, gratuito, false);

	    usuarios.add(novaPessoa);

	    System.out.println("Conta criada");
	}
	
	public static void fazerLogin() {

	    System.out.println("\n====== LOGIN ======");

	    System.out.print("Email: ");
	    String email = teclado.nextLine();

	    System.out.print("Senha: ");
	    String senha = teclado.nextLine();

	    for (Pessoa p : usuarios) {

	        if (p.getEmail().equalsIgnoreCase(email)
	            && p.getSenha().equals(senha)) {

	            p.fazerLogin();

	            System.out.println("Login realizado!");
	            menuPrincipal(p);
	            return;
	        }
	    }

	    System.out.println("Email ou senha incorretos");
	}
	
	public static void menuPrincipal(Pessoa usuario) {
		
		 int opcao;
		 do {
	            System.out.println("\n========== A&G IA ==========");
	            System.out.println("Bem-vindo, " + usuario.getNome());

	            System.out.println("\n1 - Conversar com a IA");
	            System.out.println("2 - Gerenciar chats");
	            System.out.println("3 - Gerenciar projetos");
	            System.out.println("4 - Pesquisar conversas");
	            System.out.println("5 - Gerar imagem");
	            System.out.println("6 - Consultar plano");
	            System.out.println("7 - Fazer logout");
	            System.out.println("0 - Encerrar programa");

	            System.out.print("\nEscolha uma opção: ");
	            opcao = teclado.nextInt();
	            teclado.nextLine();
	           

	        } while (opcao != 0 && usuario.isLogado());
	    }

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n========== A&G IA ==========");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Fazer login");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha uma opção:");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				criarConta();
				
			}else if (opcao == 2) {
				fazerLogin();
				
			}else if (opcao == 0) {
				System.out.println("Saindo!");
				
			}else {
				System.out.print("Opção inválida!");
			}	
			
		} while (opcao != 0);
	}
}

// Modificações
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Pessoa> usuarios = new ArrayList<>();
	static Plano gratuito = new Plano("Gratuito", 0.0, 50, 5);
	
	public static void criarConta() {

	    System.out.println("\n====== CRIAR CONTA ======");

	    System.out.print("Nome: ");
	    String nome = teclado.nextLine();

	    System.out.print("Email: ");
	    String email = teclado.nextLine();

	    for (Pessoa p : usuarios) {
	        if (p.getEmail().equalsIgnoreCase(email)) {
	            System.out.println("Email já cadastrado!");
	            return;
	        }
	    }
	    
	    System.out.print("Senha: ");
	    String senha = teclado.nextLine();

	    Pessoa novaPessoa = new Pessoa( nome, email, senha, gratuito, false);

	    usuarios.add(novaPessoa);

	    System.out.println("Conta criada");
	}
	
	public static void fazerLogin() {

	    System.out.println("\n====== LOGIN ======");

	    System.out.print("Email: ");
	    String email = teclado.nextLine();

	    System.out.print("Senha: ");
	    String senha = teclado.nextLine();

	    for (Pessoa p : usuarios) {

	        if (p.getEmail().equalsIgnoreCase(email)
	            && p.getSenha().equals(senha)) {

	            p.fazerLogin();

	            System.out.println("Login realizado!");
	            menuPrincipal(p);
	            return;
	        }
	    }

	    System.out.println("Email ou senha incorretos");
	}
	
	public static void menuPrincipal(Pessoa usuario) {
		
		 int opcao;
		 do {
	            System.out.println("\n========== A&G IA ==========");
	            System.out.println("Bem-vindo, " + usuario.getNome());

	            System.out.println("\n1 - Conversar com a IA");
	            System.out.println("2 - Gerenciar chats");
	            System.out.println("3 - Gerenciar projetos");
	            System.out.println("4 - Pesquisar conversas");
	            System.out.println("5 - Gerar imagem");
	            System.out.println("6 - Consultar plano");
	            System.out.println("7 - Fazer logout");
	            System.out.println("0 - Encerrar programa");

	            System.out.print("\nEscolha uma opção: ");
	            opcao = teclado.nextInt();
	            teclado.nextLine();
	           

	        } while (opcao != 0 && usuario.isLogado());
	    }

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n========== A&G IA ==========");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Fazer login");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha uma opção:");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				criarConta();
				
			}else if (opcao == 2) {
				fazerLogin();
				
			}else if (opcao == 0) {
				System.out.println("Saindo!");
				
			}else {
				System.out.print("Opção inválida!");
			}	
			
		} while (opcao != 0);
	}
}
