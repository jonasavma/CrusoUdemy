package subclasses;

import hierarquia.*;
import heranca_anotacion.*;
import associacao.*;
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
            Transaction tx_pessoa = sessao.beginTransaction();



            Pessoa obj_pessoa = new Pessoa();
            obj_pessoa.setNome("Marcos ");
            obj_pessoa.setSalario(10000.05);
            
            sessao.save(obj_pessoa);

            tx_pessoa.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Gravado com Sucesso :");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
