public class Main {

    public static void main(String[] args) {
        Cliente caiojosef = new Cliente();
        venilton.setNome("Caio Josef");

        Conta cc = new ContaCorrente(caiojosef);
        Conta poupanca = new contaP(caiojosef);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}