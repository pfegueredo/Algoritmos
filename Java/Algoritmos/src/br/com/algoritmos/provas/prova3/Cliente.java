package br.com.algoritmos.provas.prova3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.algoritmos.provas.prova3.InfoCliente.ClienteRepository;

public class Cliente {

	public static void main(String[] args) {
		
		
		
		String nome;
		String telefone;
		String dataNascimento;
		
		//ConexaoFactory conexaoFactory = new ConexaoFactory();
		Connection connection = ConexaoFactory.getConnection();
		ConexaoFactory.closeConnection(connection);
		
		System.out.print("Digite o nome do usuario: ");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		
		System.out.print("Digite o telefone: ");
		telefone = sc.nextLine();
		
		System.out.print("Digite a data de nascimento: ");
		dataNascimento = sc.nextLine();
		
		
		InfoCliente infoCliente = new InfoCliente(nome, telefone, dataNascimento);
		
		ClienteRepository.salvar(infoCliente);
		try {
			List<InfoCliente> lista = new ArrayList<>();
			lista = ClienteRepository.buscarTodos();
			for (InfoCliente infoCliente2 : lista) {
				System.out.println(infoCliente2.getNome()+ " - " + infoCliente2.getTelefone() + " - " + infoCliente.getDataNascimento());
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}


class InfoCliente {
	private String nome;
	private String telefone;
	private String dataNascimento;
	
	public InfoCliente(String nome, String telefone, String dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString(){
		return this.nome + this.telefone + this.dataNascimento;
	}
	
	public static class ClienteRepository {
		
		public static void salvar(InfoCliente infoCliente) {
			String sql = "INSERT INTO contato(nome, telefone, datanascimento) values ('"+infoCliente.getNome()+"','"+infoCliente.getTelefone()+"','"+infoCliente.getDataNascimento()+"');";
			try {
				Connection conn = ConexaoFactory.getConnection();
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		public static List<InfoCliente> buscarTodos() throws SQLException {
			String sql2 = "select nome, telefone, datanascimento from contato;";
			
			try (Connection conn = ConexaoFactory.getConnection()) {
				
				Statement smtt = conn.createStatement();
				ResultSet rst = smtt.executeQuery(sql2);
				
				List<InfoCliente> lista = new ArrayList<>();
				while(rst.next()) {
					lista.add(new InfoCliente (rst.getString("nome"), rst.getString("telefone"), rst.getString("datanascimento")));
				}
				ConexaoFactory.closeConnection(conn);
				return lista;
			}
		}
		
	}
}
