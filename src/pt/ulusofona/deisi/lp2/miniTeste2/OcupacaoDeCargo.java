package pt.ulusofona.deisi.lp2.miniTeste2;

public class OcupacaoDeCargo {

    String tituloDoCargo;
    int anoEmQueFicouAtivo;

    OcupacaoDeCargo() {}

    OcupacaoDeCargo(String tituloDoCargo, int anoEmQueFicouAtivo) {

        this.tituloDoCargo = tituloDoCargo;
        this.anoEmQueFicouAtivo = anoEmQueFicouAtivo;

    }

    public int getAnoEmQueFicouAtivo() {

        return anoEmQueFicouAtivo;

    }

    public String getTituloDoCargo() {

        return tituloDoCargo;

    }

    @Override
    public String toString() {

        return anoEmQueFicouAtivo + " - " + tituloDoCargo;

    }
}
