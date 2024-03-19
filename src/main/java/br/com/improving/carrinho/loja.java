package br.com.improving.carrinho;

import java.math.BigDecimal;

public class loja {
	public static void main(String[] args) {

		Produto produto = new Produto(1L, "Produto 1");
		 Produto produto2 = new Produto(2L, "Produto 2");
		 Produto produto3 = new Produto(3L, "Produto 3");

		 CarrinhoCompras carrinho = new CarrinhoCompras();

		 carrinho.adicionarItem(produto, new BigDecimal(10), 1);
		 carrinho.adicionarItem(produto2, new BigDecimal(10), 1);
		 carrinho.adicionarItem(produto3, new BigDecimal(10), 1);

		 CarrinhoComprasFactory carrinhoFactory = new CarrinhoComprasFactory("1", carrinho);


		System.out.println(carrinhoFactory.getValorTicketMedio());



	}
}
