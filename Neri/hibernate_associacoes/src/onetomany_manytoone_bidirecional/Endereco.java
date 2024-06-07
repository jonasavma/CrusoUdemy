package onetomany_manytoone_bidirecional;

public class Endereco {
    private int id;
    private String desc_endereco;
    private Pessoa pessoa ; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc_endereco() {
        return desc_endereco;
    }

    public void setDesc_endereco(String desc_endereco) {
        this.desc_endereco = desc_endereco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    
}
