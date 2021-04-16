package Produto;

public class Livro extends Produto{
	
	private String autor;
	private int numPaginas;
	
	
	
	public Livro(Object codigo, String nome, String descricao, float preco, String autor, int numPaginas) {
		super(codigo,nome,descricao,preco);
		this.autor = autor;
		this.numPaginas = numPaginas;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
}
