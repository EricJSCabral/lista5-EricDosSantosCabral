package pacote01;

public abstract class Pessoa {
	private String nome;
	
	public abstract double calcRefeicao();
	
	public String getNome() {
	return nome;
	}
	
	public void setNome(String nome) {
	this.nome = nome;
	}
	
	
	@Override
	public String toString() {
	return "Pessoa [nome=" + nome + "]";
	}

	
	
	
}
