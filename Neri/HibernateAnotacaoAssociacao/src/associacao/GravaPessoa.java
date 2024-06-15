package associacao;

import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

public class GravaPessoa {

    public static void main(String[] args) {

        try {
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg.addAnnotatedClass(Pessoa.class);
            cfg.addAnnotatedClass(Endereco.class);
            SessionFactory fabrica = cfg.buildSessionFactory();
            Session sessao = fabrica.openSession();

            Pessoa obj_pessoa = new Pessoa();
            obj_pessoa.setNome("Marcos Avelino 3");
            obj_pessoa.setFone("969403632");
            obj_pessoa.setCidade("Rio de janeiro");
            obj_pessoa.setSalario(10000.05);

            
            

            Transaction tx_pessoa = sessao.beginTransaction();
            sessao.saveOrUpdate(obj_pessoa);

            tx_pessoa.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Gravado com Sucesso :");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
