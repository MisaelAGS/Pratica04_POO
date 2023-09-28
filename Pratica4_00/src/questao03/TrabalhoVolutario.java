package questao03;

public class TrabalhoVolutario extends Projeto{

    public String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVolutario(String nomeProjeto, String descricao, String endereco, String dateInicio, String dateFim) {
        super(nomeProjeto, descricao, endereco, dateInicio, dateFim);
    }

    public TrabalhoVolutario() {
        super();
    }


    public void validaProjeto(){
        if(getDuracaoTrabalho() > 2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    public void imprimeProjeto(){
        System.out.println("Nome " + getNomeProjeto());
        System.out.println("Descrição " + getDescricao());
        System.out.println("Data Início " + getDateInicio());
        System.out.println("Data Fim " + getDateFim());
        System.out.println("Tipo de trabalho " + getTipoTrabalho());
        System.out.println("Duração de trabalho " + getDuracaoTrabalho());
    }

    public TrabalhoVolutario(String nomeProjeto, String descricao, String endereco, String dateInicio, String dateFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dateInicio, dateFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }
}
