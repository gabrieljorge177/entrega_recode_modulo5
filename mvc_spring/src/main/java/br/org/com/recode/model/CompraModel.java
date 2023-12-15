package br.org.com.recode.model;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "compra")
public class CompraModel {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_compra;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private  LocalDate data_compra;
	private String metodo_pagamento;
	private double total_compra;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private ClienteModel c1;
	
	@ManyToOne
	@JoinColumn(name = "passagem_id")
	private PassagemModel p1;
	
	public CompraModel() {
	}
	
	
	public CompraModel( long id_compra, LocalDate data_compra, ClienteModel c1, PassagemModel p1,String metodo_pagamento) {
		this.id_compra = id_compra;
		this.data_compra = data_compra;
		this.c1 = c1;
		this.p1 = p1;
		this.metodo_pagamento = metodo_pagamento;
		this.total_compra = valorFinalViagem(p1.getPreco(), metodo_pagamento);
	}

	public CompraModel(LocalDate data_compra, ClienteModel c1, PassagemModel p1, String metodo_pagamento) {
		this.data_compra = data_compra;
		this.c1 = c1;
		this.p1 = p1;
		this.metodo_pagamento = metodo_pagamento;
		this.total_compra = valorFinalViagem(p1.getPreco(), metodo_pagamento);
	}


	public long getId_compra() {
		return id_compra;
	}


	public void setId_compra(long id_compra) {
		this.id_compra = id_compra;
	}
	
	
	public LocalDate getData_compra() {
		return data_compra;
	}

	public void setData_compra(LocalDate data_compra) {
		this.data_compra = data_compra;
	}
	

	public double getTotal_compra() {
		return total_compra;
	}

	public void setTotal_compra(double total_compra) {
		this.total_compra = total_compra;
	}

	public ClienteModel getC1() {
		return c1;
	}

	public void setC1(ClienteModel c1) {
		this.c1 = c1;
	}

	public PassagemModel getP1() {
		return p1;
	}

	public void setP1(PassagemModel p1) {
		this.p1 = p1;
	}
	
	public String getMetodo_pagamento() {
		return metodo_pagamento;
	}

	public void setMetodo_pagamento(String metodo_pagamento) {
		this.metodo_pagamento = metodo_pagamento;
	}
	
	public double valorFinalViagem(Double preco, String metodo_pagamento) {
	    if ("dinheiro".equalsIgnoreCase(metodo_pagamento)) {
	        this.total_compra = preco * 0.85;
	    } else {
	        this.total_compra = preco;
	    }
	    return this.total_compra;
	}
	
	 

	@Override
	public String toString() {
		return "CompraModel [data_compra=" + data_compra + ", id_compra=" + id_compra + ", metodo_pagamento="
				+ metodo_pagamento + ", total_compra=" + total_compra + ", c1=" + c1 + ", p1=" + p1 + "]";
	}


	
	
	
	
	

}
