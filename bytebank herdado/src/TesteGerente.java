
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Administrador();
		
		Gerente	g1 =  new Gerente();
		g1.setNome("Marco");
		g1.setCPF("23654775256");
		g1.setSalario(5000.0);
		g1.setSenha(222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCPF());
		System.out.println(g1.getSalario());
		
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
