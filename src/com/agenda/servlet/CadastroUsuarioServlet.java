package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelo.Pessoa;
import com.agenda.service.CadastroUsuarioService;


public class CadastroUsuarioServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("name"));
		pessoa.setPhone(request.getParameter("phone"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setEnd(request.getParameter("end"));
		
		
		CadastroUsuarioService service = new  CadastroUsuarioService();
		
		service.cadastra(pessoa);
	}
}
