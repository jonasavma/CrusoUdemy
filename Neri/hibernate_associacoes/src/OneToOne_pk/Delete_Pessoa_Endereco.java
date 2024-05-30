package OneToOne_pk;

import ManyToOneParaOneToOne_FK.*;
import manytoone_unidirecional.*;
import oneToone_bidirecional.*;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Delete_Pessoa_Endereco {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Transaction tx = sessao.beginTransaction();
          
            //Pessoa pessoa = (Pessoa) sessao.get(Pessoa.class, 1);
            //sessao.delete(pessoa);
            Endereco endereco = (Endereco) sessao.get(Endereco.class, 3);
            sessao.delete(endereco);

            tx.commit();
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
