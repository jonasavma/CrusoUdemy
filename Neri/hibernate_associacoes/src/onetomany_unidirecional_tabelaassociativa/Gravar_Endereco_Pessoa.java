package onetomany_unidirecional_tabelaassociativa;

import manytomany_unidirecional_tabelaassosssitiva.*;
import java.util.HashSet;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Gravar_Endereco_Pessoa {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            Pessoa obj_pessoa = new Pessoa();
            obj_pessoa.setId(2);
            obj_pessoa.setNome_pessoa("Jonas ");

            Endereco obj_endereco = new Endereco();
            obj_endereco.setId(1);
            obj_endereco.setDesc_endereco("Rua Salvador Lombone");

            obj_pessoa.setEndereco(new HashSet<Endereco>());
            obj_pessoa.getEndereco().add(obj_endereco);

            Transaction tx_pessoa = sessao.beginTransaction();
            sessao.save(obj_pessoa);
            tx_pessoa.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Gravado com Sucesso :");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
