package questao03;

public class DistribuicaoAlimento extends Projeto{

    public String descricaoAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dateInicio, String dateFim) {
        super(nomeProjeto, descricao, endereco, dateInicio, dateFim);
    }

    public DistribuicaoAlimento() {

    }

    public void validaProjeto(){
        if(getDateFim() == ""){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public void imprimaProjeto(){
        System.out.println("Nome " + getNomeProjeto());
        System.out.println("Descrição " + getDescricao());
        System.out.println("Data Início " + getDateInicio());
        System.out.println("Data Fim " + getDateFim());
        System.out.println("Quantidade " + getQtde());
    }

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dateInicio, String dateFim, String descricaoAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dateInicio, dateFim);
        this.descricaoAlimento = descricaoAlimento;
        this.qtde = qtde;
    }

    public String getDescricaoAlimento() {
        return descricaoAlimento;
    }

    public void setDescricaoAlimento(String descricaoAlimento) {
        this.descricaoAlimento = descricaoAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
}
