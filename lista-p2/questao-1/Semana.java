public class Semana
{
    public DiasSemana getDiasSemana(int diassemana)
    {
        switch(diassemana)
        {
            case 1: return new Domingo();
            case 2: return new Segunda();
            case 3: return new Terca();
            case 4: return new Quarta();
            case 5: return new Quinta();
            case 6: return new Sexta();
            case 7: return new Sabado();
        }
        
        throw new IllegalArgunmentException("'" + diassemana + "' is an illegal argument for the parameter diassemanas!");
    }
    
    public DiasSemana getDiasSemana(String diassemana)
    {
        try
        {
            return (Diassemana) Class.forName(diassemana).newInstance();
        }
        catch(Exception exception)
        {
            throw new IllegalArgumentException("'" + diassemana + "' is an illegal argument for the parameter diassemanas!");
        }
    }
}