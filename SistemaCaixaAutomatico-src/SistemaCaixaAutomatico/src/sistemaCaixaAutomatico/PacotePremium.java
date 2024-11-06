/*
 * No Pacote Premium, há uma mensalidade fixa e as operações são ilimitadas, 
 * ou seja, calcularTaxaOperacao() sempre retorna zero.
*/
 

package sistemaCaixaAutomatico;

public class PacotePremium implements TaxaStrategy {
    private static final float MENSALIDADE_FIXA = 50.0f;

    @Override
    public float calcularTaxaOperacao() {
        return 0.0f; // Operações ilimitadas sem custo adicional
    }

    @Override
    public float cobrarMensalidade() {
        return MENSALIDADE_FIXA; // Mensalidade fixa
    }
}
