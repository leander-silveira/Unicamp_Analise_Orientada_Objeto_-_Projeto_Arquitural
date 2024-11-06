package sistemaCaixaAutomatico;

public interface TaxaStrategy {
    /**
     * Calcula a taxa de uma operação, de acordo com a estratégia.
     * @return o valor da taxa a ser cobrada pela operação.
     */
    float calcularTaxaOperacao();

    /**
     * Calcula a mensalidade, se aplicável, de acordo com a estratégia.
     * @return o valor da mensalidade a ser cobrada.
     */
    float cobrarMensalidade();
}
