package br.com.rogerio.bll;

import br.com.rogerio.model.AcabamentoEmPisos;

/**
 *
 * @author roger
 */
public class OrcamentoMaoDeObraPisoComum extends OrcamentoMaoDeObra {

    @Override
    public double getValorMetro() {
        return super.getValorMetro() + 35;
    }

    @Override
    public double calcularOrcamento(AcabamentoEmPisos acabamento) {
        return acabamento.getQuant() * this.getValorMetro();
    }
}
