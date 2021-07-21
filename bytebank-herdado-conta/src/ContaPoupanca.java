
public class ContaPoupanca extends Conta implements Tributavel{

	private double porcentagemImposto = 0.05;
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getPorcentagemImposto() {
		return porcentagemImposto;
	}
	
	@Override
	public double getSaldo() {
		 
		 return super.saldo;
	 }
}
