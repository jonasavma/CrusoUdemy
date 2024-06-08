package hibernate_heranca;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory FabricaSessoes;

    static {
        try {
            FabricaSessoes = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na fabrica de Sessões.");
            FabricaSessoes = null;
        }
    }

    //Método statico para abrir a sessão
    public static Session getSessao() {
        return FabricaSessoes.openSession();
    }
}
