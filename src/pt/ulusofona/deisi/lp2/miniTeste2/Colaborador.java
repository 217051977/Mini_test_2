package pt.ulusofona.deisi.lp2.miniTeste2;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {

    String nome;
    List<OcupacaoDeCargo> historicoDeCargos = new ArrayList<>();

    Colaborador(String nome) {

        this.nome = nome;

    }

    Colaborador(String nome, int anoEmQueFicouAtivo, String tituloDoCargo) {

        this.nome = nome;

        OcupacaoDeCargo cargo = new OcupacaoDeCargo(tituloDoCargo, anoEmQueFicouAtivo);
        historicoDeCargos.add(cargo);

    }

    public String getNome() {

        return nome;

    }

    boolean promoverPara(String titulo, int ano) {

        for (OcupacaoDeCargo cargo : historicoDeCargos) {

            if (cargo.getAnoEmQueFicouAtivo() == ano) {

                return false;

            }

        }

        OcupacaoDeCargo novoCargo = new OcupacaoDeCargo(titulo, ano);
        historicoDeCargos.add(novoCargo);
        return true;

    }

    String cargoEm(int ano) {

        String cargoNoAnoPedido = "N/A";
        int anoMenor = 0;

        for (OcupacaoDeCargo cargo : historicoDeCargos) {

            if (cargo.getAnoEmQueFicouAtivo() <= ano && cargo.getAnoEmQueFicouAtivo() > anoMenor) {

                cargoNoAnoPedido = cargo.getTituloDoCargo();

            }

        }

        return cargoNoAnoPedido;

    }

    boolean temCunha() {

        int ano = 0;

        for (OcupacaoDeCargo cargo : historicoDeCargos) {

            if (ano == 0) {

                ano = cargo.getAnoEmQueFicouAtivo();

            } else if (cargo.getAnoEmQueFicouAtivo() != ano + 1) {

                return false;

            }

            ano = cargo.getAnoEmQueFicouAtivo();

        }

        return true;

    }

    @Override
    public String toString() {

        int count = 0;
        OcupacaoDeCargo primeiroCargo = new OcupacaoDeCargo(), ultimoCargo = new OcupacaoDeCargo();

        for (OcupacaoDeCargo cargo : historicoDeCargos) {

            if (count == 0) {

                primeiroCargo = ultimoCargo = cargo;
                count++;

            }else if (primeiroCargo.getAnoEmQueFicouAtivo() > cargo.getAnoEmQueFicouAtivo()) {

                primeiroCargo = cargo;

            } else if (ultimoCargo.getAnoEmQueFicouAtivo() < cargo.getAnoEmQueFicouAtivo()) {

                ultimoCargo = cargo;

            }

        }

        if (count == 0) {

            return nome + " | " +
                    "N/A" +  " - " + "N/A" + " | " +
                    "N/A" + " - " + "N/A";

        }
        return nome + " | " +
                primeiroCargo + " | " +
                ultimoCargo;

    }
}
