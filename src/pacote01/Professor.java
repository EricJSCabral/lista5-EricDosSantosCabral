package pacote01;

public class Professor extends Pessoa implements Autenticacao {

		private String titulacao;
		private int siape;
	
		public Professor(String nome, String titulacao, int siape) {
		super.setNome(nome);
		this.titulacao = titulacao;
		this.siape = siape;
		}
		
		
		public String getTitulacao() {
			return titulacao;
		}



		public void setTitulacao(String titulacao) {
			this.titulacao = titulacao;
		}



		public int getSiape() {
			return siape;
		}



		public void setSiape(int siape) {
			this.siape = siape;
		}



		@Override
		public String toString() {
		return "Professor [titulacao=" + titulacao + ", siape=" + siape + ", nome=" + getNome() + "]";
		}
		
		@Override
		public double calcRefeicao() {
		return 00;
}


		@Override
		public void login(String user, String senha) {
			System.out.println("Bem-vindo aluno "+user);
		}
}