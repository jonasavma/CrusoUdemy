package onetone;

import associacao.*;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Lista_Pessoa_Endereco {

    public static void main(String[] args) {

        try {
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg.addAnnotatedClass(Pessoa.class);
            cfg.addAnnotatedClass(Endereco.class);
            SessionFactory fabrica = cfg.buildSessionFactory();
            Session sessao = fabrica.openSession();

            Pessoa pessoa = (Pessoa) sessao.get(Pessoa.class, 8);
            String dados = "Dados pessoa .:\n\n";
            dados = dados + "Codigo pessoa.:" + pessoa.getId();
            dados = dados + "\nNome Pessoa .: " + pessoa.getNome();
            dados = dados + "\nEndereço :" + pessoa.getEndereco().getCidade();

            Endereco endereco = (Endereco) sessao.get(Endereco.class,7);
            dados = dados + "\n\nDados pessoa .:\n\n";
            dados = dados + "Codigo endereco.:" + endereco.getId();
            dados = dados + "\nNome endereco .: " + endereco.getCidade();
            sessao.close();

            JOptionPane.showMessageDialog(null, dados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar :" + e);

        }

    }

}
