package eCommerce.repository;

import eCommerce.model.Produto;

public interface ProdutoRepository {
	
	//CRUD do eCommerce
		public void procurarPorIdProduto(int idProduto);
		public void listarTodas();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void deletar(int idProduto);
}
