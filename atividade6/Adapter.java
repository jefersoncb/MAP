interface Imagem
{
    void carregar();
    void desenhar();
}

interface ImagemTarget
{
    void carregarImagem();
    void desenharImagem();
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
	Imagem imagem = new ImagemBMP();
    ImagemTarget img = new ImagemAdapter(imagem);
    imagem.carregarImagem();
	img.desenharImagem();
}