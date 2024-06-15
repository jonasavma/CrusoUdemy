package associacao;

import hibernateanatocoes.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Listar_Pessoa {

    public static void main(String[] args) {

        try {
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg.addAnnotatedClass(Pessoa.class);
            SessionFactory fabrica = cfg.buildSessionFactory();
            Session sessao = fabrica.openSession();

            Pessoa pessoa = (Pessoa) sessao.get(Pessoa.class, 3);
            String dados = "Dados pessoa .:\n\n";
            dados = dados + "Codigo pessoa.:" + pessoa.getId();
            dados = dados + "\nNome Pessoa .: " + pessoa.getNome();

            List<String> telefones_pessoa = pessoa.getTelefones_pessoa();
            int quantidades_fones_do_aluno = telefones_pessoa.size();
            Iterator it_fones_aluno = telefones_pessoa.iterator();
            String fones_deste_aluno = "";

            for (int i = 0; i < quantidades_fones_do_aluno; i++) {
                fones_deste_aluno = fones_deste_aluno + "\nFone" + (i + 1) + ".:" + it_fones_aluno.next();

                JOptionPane.showMessageDialog(null, "Dados:\n\n"
                        + "Nome  do Aluno" + dados + "\n\n"
                        + "Fones de Aluno"
                        + quantidades_fones_do_aluno + "\n"
                        + fones_deste_aluno);

            }

            sessao.close();

            JOptionPane.showMessageDialog(null, dados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
