
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Necessário o driver JDBC do postgreSQL

public class AcessaBanco{

    private final String url = "jdbc:postgresql://localhost/nomedobanco";
    private final String user = "nomedousuario";
    private final String password = "senhaparaacesso";

    
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage()); //Falha na conexão
        }

        return conn;
    }

    public static void main(String[] args) {
        AcessaBanco acessa = new AcessaBanco();
        acessa.connect();
    }
}