package onrtomany_unidirecional_tabelaassosssitiva;

import oneTomany_unidirecional.*;
import java.util.Set;

public class Pessoa {
    
    
    private int id;
    private String nome_pessoa;
    private Set endereco;

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

    public Set getEndereco() {
        return endereco;
    }

    public void setEndereco(Set endereco) {
        this.endereco = endereco;
    }

   
    
    
    
    
}
