package sistemaCaixaAutomatico;

/*public class TesteSistemaCaixa {

    public static void main(String[] args) {
        // Criação de contas com diferentes estratégias de cobrança
        ContaCor conta1 = new ContaCor("Juliana", 500, 1, 1234, new PacotePremium());
        ContaCor conta2 = new ContaCor("Maria", 300, 2, 5678, new PacoteBasico());
        ContaCor conta3 = new ContaCor("Nestor", 200, 3, 9876, new CobrancaPorOperacao());

        System.out.println("=== Teste de Operações no Sistema de Caixa Automático ===");

        // Consulta saldo para cada conta
        System.out.println("\nSaldo da conta 1 (Juliana): R$" + conta1.obterSaldo(1234));
        System.out.println("Saldo da conta 2 (Maria):   R$" + conta2.obterSaldo(5678));
        System.out.println("Saldo da conta 3 (Nestor):  R$" + conta3.obterSaldo(9876));

        // Saque na conta 2 (Maria) com cobrança de taxa após limite de operações
        System.out.println("\n--- Saque R$50 na conta 2 (Maria) ---");
        conta2.debitarValor("Saque", 50, 5678);
        conta2.cobrarTaxaOperacao(); // Aplica taxa conforme o Pacote Básico
        //System.out.println("Saldo na conta 2 (Maria) após saque e taxa: " + conta2.obterSaldo(5678));
        // Consulta saldo para cada conta
        System.out.println("\nSaldo da conta 1 (Juliana): R$" + conta1.obterSaldo(1234));
        System.out.println("Saldo da conta 2 (Maria):   R$" + conta2.obterSaldo(5678));
        System.out.println("Saldo da conta 3 (Nestor):  R$" + conta3.obterSaldo(9876));

        // Transferência da conta 1 (Juliana) para a conta 3 (Nestor)
        System.out.println("\n--- Transferência R$100 da conta 1 (Juliana) para a conta 3 (Nestor) ---");
        if (conta1.debitarValor("Transferência R$100 para Nestor", 100, 1234)) {
            conta1.cobrarTaxaOperacao(); // Aplica taxa no débito de Juliana
            conta3.creditarValor("Transferência de Juliana", 100);
            conta3.cobrarTaxaOperacao(); // Aplica taxa no crédito de Nestor
            System.out.println("Transferência concluída.");
        } else {
            System.out.println("Transferência falhou.");
        }

        // Consulta de saldo após transferência
        //System.out.println("\nSaldo da conta 1 (Juliana) após transferência: " + conta1.obterSaldo(1234));
        //System.out.println("Saldo da conta 3 (Nestor) após recebimento: " + conta3.obterSaldo(9876));
        // Consulta saldo para cada conta
        System.out.println("\nSaldo da conta 1 (Juliana): R$" + conta1.obterSaldo(1234));
        System.out.println("Saldo da conta 2 (Maria):   R$" + conta2.obterSaldo(5678));
        System.out.println("Saldo da conta 3 (Nestor):  R$" + conta3.obterSaldo(9876));

        // Aplicação de mensalidade nas contas
        System.out.println("\n--- Cobrança de Mensalidade ---");
        System.out.println("Mensalidade da conta 1 (Juliana): " + conta1.getTaxaStrategy().cobrarMensalidade());
        System.out.println("Mensalidade da conta 2 (Maria): " + conta2.getTaxaStrategy().cobrarMensalidade());
        System.out.println("Mensalidade da conta 3 (Nestor): " + conta3.getTaxaStrategy().cobrarMensalidade());

        System.out.println("\n=== Teste Finalizado ===");
    }
}*/
