package br.org.com.recode.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passagem")
public class PassagemModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_passagem;
	private String cidade;
	private String data_passagem;
	private Double preco;
	private String categoria;
	
	
	
	public PassagemModel() {
	
	}
	

	public PassagemModel(long id_passagem, String cidade, String data_passagem, Double preco, String categoria) {
		this.id_passagem = id_passagem;
		this.cidade = cidade;
		this.data_passagem = data_passagem;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public PassagemModel(String cidade, String data_passagem, Double preco, String categoria) {
		this.cidade = cidade;
		this.data_passagem = data_passagem;
		this.preco = preco;
		this.categoria = categoria;
	}


	public long getId_passagem() {
		return id_passagem;
	}
	public void setId_passagem(long id_passagem) {
		this.id_passagem = id_passagem;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getData_passagem() {
		return data_passagem;
	}


	public void setData_passagem(String data_passagem) {
		this.data_passagem = data_passagem;
	}


	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "PassagemModel [id_passagem=" + id_passagem + ", cidade=" + cidade + ", data_passagem=" + data_passagem
				+ ", preço=" + preco + ", categoria=" + categoria + "]";
	}
	
	

	
	
}