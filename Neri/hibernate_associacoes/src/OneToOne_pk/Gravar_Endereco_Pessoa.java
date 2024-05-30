package OneToOne_pk;

import ManyToOneParaOneToOne_FK.*;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Gravar_Endereco_Pessoa {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Transaction tx_pessoa = sessao.beginTransaction();

            Pessoa obj_pessoa = new Pessoa();
            obj_pessoa.setId_pessoa(5);
            obj_pessoa.setNome_pessoa("Jonas Avelino");

            Endereco obj_endereco = new Endereco();
           // obj_endereco.setId_endereco(4);Não precisa setar*******************
            obj_endereco.setDesc_endereco("Rua Salvador Lombone nº ");
            obj_endereco.setPessoa(obj_pessoa);

            sessao.save(obj_endereco);

            tx_pessoa.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Gravado com Sucesso :");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
