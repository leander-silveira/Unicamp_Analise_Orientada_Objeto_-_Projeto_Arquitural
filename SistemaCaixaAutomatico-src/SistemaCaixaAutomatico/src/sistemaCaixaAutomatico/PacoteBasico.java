/*
 * No Pacote Básico, há uma mensalidade fixa e um número limitado de operações incluídas. 
 * Após exceder o limite de operações, uma taxa adicional é cobrada para cada operação extra.
*/

package sistemaCaixaAutomatico;

public class PacoteBasico implements TaxaStrategy {
    private static final float MENSALIDADE_FIXA = 20.0f;
    private static final int OPERACOES_INCLUIDAS = 5;
    private static final float TAXA_EXTRA = 2.0f;

    private int contadorOperacoes = 0;

    @Override
    public float calcularTaxaOperacao() {
        contadorOperacoes++;
        if (contadorOperacoes > OPERACOES_INCLUIDAS) {
            return TAXA_EXTRA; // Taxa para operações extras
        }
        return 0.0f; // Sem taxa para as primeiras operações incluídas
    }

    @Override
    public float cobrarMensalidade() {
        return MENSALIDADE_FIXA;
    }
}
