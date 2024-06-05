package onetoone_unidirecional_tabela_associativa;

import onetomany_unidirecional_tabelaassociativa.*;
import manytomany_unidirecional_tabelaassosssitiva.*;
import oneTomany_unidirecional.*;
import java.util.Set;

public class Pessoa {
    
    
    private int id;
    private String nome_pessoa;
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public onetoone_unidirecional_tabela_associativa.Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(onetoone_unidirecional_tabela_associativa.Endereco endereco) {
        this.endereco = endereco;
    }


   
    
    
    
    
}
