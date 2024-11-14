package eCommerce.model;

public class Eletronicos extends Produto{
	
	private float voltagem;

	public Eletronicos(int idProduto, String nome, int quantidade, float preco, float voltagem) {
		super(idProduto, nome, quantidade, preco);
		this.voltagem = voltagem;
		
	}

	public float getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
		
	}
@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Voltagem do eletrônico: " + this.voltagem);
		
		}

}

