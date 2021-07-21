
// Gerente herda de Funcionário, assina o contrato Autenticavel / Tem o contrato Autenticavel IMPLEMENTADO
public class Gerente extends Funcionario implements Autenticavel{ 
	
	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {	 
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
	public double getBonificacao() {
		 
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getSalario();		
	}

}
