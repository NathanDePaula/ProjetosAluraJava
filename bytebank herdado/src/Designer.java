
public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Designer");
		return 200;
	}
}
