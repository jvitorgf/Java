public class Consultar{
	public String[] consultaUsuario(String busca) {
        try {

            String sqldml = "SELECT * FROM usuario "
                    + "WHERE usuario LIKE '%" + busca + "%'";

            int tipo1 = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqldml, tipo1, concorrencia);
            ResultSet ts = pstdados.executeQuery();
            ts.last();
            String[] a = new String[4];
         
            for (int i = 0; i < 4; i++) {
                a[i] = new String();
                a[i] = ts.getString(i+2);
                if(i==0){
                    System.out.println("Username: "+a[i]);
                }else if(i==1){
                    System.out.println("Senha: "+a[i]);
                } else if(i==2){
                    System.out.println("Nome: "+a[i]);
                }else{
                    System.out.println("Tipo: "+a[i]);
                }
            }
            
            return a;

        } catch (SQLException erro) {
            System.out.println("Erro ao consultar = " + erro);
        }
        return null;

    }
}