package OneToOne_pk;

import ManyToOneParaOneToOne_FK.*;
import manytoone_unidirecional.*;
import oneToone_bidirecional.*;

public class Endereco {
    private int id_endereco;
    private String desc_endereco;
    private Pessoa pessoa;

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
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
