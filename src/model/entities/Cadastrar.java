package model.entities;

import model.exceptions.DomainException;

public class Cadastrar {
	
	private String nomeCompleto;
	private String ddd;
	private String telefone;

	public Cadastrar() {
	}
	
	public Cadastrar(String nomeCompleto, String ddd, String telefone) {
		this.nomeCompleto = nomeCompleto;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public static String Cadastro(String nomeCompleto, String ddd, String telefone)  throws DomainException{
		if(ddd.isEmpty() || ddd == null) 
			throw new DomainException("DDD não preenchido\n");
		else if(telefone.isEmpty() || telefone == null) 
			throw new DomainException("Telefone não preenchido\n");
		else if(nomeCompleto.isEmpty() || nomeCompleto == null) 
			throw new DomainException("Nome não informado\n");
		else 
			return "Cadastro concluído";
	}
	
	
}
