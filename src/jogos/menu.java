package jogos;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("**********************************************");
			System.out.println("                                              ");
			System.out.println("             JOGOS D. ROJAS                   ");
			System.out.println("                                              ");
			System.out.println("********************************************* ");
			System.out.println("                                              ");
			System.out.println("           1  - Criar Conta                   ");
			System.out.println("           2  - Lista de Jogos                ");
			System.out.println("           3  - Buscar jogo por Nome          ");
			System.out.println("           5  - Buscar jogo por número        ");
			System.out.println("           6  - Atualizar carrinho de Jogos   ");
			System.out.println("           7  - Pegar jogo                    ");
			System.out.println("           8  - Devolver Jogo                 ");
			System.out.println("           9  - Indicar Jogo para Amigo(s)    ");
			System.out.println("           0  - Sair                          ");
			System.out.println("**********************************************");

			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println("\nJogos D. Rojas - A sua Aventura começa aqui!");
				sobre();
				leia.close();
				System.exit(0);

			}

			switch (opcao) {
			case 1:
				System.out.println("\nCriar Conta\n\n");

				break;
			case 2:
				System.out.println("Listar todos os Jogos\n\n");

				break;
			case 3:
				System.out.println("Buscar Jogos por Nome\n\n");

				break;
			case 4:
				System.out.println("Buscar jogos por número\n\n");

				break;
			case 5:
				System.out.println("Atualizar carrinho de jogos\n\n");

				break;
			case 6:
				System.out.println("Adicionar Jogo");

				break;
			case 7:
				System.out.println("Devolver Jogo");

				break;
			case 8:
				System.out.println("Indicar Jogo para amigo");

				break;
			default:
				System.out.println("Opção inválida\n\n");
				break;
			}

		}
	}

	private static void sobre() {
		System.out.println("******************************************");
		System.out.println("Projeto Desenvolvido por:                 ");
		System.out.println("Ruth Rojas - ");
		System.out.println("Indicar Jogo para amigo");
		System.out.println("*******************************************");

	}
}
