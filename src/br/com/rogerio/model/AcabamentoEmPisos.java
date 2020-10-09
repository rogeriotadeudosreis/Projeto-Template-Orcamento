package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class AcabamentoEmPisos {

    private String tipo;
    private int quant;

    public AcabamentoEmPisos() {
    }

    public AcabamentoEmPisos(String tipo, int quant) {
        this.tipo = tipo;
        this.quant = quant;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "---------- Informações do Acabamento em pisos ----------\n"
                + "Piso do tipo = " + this.tipo + "\n"
                + "Quantidade = " + this.quant + "Mts/Quad.\n";
                
    }

}
