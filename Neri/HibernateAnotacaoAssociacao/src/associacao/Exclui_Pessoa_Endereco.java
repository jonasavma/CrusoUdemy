package associacao;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Exclui_Pessoa_Endereco {

    public static void main(String[] args) {

        try {
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg.addAnnotatedClass(Pessoa.class);
            cfg.addAnnotatedClass(Endereco.class);
            SessionFactory fabrica = cfg.buildSessionFactory();
            Session sessao = fabrica.openSession();
            Transaction tx_pessoa = sessao.beginTransaction();

            Pessoa pessoa = (Pessoa) sessao.get(Pessoa.class, 3);
            sessao.delete(pessoa);

            tx_pessoa.commit();
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar :" + e);

        }

    }
}
