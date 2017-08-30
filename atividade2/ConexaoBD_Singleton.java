public class Conexao 
{
    private static final String usuario = "usuario";
    private static final String senha = "senha";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/meubanco";

    public static Connection abrir() throws Exception 
	{
        Class.forName(com.mysql.jdbc.Driver);
        Connection con = DriverManager.getConnection(url, usuario, senha);
        return con;
    }

}