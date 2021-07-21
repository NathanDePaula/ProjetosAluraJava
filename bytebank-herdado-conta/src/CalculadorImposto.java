
public class CalculadorImposto {
	
	public void calculaImpostoAnual(Tributavel t) {
		double saldo = t.getSaldo();
		double porcentagemMensal = t.getPorcentagemImposto();
		double impostoMensal = saldo * porcentagemMensal;
		double impostoAnual = impostoMensal * 12;
		System.out.println("Imposto Anual de: R$ " + impostoAnual);
	}
	
	public void calculaImpostoMensal(Tributavel t) {
		double saldo = t.getSaldo();
		double porcentagemMensal = t.getPorcentagemImposto();
		double impostoMensal = saldo * porcentagemMensal;
		System.out.println("Imposto Mensal de: R$ " + impostoMensal);
	}
}
