package Controle;

import java.util.ArrayList;

public class BancoDeDados {
	private static ArrayList<Carrinho> bd = new ArrayList<Carrinho>();
	
	public BancoDeDados() {
		
	}

	public static ArrayList<Carrinho> getBd() {
		return bd;
	}
	
	
	public void adcCarrinho(Carrinho carrinho) {
		bd.add(carrinho);
	}

	
	public void mostraBD() {
		for(Carrinho carrinho : bd) {
			System.out.printf("O cliente %s gastou %f reais", carrinho.cliente.getNome(), carrinho.gastoCliente(carrinho));
			
		}
	}
}
