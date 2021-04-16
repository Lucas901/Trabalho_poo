package Produto;

public class Produto {
	
	//checar se é protected ou private que deve usar
	protected Object codigo;
	protected String nome;
	protected String descricao;
	protected float preco;
	
	public Produto(Object codigo, String nome, String descricao, float preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Object getCodigo() {
		return codigo;
	}

	public void setCodigo(Object codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	

}
