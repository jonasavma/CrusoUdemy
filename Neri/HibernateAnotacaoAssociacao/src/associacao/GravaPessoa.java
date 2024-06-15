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
            Transaction tx_pessoa = sessao.beginTransaction();

            Endereco obj_endereco = new Endereco();
            //obj_endereco.setId(3);
            obj_endereco.setCidade("Rio de janeiro");
            obj_endereco.setCep("235481");
            obj_endereco.setEstado("Rio de janeiro");
            obj_endereco.setRua("Salvador Lombone");
           

           // sessao.save(obj_endereco);

            Pessoa obj_pessoa = new Pessoa();
            //obj_pessoa.setId(3);
            obj_pessoa.setNome("Marcos ");
            obj_pessoa.setSalario(10000.05);
            obj_pessoa.setEndereco(obj_endereco);
            
            obj_endereco.setPessoa(obj_pessoa);
            sessao.save(obj_pessoa);

            tx_pessoa.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Gravado com Sucesso :");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
