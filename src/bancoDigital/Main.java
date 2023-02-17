package bancoDigital;

public class Main {

	public static void main(String[] args) {
		
		Cliente Luhan = new Cliente();
		Luhan.setNome("Luhan");
		
		Conta cc = new ContaCorrente(Luhan);
		Conta poupanca = new ContaPoupanca(Luhan);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}	

}
