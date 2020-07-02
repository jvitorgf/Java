import java.sql.*;

public class Inserir{
	public void insereUsuario (String usuario, String senha) {
        try {
            String sqldml = "INSERT INTO usuario (usuario,senha) "
                    + "values (?,?)";
            int tipo1 = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqldml, tipo1, concorrencia);
            String usuario1 = usuario;
            pstdados.setString(1, usuario1);
            String senha1 = senha;
            pstdados.setString(2, senha1);
            int resposta = pstdados.executeUpdate();
            connection.commit();
            System.out.println("Resposta do P-Update = " + resposta);
            System.out.println("Usuario inserido com sucesso.");

        } catch (SQLException erro) {
            System.out.println("Erro ao inserir = " + erro);
        }
    }
}