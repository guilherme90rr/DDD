package Ex_35;

public class ContaBancaria {

	public class contabancaria {
		private String agencia;
		private String numero;
		private double saldo;
		
		contabancaria(String agencia, String numero, double saldo){
		
			this.agencia = agencia;
			this.numero = numero;
			this.saldo = saldo;
		}
		
		public String getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		
		public String getNumero() {
			return this.numero;
		}
		
		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	}
}
