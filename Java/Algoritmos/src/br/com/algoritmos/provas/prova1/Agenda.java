package br.com.algoritmos.provas.prova1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	private static ConnectionFactory conexao;
	
	public static void main(String[] args) throws SQLException {

//		ConnectionFactory conexao = new ConnectionFactory();
		conexao.getConnection();

		List<Contato> contatos = new ArrayList<>();
		int opcao = 3;

		while (opcao != 0) {
			menu();
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();	

			if(opcao == 1) {
				//listarContatos(contatos);
				ContatoRepository.buscarTodos();
			} else if (opcao == 2) {
				contatos.add(cadastrarContato());
			} else if (opcao == 3) {
				try {
					exportarLista(contatos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else if (opcao == 0) {
				System.exit(0);

			} else {
				System.out.println("Nenhuma opção válida foi digitada!");
			}
		}



	}

	static void menu() {
		System.out.println("AGENDA DE CONTATOS \n");
		System.out.println("Escolha uma função: ");

		System.out.println("1 - Listar contatos ");
		System.out.println("2 - Cadastrar contato ");
		System.out.println("3 - Exporta agenda para texto ");
		System.out.println("0 - Sair do sistema ");



	}

	static void listarContatos(List<Contato> contatos) {
		for(Contato contato: contatos) {
			System.out.println(contato.toString());
		}
	}

	static Contato cadastrarContato() throws SQLException {

		System.out.println("Digite o id: ");
		Scanner entrada1 = new Scanner(System.in);
		Long id = entrada1.nextLong();

		System.out.println("Digite o Nome: ");
		Scanner entrada2 = new Scanner(System.in);
		String nome = entrada2.nextLine();

		System.out.println("Digite o Telefone: ");
		Scanner entrada3 = new Scanner(System.in);
		String telefone = entrada3.nextLine();

		System.out.println("Digite o Email: ");
		Scanner entrada4 = new Scanner(System.in);
		String email = entrada4.nextLine();

		//entrada1.close(); entrada2.close(); entrada3.close(); entrada4.close();
		Connection conexao = ConnectionFactory.getConnection();
		ConnectionFactory.fecharConexao(conexao);


		Contato contato = new Contato(id, nome, telefone, email);
		
		ContatoRepository.save(contato);
		
		System.out.println("Cadastro salvo com sucesso\n");
		return contato;

	}

	public static void exportarLista(List<Contato> contatos) throws IOException {
		if (contatos != null && !contatos.isEmpty()) {

			OutputStream os;
			try {
				System.out.println("Digite o npme do arquivo para exportação: ");
				Scanner sc = new Scanner(System.in);
				String arquivo = sc.nextLine();
				os = new FileOutputStream(arquivo);
				Writer wr = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(wr);
				for (Contato contato : contatos) {
					bw.write(contato.getNome() + "; " + contato.getEmail());
				}
				bw.close();
				System.out.println("Lista exportada com sucesso!");
				sc.close();
			} catch (FileNotFoundException e) {
				System.out.println("Ocorreu um erro ao gravar o arquivo");
			}
		

		}
	}
}
