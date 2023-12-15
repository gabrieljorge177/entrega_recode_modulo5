package br.org.com.recode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cliente;
	private long cpf;
	private long idade;
	private long acompanhantes;
	private String nome;
	private String email;
	private String senha;
	public ClienteModel() {
	}

	public ClienteModel(long cpf, long idade, long acompanhantes, String nome, String email, String senha) {
		this.cpf = cpf;
		this.idade = idade;
		this.acompanhantes = acompanhantes;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public ClienteModel(long id_cliente, long cpf, long idade, long acompanhantes, String nome, String email, String senha) {
		this.id_cliente = id_cliente;
		this.cpf = cpf;
		this.idade = idade;
		this.acompanhantes = acompanhantes;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}

	public long getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhantes(long acompanhantes) {
		this.acompanhantes = acompanhantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "ClienteModel [id_cliente=" + id_cliente + ", cpf=" + cpf + ", idade=" + idade + ", acompanhantes="
				+ acompanhantes + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

	
	
}
	
	