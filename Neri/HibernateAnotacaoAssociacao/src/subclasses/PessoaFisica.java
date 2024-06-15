package subclasses;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pessoaFisica")
@PrimaryKeyJoinColumn(name = "id_pessoa")
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String rg;
    private char sexo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    
    
    
    
}
