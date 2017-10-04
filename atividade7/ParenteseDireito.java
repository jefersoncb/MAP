public class ParenteseDireito extends DecoradorCaracter
{
	public ParenteseDireito(Caracter decoradorCaracter) 
    {
		super(decoradorCaracter);
	}

	@Override
	public void imprimir() 
    {
		decoradorCaracter.imprimir();
		imprimirParenteseDireito();	
	}

	private void imprimirParenteseDireito() 
    {
		System.out.print(")");
		
	}
}