package Main;


import java.util.Scanner;

import Cliente.Cliente;
import Produto.Produto;
import Produto.DVD;
import Produto.Livro;
import Controle.BancoDeDados;
import Controle.Carrinho;

public class Main { 
	
	
	
	public static void main(String[] args) {
		boolean estadoMenu =  true;
		BancoDeDados bd = new BancoDeDados();
		Scanner sc = new Scanner(System.in);
		
		//Menu
		while(estadoMenu) {
			Carrinho carrinho = null;
			System.out.println("digite os números das operações desejadas:");
			System.out.printf("\n");
			System.out.printf("Você deseja adicionar mais um cliente?\n");
			
			System.out.println("1-Sim");
			System.out.println("2-Não");
			int num = sc.nextInt();
			if(num==2) {
				System.out.println("Fim do registro de clientes");
				System.out.println("fim do programa");
				estadoMenu = false;
				break;
				
			}else if(num == 1) {
				System.out.printf("Digite o nome do cliente: ");
				String nome = sc.next();
				System.out.printf("\nDigite o cpf do cliente:");
				String cpf = sc.next();
				
				Cliente cliente = new Cliente(nome, cpf);
				carrinho = new Carrinho(cliente);
				boolean estadoAdcProdutos = true;
				System.out.printf("\nDeseja adicionar um produto ao cliente %s?\n", cliente.getNome());
				System.out.println("1-Sim");
				System.out.println("2-Não");
				num = sc.nextInt();
				if (num ==2){
					estadoAdcProdutos = false;
					estadoMenu = false;
					System.out.printf("Nenhum produto foi adicionado ao cliente %s\n", cliente.getNome());
					System.out.println("fim do programa");
					break;
					
				}
				if(num==1) {
					while(estadoAdcProdutos) {
						Produto produto;
						System.out.println("digite o codigo do produto");
						Object codigo =sc.next();
						
						System.out.printf("%s", codigo);
						System.out.printf("\n");
						System.out.printf("\n");
						System.out.printf("digite nome do produto: ");
						nome = sc.next();
						System.out.printf("\ndigite descricao do produto: ");
						String descricao = sc.next();
						System.out.printf("\ndigite o preco do produto: ");
						System.out.println();
						float preco = sc.nextFloat();
						
						
						System.out.printf("Digite o tipo do produto que deseja adicionar:\n");
						System.out.println("1-Livro");
						System.out.println("2-DVD");
						num = sc.nextInt();
						
						if(num == 1) {
							System.out.printf("digite o nome do autor: ");
							String nomeAutor = sc.next();
							System.out.printf("digite o numero de páginas no livro: ");
							int numPaginas = sc.nextInt();
							System.out.println();
							
							produto = new Livro(codigo,nome,descricao,preco,nomeAutor,numPaginas);
							carrinho.adcProduto(produto);
							
						}
						else if(num == 2) {
							System.out.printf("Digite o nome da banda: ");
							String nomeBanda = sc.next();
							System.out.printf("\nDigite o tempo total do DVD: ");
							int tempo = sc.nextInt();
							System.out.println();
							
							produto = new DVD(codigo,nome,descricao,preco,nomeBanda,tempo);
							carrinho.adcProduto(produto);
							
						}
						System.out.printf("Deseja adicionar mais um produto ao cliente %s?\n", cliente.getNome());
						System.out.println("1-Sim");
						System.out.println("2-Não");
						num = sc.nextInt();
						if(num==2) {
							estadoAdcProdutos = false;
						}
			
					}
				}
				else{
					System.out.printf("número inválido, nenhum produto foi adicionado ao cliente %s\n", cliente.getNome());
				}
				
				
				
				
				
			}else {
				
				System.out.println("Número inválido, favor digitar um número válido\n");
			}
			
			
			bd.adcCarrinho(carrinho);
			
		}
		sc.close();
		bd.mostraBD();

	}

}
