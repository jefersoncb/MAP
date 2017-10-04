public class ChaveEsquerdo extends DecoradorCaracter
{
	public ChaveEsquerdo(Caracter decoradorCaracter) 
    {
		super(decoradorCaracter);
	}

	public void imprimir() 
    {
		imprimirChaveEsquerda();
		decoradorCaracter.imprimir();
	}

	private void imprimirChaveEsquerda() 
    {
		System.out.print("{");
	}
	

}