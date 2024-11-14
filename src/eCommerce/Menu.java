package eCommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import eCommerce.util.Cores;
import eCommerce.model.Eletronicos;
import eCommerce.model.Roupas;
import eCommerce.controller.eCommerceController;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		eCommerceController produtos = new eCommerceController();

		int idProduto, categoria, quantidade;
		String nome, tamanho;
		float preco, voltagem;

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("                    VOLTSORE                         ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produtos                   ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produtos                      ");
			System.out.println("            4 - Atualizar os Produtos                ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println(Cores.TEXT_GREEN_BOLD + "\nVoltStore - Conecte-se ao futuro, hoje!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_GREEN_BOLD + "Cadastrar Produtos\n\n");

				
				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				do {
					System.out.println("Digite a Categoria do Produto: (1) Eletronico - (2) Roupas ");
					categoria = leia.nextInt();
				} while (categoria < 1 && categoria > 2);

				System.out.println("Digite a Quantidade do Produto: ");
				quantidade = leia.nextInt();

				System.out.println("Digite o Preço do Produto: ");
				preco = leia.nextFloat();

				switch (categoria) {
				case 1 -> {
					System.out.println("Digite a Voltagem do Eletronico: ");
					voltagem = leia.nextFloat();
					produtos.cadastrar(new Eletronicos(produtos.gerarId(), nome, categoria, quantidade, preco, voltagem));
				}
				case 2 -> {
					System.out.println("Digite o Tamanho da Roupa: ");
					leia.skip("\\R?");
					tamanho = leia.nextLine();
					produtos.cadastrar(new Roupas(produtos.gerarId(), nome, categoria, quantidade, preco, tamanho));
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_GREEN_BOLD + "Listar todos os Produtos\n\n");
				produtos.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_GREEN_BOLD + "Buscar Produtos\n\n");

				System.out.println("Digite o ID do produto: ");
				idProduto = leia.nextInt();
				produtos.procurarPorIdProduto(idProduto);

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_GREEN_BOLD + "Atualizar os Produtos\n\n");

				System.out.println("Digite o ID do produto: ");
				idProduto = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(idProduto);

				if (buscaProduto != null) {
					
					categoria = buscaProduto.getCategoria();

					System.out.println("Digite o Nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println("Digite a Quantidade do Produto: ");
					quantidade = leia.nextInt();

					System.out.println("Digite o Preço do Produto: ");
					preco = leia.nextFloat();
					
					switch (categoria) {
					case 1 -> {
						System.out.println("Digite a Voltagem do Eletronico: ");
						voltagem = leia.nextFloat();

						produtos.atualizar(new Eletronicos(idProduto, nome, categoria, quantidade, preco, voltagem));
					}
					case 2 -> {
						System.out.println("Digite o Tamanho da Roupa: ");
						tamanho = leia.nextLine();

						produtos.atualizar(new Roupas(idProduto, nome, categoria, quantidade, preco, tamanho));
					}
					default -> {
						System.out.println("Categoria Invalida!");
					}
					}
				} else {
					System.out.println("O ID do Produto não foi encontrado!");
				}
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_GREEN_BOLD + "Apagar Produto\n\n");
				
				System.out.println("Digite o ID do produto: ");
				idProduto = leia.nextInt();
				
				produtos.deletar(idProduto);
				
				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");

				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Final do Bloco 01 - Deselvolvido por: ");
		System.out.println("Lucas Matheus - lucasmatheusdev@outlook.com");
		System.out.println("github.com/lucas-matheus30");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}