public class ColcheteEsquerdo extends DecoradorCaracter
{
	public ColcheteEsquerdo(Caracter decoradorCaracter) 
    {
		super(decoradorCaracter);
	}

	@Override
	public void imprimir() 
    {
		imprimirColcheteEsquerdo();
		decoradorCaracter.imprimir();	
	}

	private void imprimirColcheteEsquerdo() 
    {
		System.out.print("[");
	}

}