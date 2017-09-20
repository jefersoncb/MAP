public class Aviao 
{
	private String prefixo;
	private int numTurbinas;
	
	public Aviao(String prefixo, int numTurbinas) 
    {
		Veiculo veiculo = new Veiculo("Aviao", 10, 10, 2017, "Cor");
		this.prefixo = prefixo;
		this.numTurbinas = numTurbinas;
	}
}

public class Carro 
{	
	private int numPortas;
	private String placa;
	
	public Carro(int numPortas, String placa) 
    {
		Veiculo veiculo = new Veiculo("Carro", 2, 4, 2017, "Cor");
		this.numPortas = numPortas;
		this.placa = placa;
	}
}

public class Veiculo 
{	
	private String modelo;
	private int numLugares;
	private int comprimento;
	private int ano;
	private String cor;
	
	public Veiculo(String modelo, int numLugares, int comprimento, int ano, String cor) 
    {
		this.modelo = modelo;
		this.numLugares = numLugares;
		this.comprimento = comprimento;
		this.ano = ano;
		this.cor = cor;
	}
}

public class Lancha 
{
	private int numMotores;

	public Lancha(int numMotores) 
    {
		Veiculo veiculo = new Veiculo("Lancha", 10, 10, 2017, "Cor");
		this.numMotores = numMotores;
	}
}