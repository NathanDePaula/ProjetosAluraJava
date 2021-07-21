
public class AutenticacaoUtil{

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			System.out.println("Senha incorreta");
			return false;
		}
	}

	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
}
