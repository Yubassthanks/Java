package modelo;

public class Venda {

	//ATRIBUTOS ENCAPSULADOS
	private String produto;
	private int quantidade;
	private float preco;
	
	//Método normal
	public float subTotal() {
		return quantidade * preco;
		
	}
	//Métodos de acesso Getters %% Setters
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
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

	@Override
	public String toString() {
		return String.format("%s\t%d\t%.2f\t\t%.2f", produto, quantidade, preco, subTotal());
	}
	

	
}
