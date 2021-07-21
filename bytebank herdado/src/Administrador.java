
// � um Funcion�rio e assina o contrato Autenticavel / Tem o contrato Autenticavel IMPLEMENTADO
public class Administrador extends Funcionario implements Autenticavel{

	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
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

	@Override
	public double getBonificacao() {
		return 50;
	}
}
