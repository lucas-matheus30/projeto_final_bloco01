package eCommerce.model;

public class Roupas extends Produto{
	
	private String tamanho;

	public Roupas(int idProduto, String nome, int categoria, int quantidade, float preco, String tamanho) {
		super(idProduto, nome, categoria, quantidade, preco);
		this.tamanho = tamanho;
	
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho da Roupa: " + this.tamanho);
		}
}
