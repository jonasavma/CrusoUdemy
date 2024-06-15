package many_to_many;

import one_to_many.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraTabelaBanco {

    public static void main(String[] args) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.addAnnotatedClass(Pessoa.class);
        cfg.addAnnotatedClass(Endereco.class);
        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);

    }

}
