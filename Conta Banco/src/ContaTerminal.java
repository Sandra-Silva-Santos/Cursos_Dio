public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 26;
        double valorSolicitado = 16;
        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println ("Saque de:  " + valorSolicitado + " realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de " + valorSolicitado);
        }

    }
}
