public class Editar{
    
	public void editaUsuario(String indice,String usuario,String senha,String nome,String tipo){
    
        
        try {
            String sqldml = "UPDATE usuario SET usuario = '"+usuario+"',senha = '"+senha+
                    "',nome = '"+nome+"',tipo = '"+tipo+"'"+" "
                    + "WHERE usuario = '"+indice+"'";
            
            
            int tipo1 = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqldml, tipo1, concorrencia);
            
           
            int resposta = pstdados.executeUpdate();
            connection.commit();
            System.out.println("Resposta do P-Update = " + resposta);
            System.out.println("Edição bem sucedida");

        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar = " + erro);
        }
        
    }
}