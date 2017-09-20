public class Veiculo 
{
	private String modelo;
	private int numLugares;
	private int comprimento;
	private int ano;
	private String cor;
	
	public Veiculo()
    {
	}
}

public class Carro extends Veiculo
{
	private int numPortas;
	private String placa;
	
	public Carro(String placa, int numPortas)
    {
		this.placa = placa;
		this.numPortas = numPortas;
	}
}

public class Aviao extends Veiculo
{
	private int numTurbinas;
	
	public Aviao(int numTurbinas)
    {
		this.numTurbinas = numTurbinas;
	}
}

public class Lancha extends Veiculo
{
	private int numMotores;

	public Lancha (int numMotores)
    {
		this.numMotores = numMotores;
	}

}