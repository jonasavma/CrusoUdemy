package manytoone_unidirecional_tabela_associativa;

import onetomany_unidirecional_tabelaassociativa.*;
import manytomany_unidirecional_tabelaassosssitiva.*;
import oneTomany_unidirecional.*;
import oneToOne_unidirecional.*;

public class Endereco {
    private int id;
    private String desc_endereco;

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
    
    
}
