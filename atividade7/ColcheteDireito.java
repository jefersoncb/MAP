public class ColcheteDireito extends DecoradorCaracter
{
	public ColcheteDireito(Caracter decoradorCaracter) 
    {
		super(decoradorCaracter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir()
    {
		decoradorCaracter.imprimir();
		imprimirColcheteDireito();	
	}

	private void imprimirColcheteDireito() 
    {
		System.out.println("]");
	}
}
