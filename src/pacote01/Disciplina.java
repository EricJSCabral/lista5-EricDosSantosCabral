package pacote01;

public class Disciplina {
	
	private String nome;
	private Professor professor;
	
	public Disciplina(String nome, Professor professor) {
		super();
		this.nome = nome;
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "DIsciplina [nome=" + nome + ", professor=" + professor + "]";
	}
	
	
	
}

