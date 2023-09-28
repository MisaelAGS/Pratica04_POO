package questao03;

public class Main {
    public static void main(String[] args) {

        TrabalhoVolutario tv = new TrabalhoVolutario();
        tv.setNomeProjeto("Criança Esperança");
        tv.setDuracaoTrabalho(5);
        tv.setEndereco("Rio de Janeiro - Brasil");
        tv.setTipoTrabalho("Não Remunerado");
        tv.setDescricao("Trabalho social");
        tv.setDateInicio("02/10/2023");
        tv.setDateFim(" ");

        tv.imprimeProjeto();
        tv.validaProjeto();

        DistribuicaoAlimento da = new DistribuicaoAlimento();
        da.setNomeProjeto("Alimentando Famintos");
        da.setDescricao("Doação de alimentos");
        da.setDescricaoAlimento("Pão com manteiga");
        da.setQtde(500);
        da.setDateInicio("01/10/2023");
        da.setDateFim("");
        da.validaProjeto();
        da.imprimaProjeto();
    }
}
