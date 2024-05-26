package oneToOne_unidirecional;

import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Lista_Pessoa_Endereco {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            Pessoa pessoa = (Pessoa) sessao.get(Pessoa.class,3);
            String dados = "Dados pessoa .:\n\n";
            dados = dados + "Codigo pessoa.:" + pessoa.getId_pessoa();
            dados = dados + "\nNome Pessoa .: " + pessoa.getNome_pessoa();
            dados = dados + "\nEndereço :" + pessoa.getEndereco().getDesc_endereco();

            /* Endereco endereco = (Endereco) sessao.get(Endereco.class, 3);
            dados = dados + "\n\nDados pessoa .:\n\n";
            dados = dados + "Codigo endereco.:" + endereco.getId_endereco();
            dados = dados + "\nNome endereco .: " + endereco.getDesc_endereco();*/
            sessao.close();

            JOptionPane.showMessageDialog(null, dados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
