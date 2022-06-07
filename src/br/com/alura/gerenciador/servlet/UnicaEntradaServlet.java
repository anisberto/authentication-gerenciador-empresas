package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametro = request.getParameter("acao");

		if (parametro.contains("listar")) {

			System.out.println("Listando Empresas");

		} else if (parametro.contains("cadastrar")) {

			System.out.println("Cadastrando Empresa");

		} else if (parametro.contains("excluir")||parametro.contains("deletar")) {

			System.out.println("Deletando Empresa");

		} else if (parametro.contains("alterar")||parametro.contains("atualizar")) {

			System.out.println("Alterando Empresa");

		} else {

			System.out.println("Opção não definida");

		}
	}

}
