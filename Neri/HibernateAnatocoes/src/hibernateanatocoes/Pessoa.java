package hibernateanatocoes;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {
    
    
    private int id;
    private String nome;
    private String fone;
    private String cidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    
    
}
