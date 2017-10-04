public abstract class DecoradorCaracter extends Caracter
{	
	protected Caracter decoradorCaracter;
	
	public DecoradorCaracter(Caracter decoradorCaracter)
    {
		this.decoradorCaracter = decoradorCaracter;
	}
}