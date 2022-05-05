package Ex_34;

public class ContaBancaria {
	
	public String agencia;
	public String numero;
	public double saldo;
	
	public ContaBancaria() {
	
	}
	
	ContaBancaria(String ag, String num, double sal){
		this.agencia = ag;
		this.numero = num;
		this.saldo = sal;
	}
}
