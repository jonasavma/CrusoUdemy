package OneToOne_pk;

import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Lista_Pessoa_Endereco {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            String dados = "Dados pessoa .:\n\n";

            //Como é unidirecional não traz pessoa 
            Endereco endereco = (Endereco) sessao.get(Endereco.class, 5);
            dados = dados + "\n\nDados Endereço .:\n\n";
            dados = dados + "Codigo endereco.:" + endereco.getId_endereco();
            dados = dados + "\nNome endereco .: " + endereco.getDesc_endereco();
            dados = dados + "\nCodigo Pessoa.:" + endereco.getPessoa().getId_pessoa();
            dados = dados + "\nNome Pessoa .:" + endereco.getPessoa().getNome_pessoa();
            sessao.close();

            JOptionPane.showMessageDialog(null, dados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Pessoa :" + e);

        }

    }

}
