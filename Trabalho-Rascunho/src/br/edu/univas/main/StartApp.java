package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.Player;
import br.edu.univas.vo.Titulo;

public class StartApp {
	
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		ArrayList<Titulo> tituloList = new ArrayList<>();
		ArrayList<Player> playerList = new ArrayList<>();
		
		int opcao = 0;
		int contador = 0;
		
		do {	
		printMainMenu();
		opcao = readInteger((scanner));
		if(opcao == 1) {
			createPlayer(playerList);
		}
		else if(opcao == 2) {
			createTitle(tituloList, playerList);
			contador++;	
		}
		else if(opcao == 3) {
			randomTitle(tituloList, contador);
		}
		else if(opcao == 4) {
			searchForTitle(tituloList, contador);
		}
		else if (opcao == 9) {
			System.out.println("Até mais !!");
		} else {
			System.out.println("Opção inválida, tente novamente");
		}
		
		for (int i = 0; i < playerList.size(); i++) {
			System.out.println(playerList.get(i).getNome());
			System.out.println(playerList.get(i).getUrl());
			
		}
		}
		while(opcao != 9);
		
		
	}
	
	public static void printMainMenu() {
		System.out.println("Escolha uma das opções");
		System.out.println("1: Cadastro de Player");
		System.out.println("2: Cadastro de Título");
		System.out.println("3: Recomendar Filme ou Série Aleatório");
		System.out.println("4: Recomendar Filme ou Série por escolha");
		System.out.println("9: Sair");
	}
	
	public static int readInteger(Scanner scanner) {
		int a = scanner.nextInt();
		scanner.nextLine();
		return a;
	}
	
	public static void createPlayer(ArrayList<Player> players) {
		Player player = new Player();
		
		System.out.println("--- Cadastro de Player ---");
		System.out.println("Digite o nome do Player: ");
		player.setNome(scanner.nextLine());
		
		System.out.println("Digite a URL do Player: ");
		player.setUrl(scanner.nextLine());
		
		players.add(player);
		
		
	}
	
	public static void createTitle(ArrayList<Titulo> titulos, ArrayList<Player> plataformas) {
		Titulo titulo = new Titulo();
		Player plataforma = new Player();
		
		
		System.out.println("--- Cadastro de Título ---");
		System.out.println("O Título é um Filme ou Série ?");
		titulo.setTipo(scanner.nextLine());
		
		System.out.println("Qual o nome do Título ?");
		titulo.setTitulo(scanner.nextLine());
		
		System.out.println("Digite o Elenco do Título: ");
		titulo.setElenco(scanner.nextLine());
		
		System.out.println("Digite a Descrição do Título: ");
		titulo.setDescricao(scanner.nextLine());
		
		System.out.println("Digite o Gênero: ");
		titulo.setGenero(scanner.nextLine());
		
		System.out.println("Digite o nome do diretor: ");
		titulo.setDiretor(scanner.nextLine());
		
		System.out.println("Digite a classificação: ");
		titulo.setClassificacao(readInteger(scanner));
				
		int opcao = 0;
		
		
		do {
			System.out.println("Digite em qual plataforma está seu título::");
			plataforma.setUrl(scanner.nextLine());
			System.out.println("Digite a URL da plataforma que está seu título:");
			plataforma.setUrl(scanner.nextLine());
			
			verificaPlayer(plataformas);
			
		
			System.out.println("Deseja cadastrar outra plataforma ? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			opcao = readInteger((scanner));
			
			
		} while (opcao != 2);
		
		
		titulos.add(titulo);
	}
	
	public static void verificaPlayer(ArrayList<Player> plataformas) {
		Player plataforma = null;
		for (int i = 0; i < plataformas.size();i++) {
			plataforma = plataformas.get(0);
			if (plataformas.contains(plataforma)) {
			plataforma = plataformas.get(i);	
			}
			else {
			System.out.println("Nova Plataforma cadastrada");
			plataformas.add(plataforma);
			}
			}
	}
	

	public static void randomTitle(ArrayList<Titulo> titlee, int contador) {
		if(titlee.size() > 0) {
			int a = (int)Math.floor(Math.random()*(contador-0));
			System.out.println("\nTipo: "+ titlee.get(a).getTipo());
			System.out.println("Titulo: "+ titlee.get(a).getTitulo());
			System.out.println("Elenco: "+ titlee.get(a).getElenco());
			System.out.println("Descrição: "+ titlee.get(a).getDescricao());
			System.out.println("Gênero: "+ titlee.get(a).getGenero());
			System.out.println("Diretor: "+ titlee.get(a).getDiretor());
			System.out.println("Classificação: "+ titlee.get(a).getClassificacao());	
			System.out.println("Nome da plataforma: ");
			System.out.println("Url da plataforma: ");
		}
		else {
			System.out.println("\nNenhum titulo foi adicionado!\n");
		}
	}
	
	public static void searchForTitle(ArrayList<Titulo> titlee, int contador) {
		boolean find = false;
		
		System.out.println("Digite por qual procurar: ");
		String a = scanner.nextLine();
		for(int i = 0; i < contador; i++) {
			if(titlee.get(i).getTitulo().equals(a) ||
				titlee.get(i).getGenero().equals(a) || 
				titlee.get(i).getTipo().equals(a) ||
				titlee.get(i).getPlataforma().get(i).getNome().equals(a) ||
				titlee.get(i).getPlataforma().get(i).getUrl().equals(a)
				) {
				find = true;
				System.out.println("\nTipo: "+ titlee.get(i).getTipo());
				System.out.println("Titulo: "+ titlee.get(i).getTitulo());
				System.out.println("Elenco: "+ titlee.get(i).getElenco());
				System.out.println("Descrição: "+ titlee.get(i).getDescricao());
				System.out.println("Gênero: "+ titlee.get(i).getGenero());
				System.out.println("Diretor: "+ titlee.get(i).getDiretor());
				System.out.println("Classificação: "+ titlee.get(i).getClassificacao());	
				System.out.println("Nome da plataforma: "+ titlee.get(i).getPlataforma().get(i).getNome());
				System.out.println("Url da plataforma: "+ titlee.get(i).getPlataforma().get(i).getUrl() +"\n");
			}
		}
		
		if(find == false) {
			System.out.println("\nGênero não encontrado\n");
		}
	}
	

}
