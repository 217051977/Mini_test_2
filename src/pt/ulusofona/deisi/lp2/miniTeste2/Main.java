package pt.ulusofona.deisi.lp2.miniTeste2;

public class Main {

    public static void main(String[] args) {

        Colaborador colaborador = euProprio();

        System.out.println(colaborador);

        colaborador = new Colaborador("Joaquim", 2018, "cargo");
        colaborador.promoverPara("cargo2", 2017);

        System.out.println(colaborador);

    }

    static Colaborador euProprio() {

        Colaborador colaborador = new Colaborador("a2170");

        return colaborador;

    }

}
