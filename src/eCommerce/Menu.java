package eCommerce;

import java.util.Scanner;
import eCommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
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

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_GREEN_BOLD +"\nVoltStore - Conecte-se ao futuro, hoje!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_GREEN_BOLD + "Cadastrar Produtos\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_GREEN_BOLD + "Listar todos os Produtos\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_GREEN_BOLD + "Buscar Produtos\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_GREEN_BOLD + "Atualizar os Produtos\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_GREEN_BOLD + "Apagar Produto\n\n");

					break;
			
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
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
}