package Ex_35;

public class Cliente {
	
	
	public class cliente {
		private int id;
		private String nome;
		private int idade;
		private String email;
		private ContaBancaria contaBancaria;
		
		public int getId() {
			return this.id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return this.nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return this.idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public ContaBancaria getContaBancaria() {
			return this.contaBancaria;
		}
		public void setContaBancaria (ContaBancaria contaBancaria) {
			this.contaBancaria = contaBancaria;
		}
		
		
		
		cliente(){
			
		}
		cliente(int id, String nome, int idade, String email, ContaBancaria contaBancaria ){
			this.id = id;
			this.nome = nome;
			this.idade = idade;
			this.email = email;
			this.contaBancaria = contaBancaria;
		}
		
		public void atualizarEmail(String novoEmail) {
			this.email = novoEmail;
		}
		public String exibirNomeIdade() {
			return ("Nome:" + this.getNome() + "Idade:"+ this.getIdade());
		}
		public String exibirDadosConta() {
			return ("Ag?ncia:"+ this.contaBancaria.getAgencia() + "N?mero:" + this.contaBancaria.getNumero() + "Saldo:" + this.contaBancaria.getSaldo());
		}
	}
}
