package eCommerce.controller;

import java.util.ArrayList;
import eCommerce.model.Produto;
import eCommerce.repository.ProdutoRepository;

public class eCommerceController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int idProduto = 0;
	
	@Override
	public void procurarPorIdProduto(int idProduto) {
		var produto = buscarNaCollection(idProduto);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto ID: " + idProduto + " não foi encontrado!");
		
	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto ID: " + produto.getIdProduto() + " foi inserido com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getIdProduto());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO Produto ID: " + produto.getIdProduto() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO Produto ID: " + produto.getIdProduto() + " não foi encontrado");
		
	}

	@Override
	public void deletar(int idProduto) {
		var produto = buscarNaCollection(idProduto);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO Produto ID: " + idProduto + " foi deletado com sucesso!");
		} else
			System.out.println("\nO Produto ID: " + idProduto + " não foi encontrado!");
		
	}
	public int gerarId() {
		return ++ idProduto;	
		 
	}
	
	public Produto buscarNaCollection(int idProduto) {
		for (var produto : listaProdutos) {
			if (produto.getIdProduto() == idProduto) {
				return produto;
			}
		}

		return null;
	}

}
