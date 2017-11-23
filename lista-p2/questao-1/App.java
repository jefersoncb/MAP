import java.util.Calendar;
import java.util.Locale;

/**
 * Classe de teste da aplicacao
 */
public class App
{
 /**
   * Metodo principal da linguagem de programacao Java
   * 
   * @param args argumentos da linha de comando (nao utilizado)
   */
  public static void main(String[] args)
  {
    Semana semana = new Semana();

    Calendario calendario = Calendario.getInstance();

    System.out.println(semana.getDiassemana(calendario.get(Calendario.DAY_OF_WEEK)).messagem());

    System.out.println(semana.getDiassemana(calendario.getDisplayName(Calendario.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH)).messagem());
  }
}