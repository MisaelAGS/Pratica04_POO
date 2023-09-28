package questao03;

public abstract class Projeto {
    public String nomeProjeto;
    private String descricao;
    public String endereco;
    private String dateInicio;
    private String dateFim;

    public Projeto() {

    }


    public void validaProjeto(){

    }
    public void imprimeProjeto(){

    }

    public Projeto(String nomeProjeto, String descricao, String endereco, String dateInicio, String dateFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.dateInicio = dateInicio;
        this.dateFim = dateFim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDateInicio() {
        return dateInicio;
    }

    public void setDateInicio(String dateInicio) {
        this.dateInicio = dateInicio;
    }

    public String getDateFim() {
        return dateFim;
    }

    public void setDateFim(String dateFim) {
        this.dateFim = dateFim;
    }
}
