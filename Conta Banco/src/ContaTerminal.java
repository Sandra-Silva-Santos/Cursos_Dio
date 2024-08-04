public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 15;
        double valorSolicitado = 22;
        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
}