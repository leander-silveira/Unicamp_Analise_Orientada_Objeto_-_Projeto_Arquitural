/** Autores: C.M.F. Rubira, P.A. Guerra e L.P. Tizzei
 * 
 * Introdução à Programação Orientada a Objetos usando Java
 * 
 * Cap. 6 - Sistema de Caixa Automático
 * 
 * última modificação: março de 2014
 */



package sistemaCaixaAutomatico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;

public class TrmCxAut {



	// Atributos
	private ControladorCaixa controladorCaixa;


	// Operações
	public TrmCxAut(int senhaCaixa) {
    	controladorCaixa = new ControladorCaixa(senhaCaixa);
	}

	/**
 	* Solicita que o usuário digite dados na entrada padrão de acordo com o significado da string
 	* passada como parâmetro.
 	* @param str define o que é solicitado para o usuário, e.g. "senha do caixa"
 	* @return um número (int) que foi digitado pelo usuário
 	*/
	private int getInt(String str) {
    	System.out.println("Entre com " + str);
    	
	Reader r = new BufferedReader(new InputStreamReader(System.in));
    	StreamTokenizer st = new StreamTokenizer(r);

    	try {
        	st.nextToken();
    	} catch (IOException e) {
        	System.out.println("Erro na leitura do teclado");
        	return 0;
    	}

    	return (int) st.nval;
	}

	private int getOp() {
    	int op;
    	int modoAtual = this.controladorCaixa.obterModoOperacaoAtual();

    	do {
        	if (modoAtual == Caixa.MODO_CLIENTE) {
            	op = getInt("opção: 1 = consulta saldo, 2 = saque, 4 = transferência, 8 = modo supervisor, 9 = sair");
            	if (op != 1 && op != 2 && op != 4 && op != 8 && op != 9) op = 0;
        	} else {
            	op = getInt("opção: 3 = recarregar, 8 = modo cliente, 9 = sair");
            	if (op != 3 && op != 8 && op != 9) op = 0;
        	}
    	} while (op == 0);
    	return op;
	}

	public void iniciarOperacao() {
    	int op = getOp();
    	while (op != 9) {
        	switch (op) {
            	case 1:
                	float saldo = controladorCaixa.consultarSaldo(getInt("número da conta"), getInt("senha"));
                	if (saldo == -1)
                    	System.out.println("Conta/senha inválida ou conta inativa.");
                	else
                    	System.out.println("Saldo atual: " + saldo);
                	break;

            	case 2:
                	boolean saqueEfetuado = controladorCaixa.efetuarSaque(getInt("número da conta"), getInt("senha"), getInt("valor"));
                	if (saqueEfetuado)
                    	System.out.println("Pode retirar o dinheiro.");
                	else
                    	System.out.println("Pedido de saque recusado.");
                	break;
       			
				case 3:
            		controladorCaixa.recarregar(getInt("senha"));
            			break;
            	case 4:
                	realizarTransferencia();
                	break;

            	case 8:
                	controladorCaixa.alternarModo(getInt("senha do caixa"));
                	break;
        	}
        	op = getOp();
    	}
	}

	/**
 	* Método para realizar transferência entre contas
 	*/
	private void realizarTransferencia() {
    	int numOrigem = getInt("número da conta de origem");
    	int senhaOrigem = getInt("senha da conta de origem");
    	int numDestino = getInt("número da conta de destino");
    	int valor = getInt("valor a ser transferido");

    	boolean sucesso = controladorCaixa.transferirEntreContas(numOrigem, senhaOrigem, numDestino, valor);
    	if (sucesso) {
        	System.out.println("Transferência realizada com sucesso!");
    	} else {
        	System.out.println("Falha na transferência. Verifique os dados da conta e o saldo.");
    	}
	}
}


