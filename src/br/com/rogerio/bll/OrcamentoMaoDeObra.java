package br.com.rogerio.bll;

import br.com.rogerio.model.AcabamentoEmPisos;

/**
 *
 * @author roger
 */
public abstract class OrcamentoMaoDeObra {

    private double valorTotal;
    private double valorMetro;

    public double getValorMetro() {
        return valorMetro;
    }

    public void setValorMetro(double valorMetro) throws Exception {
        this.valorMetro = valorMetro;
    }

    public abstract double calcularOrcamento(AcabamentoEmPisos objeto);

    public final String apresentarOrcamento(AcabamentoEmPisos objeto) {

        this.valorTotal = calcularOrcamento(objeto);

         String orcamento = "\n---------- Informações sobre o Orçamento ----------\n"
                + "Tipo de piso escolhido: " + objeto.getTipo() + "\n"
                + "Quantidade em metros quadrados: " + objeto.getQuant() + "\n"
                + "Valor cobrado por metro quadrado: " + this.getValorMetro() + "\n"
                + "Valor total do orçamento: " + this.valorTotal + "\n";
        

        return orcamento;
    }
}
