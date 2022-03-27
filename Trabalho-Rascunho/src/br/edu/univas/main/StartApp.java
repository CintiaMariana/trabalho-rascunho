package br.edu.univas.main;
import java.util.ArrayList;
//import java.util.Random;
import java.util.Scanner;
import br.edu.univas.vo.Player;
import br.edu.univas.vo.Titulo;

public class StartApp {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String [] args) {
		ArrayList<Player> playerList = new ArrayList<>();
		ArrayList<Titulo> tituloList = new ArrayList<>();
		
		int opcao = 0;
		
		do {
			menu();
			opcao = readInteger(scanner);
			
			if (opcao == 1) {
				cadastroPlayer(playerList);
			}
			else if (opcao == 2) {
				cadastroTitulo(tituloList);	
			} 
			else if (opcao ==3 ) {
				
			}	
			else if (opcao == 4) {
				
				
				}
			else if (opcao == 5) {
				System.out.println("Até mais !!");
			} else {
				System.out.println("Opção inválida, tente novamente");
			}
		} while (opcao != 5);
		
	}
	
	public static int readInteger(Scanner scanner) {
		int result = scanner.nextInt();
		scanner.nextLine();
		return result;
	}
	
	public static void menu() {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Cadastrar Player");
		System.out.println("2 - Cadastrar Título");
		System.out.println("3 - Recomendação Aleatória");
		System.out.println("4 - Recomendação por Gênero");
		System.out.println("5 - Sair");
	}
	
	public static void cadastroPlayer (ArrayList<Player> players) {
		Player player = new Player();
		
		System.out.println("--- Cadastro de Player ---");
		System.out.println("Digite o nome do Player: ");
		player.setNome(scanner.nextLine());
		System.out.println("Digite o site do Player: ");
		player.setSite(scanner.nextLine());
		
		players.add(player);
		
	}
	
	public static void cadastroTitulo (ArrayList<Titulo> titulos) {
		Titulo titulo = new Titulo();
		
		System.out.println("--- Cadastro de Título ---");
		System.out.println("O Título é um Filme ou Série ? ");
		titulo.setTipo(scanner.nextLine());
		System.out.println("Qual o nome do Título ?");
		titulo.setTipo(scanner.nextLine());
		System.out.println("Digite o Elenco do Título: ");
		titulo.setElenco(scanner.nextLine());
		System.out.println("Faça uma breve Descrição do Título: ");
		titulo.setDescricao(scanner.nextLine());
		System.out.println("Digite o Gênero do Título: ");
		titulo.setGenero(scanner.nextLine());
		System.out.println("Digite o nome do Diretor do Título: ");
		titulo.setDiretor(scanner.nextLine());
		System.out.println("Digite a classificação etária do Título: ");
		titulo.setClassificacaoEtaria(scanner.nextLine());
		
		titulos.add(titulo);
	}
			
	}


