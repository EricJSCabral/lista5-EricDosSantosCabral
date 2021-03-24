package pacote01;

public class Turma {
	
	private String sigla;
	private String curso;
	
	public Turma(String sigla, String curso) {
	this.sigla = sigla;
	this.curso = curso;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", curso=" + curso + "]";
	}
	
	
}
