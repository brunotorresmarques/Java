package br.ufc.quixada.poo;

public class ContaCorrente extends ContaBancaria implements Inter{

	private double taxaDeOpera��o;

	public double getTaxaDeOpera��o() {
		return taxaDeOpera��o;
	}

	public void setTaxaDeOpera��o(double taxaDeOpera��o) {
		this.taxaDeOpera��o = taxaDeOpera��o;
	}
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numeroConta, double saldo, double taxaDeOpera��o) {
		super(numeroConta, saldo);
		this.taxaDeOpera��o = taxaDeOpera��o;
	}
	
	

	

	@Override
	public boolean sacar(double dinheiro) {
		dinheiro = getSaldo() - (dinheiro + taxaDeOpera��o);
		setSaldo(dinheiro);
		return true;
	}

	@Override
	public boolean depositar(double salario) {
		salario = getSaldo() + (salario - taxaDeOpera��o);
		setSaldo(salario);
		return true;
	}

	@Override
	public void mostrarDados() {
		System.out.println(super.toString() +"\n"+ "Taxa de Opera��o: " + taxaDeOpera��o);
	}

	@Override
	public String toString() {
		return super.toString() +"\n"+ "Taxa de Opera��o: " + taxaDeOpera��o;
	}
	
	
	
	
	
}
