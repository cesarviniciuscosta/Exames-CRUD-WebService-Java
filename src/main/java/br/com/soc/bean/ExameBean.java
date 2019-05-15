package br.com.soc.bean;

public class ExameBean {

	// Modelo de vizualizacao bd "banco de dados"

	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	private String dataNascimento;
	private String email;
	private String telefone;
	private String nomeDoExame;
	private String dataDoExame;
	private String horaDoExame;
	private int srNo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomeDoExame() {
		return nomeDoExame;
	}

	public void setNomeDoExame(String nomeDoExame) {
		this.nomeDoExame = nomeDoExame;
	}

	public String getDataDoExame() {
		return dataDoExame;
	}

	public void setDataDoExame(String dataDoExame) {
		this.dataDoExame = dataDoExame;
	}

	public String getHoraDoExame() {
		return horaDoExame;
	}

	public void setHoraDoExame(String horaDoExame) {
		this.horaDoExame = horaDoExame;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	@Override
	public String toString() {
		return "ExameBean [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", email=" + email + ", telefone=" + telefone + ", nomeDoExame=" + nomeDoExame
				+ ", dataDoExame=" + dataDoExame + ", horaDoExame=" + horaDoExame + ", srNo=" + srNo + "]";
	}

}
