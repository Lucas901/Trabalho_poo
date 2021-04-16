package Controle;

import java.util.ArrayList;

import Cliente.Cliente;
import Produto.Produto;

public class Carrinho {
	protected Cliente cliente;
	private ArrayList<Produto> produtosArray = new ArrayList<Produto>();
	
	public Carrinho(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
	public ArrayList<Produto> getProdutosArray() {
		return produtosArray;
	}

	public void setProdutosArray(ArrayList<Produto> produtosArray) {
		this.produtosArray = produtosArray;
	}
	
	public void adcProduto(Produto produto) {
		produtosArray.add(produto);
	}
	
	
	public float gastoCliente(Carrinho carrinho) {
		float gasto = 0;
		for(Produto aux : carrinho.produtosArray) {
			gasto = gasto + aux.getPreco();
		}
		return gasto;
	}

}
