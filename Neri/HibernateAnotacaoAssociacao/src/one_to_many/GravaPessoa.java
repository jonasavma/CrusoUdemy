package one_to_many;

import java.util.Collection;
import java.util.HashSet;
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
            //obj_pessoa.setId(8);
            obj_pessoa.setNome("Marcos ");
            obj_pessoa.setSalario(10000.05);

            Endereco obj_endereco = new Endereco();
            //obj_endereco.setId(3);
            obj_endereco.setCidade("Rio de janeiro");
            obj_endereco.setCep("235481");
            obj_endereco.setEstado("Rio de janeiro");
            obj_endereco.setRua("Salvador Lombone");
            obj_endereco.setPessoa(obj_pessoa);
            
            
            Endereco obj_endereco2 = new Endereco();
           // obj_endereco2.setId(4);
            obj_endereco2.setCidade("Rio de janeiro");
            obj_endereco2.setCep("235481");
            obj_endereco2.setEstado("Rio de janeiro");
            obj_endereco2.setRua("Salvador Lombone");
            obj_endereco2.setPessoa(obj_pessoa);
            
            obj_pessoa.setEndereco(new HashSet<Endereco>());
            obj_pessoa.getEndereco().add(obj_endereco);
            obj_pessoa.getEndereco().add(obj_endereco2);

            sessao.save(obj_endereco);

            tx_pessoa.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Gravado com Sucesso :");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
