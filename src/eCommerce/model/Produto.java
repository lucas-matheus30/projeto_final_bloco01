package eCommerce.model;

public abstract class Produto {
	private int idProduto;
	private String nome;
	private int quantidade;
	private float preco;
	
	
	public Produto(int idProduto, String nome, int quantidade, float preco) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("\n\n-------------------------------------------------------------");
		System.out.println("Dados do Produto:");
		System.out.println("------------------------------------------------------------");
		System.out.println("ID do Produto: " + this.idProduto);
		System.out.println("Nome: " + this.nome);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Preço: " + this.preco);
	
	}
}
