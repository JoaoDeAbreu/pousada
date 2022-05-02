package ex_pousada;

	public class cliente {
		private String nome = new String();
		private String email;
		
		
		public cliente(String nome, String email) {
			this.nome = nome;
			this.email = email;
		}

		public String getNome() {
			return nome;
		}

		public String getEmail() {
			return email;
		}
		
		public String toString() {
			return "nome: j" + nome + ", email: " + email;
		}
	}

