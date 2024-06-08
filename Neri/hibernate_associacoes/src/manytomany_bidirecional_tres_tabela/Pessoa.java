package manytomany_bidirecional_tres_tabela;

import java.util.Set;

public class Pessoa {
    
    
    private int id_pessoa;
    private String nome_pessoa;
    private Set endereco;

    
    
    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
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
