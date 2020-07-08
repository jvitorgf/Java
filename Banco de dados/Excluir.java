public class Excluir{
    
	 public void excluiUsuario(String indice){
    
        
        try {
            String sqldml = "DELETE FROM usuario"+" WHERE usuario LIKE '%"+indice+"%'";
            
            
            int tipo1 = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqldml, tipo1, concorrencia);
            
           
            int resposta = pstdados.executeUpdate();
            connection.commit();
            System.out.println("Resposta do P-Update = " + resposta);

        } catch (SQLException erro) {
            System.out.println("Erro ao excluir = " + erro);
        }
        
    }
}