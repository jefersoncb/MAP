public class ChaveDireita extends DecoradorCaracter
{
	public ChaveDireita(Caracter decoradorCaracter) 
    {
		super(decoradorCaracter);
	}

	public void imprimir() 
    {
		decoradorCaracter.imprimir();
		imprimirChaveDireita();
	}

	private void imprimirChaveDireita() 
    {
		System.out.print("}");
	}
	
}