package br.com.algoritmos.provas.prova1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {

	public static void save(Contato contato) throws SQLException {
		String sql1 = "INSERT INTO public.contato (id, nome, telefone, email) VALUES("+contato.getId()+",'"+contato.getNome()+"', '"+contato.getTelefone()+"','"+contato.getEmail()+"');";
		try(Connection conn = ConnectionFactory.getConnection()) {
			Statement smt = conn.createStatement();
			smt.executeUpdate(sql1);
		}

	}

	public static final void  buscarTodos() throws SQLException {
		String sql2 = "SELECT id, nome, telefone, email FROM public.contato;";
		try(Connection conn = ConnectionFactory.getConnection()) {
			Statement smtp = conn.createStatement();
			ResultSet rs = smtp.executeQuery(sql2);
			List<Contato> contatos = new ArrayList<>();
			while(rs.next()) {
				contatos.add(new Contato (rs.getLong("id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("email")));
			}
			ConnectionFactory.fecharConexao(conn);
		}
	}
}
