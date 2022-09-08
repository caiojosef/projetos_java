public interface intro{

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, contaVar contaDestino);

    void imprimirExtrato();

    void transferir(double valor, contaP contaDestino);
}