package com.agenda.dao;

import com.agenda.modelo.Pessoa;

public class PessoaDAO {
	
	public void adiciona(Pessoa pessoa) {
		String SQL = "Insert into pessoas(nome, email, endereco, telefone) values(?,?,?,?)";
	}

}
