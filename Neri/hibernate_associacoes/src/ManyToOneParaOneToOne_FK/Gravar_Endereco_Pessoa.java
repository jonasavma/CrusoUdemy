package ManyToOneParaOneToOne_FK;

import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Gravar_Endereco_Pessoa {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Transaction tx_pessoa = sessao.beginTransaction();
            
            
            Endereco obj_endereco = new Endereco();
            obj_endereco.setId_endereco(1);
            obj_endereco.setDesc_endereco("Rua Salvador Lombone nº ");

            
            
            Pessoa obj_pessoa = new Pessoa();
            obj_pessoa.setId_pessoa(2);
            obj_pessoa.setNome_pessoa("Jonas");
            obj_pessoa.setEndereco(obj_endereco);

            sessao.saveOrUpdate(obj_pessoa);

            tx_pessoa.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Gravado com Sucesso :");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
