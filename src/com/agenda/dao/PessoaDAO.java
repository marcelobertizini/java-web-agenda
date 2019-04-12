package com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.agenda.modelo.Pessoa;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;

public class PessoaDAO {
	
	private Connection connection;
	
	public void recebe(Pessoa pessoa) {
		String SQL = "Insert into pessoas(nome, email, endereco, telefone) values(?,?,?,?)";
	
	try {
		this.connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = this.connection.prepareStatement(SQL);
		
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getEmail());
		stmt.setString(3, pessoa.getPhone());
		stmt.setString(4, pessoa.getEnd());
	
		stmt.execute();
		stmt.close();
		
	}catch (SQLException e) {
		throw new RuntimeException(e);
		
	}
	
	
	}

}
