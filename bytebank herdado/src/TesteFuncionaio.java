
public class TesteFuncionaio {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.autentica(2222);
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCPF("2222222221");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}
}
