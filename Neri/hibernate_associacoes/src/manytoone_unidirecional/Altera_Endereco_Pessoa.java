package manytoone_unidirecional;

import oneToone_bidirecional.*;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Altera_Endereco_Pessoa {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Transaction tx_pessoa = sessao.beginTransaction();
            Pessoa obj_pessoa = new Pessoa();

            obj_pessoa.setId_pessoa(2);
            obj_pessoa.setNome_pessoa("Jonas ");

            Endereco obj_endereco = new Endereco();
            obj_endereco.setId_endereco(obj_pessoa.getId_pessoa());
            obj_endereco.setDesc_endereco("Rua Salvador Lombone ");
            
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
