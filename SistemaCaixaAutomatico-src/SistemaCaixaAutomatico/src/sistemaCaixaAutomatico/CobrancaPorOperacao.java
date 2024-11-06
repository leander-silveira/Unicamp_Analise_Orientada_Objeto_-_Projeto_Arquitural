/*
 * Na Cobrança por Operação, não há mensalidade fixa, mas cada operação tem um custo. O
 * método calcularTaxaOperacao() retorna uma taxa por operação, enquanto cobrarMensalidade() 
 * retorna zero. 
 */


package sistemaCaixaAutomatico;

public class CobrancaPorOperacao implements TaxaStrategy {
    private static final float TAXA_POR_OPERACAO = 1.5f;

    @Override
    public float calcularTaxaOperacao() {
        return TAXA_POR_OPERACAO; // Cada operação tem uma taxa
    }

    @Override
    public float cobrarMensalidade() {
        return 0.0f; // Sem mensalidade fixa
    }
}
