interface Imagem
{
    public void carregar();
    public void desenhar();
}

interface ImagemTarget
{
	public void carregarImagem(Imagem imagem);
	public void desenharImagem(Imagem imagem);
}
    
public class ImagemAdapter implements ImagemTarget
{
    private  Imagem imagem;

	public  ImagemAdapter(Imagem imagem)
	{	this.imagem = imagem;
		
	}
    public void carregarImagem()
    {
    }
    
    public void desenharImagem()
    {
    }

}

public class ImagemJpeg implements Imagem
{
    public void carregar()
    {
    }
    
    public void desenhar()
    {
    }   
}

public class ImagemPNG implements Imagem
{
    public void carregar()
    {
    }
    
    public void desenhar()
    {
    }
    
}

public class ImagemBMP implements Imagem
{
    public void carregar()
    {
    }
    
    public void desenhar()
    {
    }
}

public static void main(String []args)
{
    ImagemAdapter img = new ImagemAdapter();
    Imagem imgPng = new ImagemPNG();
	Imagem imgJpeg = new ImagemJpeg();
	img.desenharImagem(imgPng);
	img.desenharImagem(imgJpeg);
}