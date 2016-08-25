import javax.annotation.sql.DataSourceDefinition;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@DataSourceDefinition(name = "java:global/jdbc/DS",
        className = "oracle.jdbc.OracleDriver",
        url = "jdbc:oracle:thin:@localhost:57393:orcl",
        user = "c##enet",//"c##diplom",
        password = "enet"//"555792"
)
public class Resources {
    @SuppressWarnings("unused")
    @Produces
    @PersistenceContext
    private EntityManager em;
}
