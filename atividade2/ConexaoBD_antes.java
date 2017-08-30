public class Database
{
    private static Database instancia;
    private static Connection con ;
    private static Statement stmt;

    private Database() 
	{
    }

    public static Database getInstance()
	{
		if(instancia==null)
			{
				instancia= new Database();
			}
			return instancia;
	}

    public  Connection getConnection()
	{
        if(con==null)
		{
            try 
			{
                String url = "jdbc:mysql://127.0.0.1:3306/meubanco";
                String usuario = "usuario";
                String senha = "senha";
                con = DriverManager.getConnection( url, usuario, senha );
            } catch (SQLException ex) 
			{
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }