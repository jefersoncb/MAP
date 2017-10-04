public class ParenteseEsquerdo extends DecoradorCaracter
{
	public ParenteseEsquerdo(Caracter decoradorCaracter) 
    {
		super(decoradorCaracter);
	}

	@Override
	public void imprimir() 
    {
		imprimirParenteseEsquerdo();
		decoradorCaracter.imprimir();	
	}

	private void imprimirParenteseEsquerdo() 
    {
		System.out.print("(");	
	}
}