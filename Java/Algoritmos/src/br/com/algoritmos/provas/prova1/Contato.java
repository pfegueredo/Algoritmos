package br.com.algoritmos.provas.prova1;

public class Contato {
	private Long id;
	private String nome;
	private String telefone;
	private String email;
	
	public Contato(Long id, String nome, String telefone, String email) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void validaEmail(String email) {
		if (!email.contains("@")) {
			System.out.println("Esse e-mail não é válido");
		}
	}
	
	@Override
	public String toString() {
		 return this.getId()+" - "+this.getNome()+" - " +this.getTelefone()+" - "+this.getEmail();
	}
	
	
	
}
