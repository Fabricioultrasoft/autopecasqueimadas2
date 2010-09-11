package autopecas.logica;
import java.util.Date;
import java.text.SimpleDateFormat;

public class data
{
   public String mes, dia, ano, dia_semana, hora;
    SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");

    //metodo que controla a hora
    public void le_hora()
    {
        Date horaAtual = new Date();
        hora = horaFormatada.format(horaAtual);

    }

    //metodo que controla a data
    public void le_data()
    {
        Date data = new Date();
       //mes = ""+data.getMonth();//vai de 0 a 11
        dia = ""+data.getDate();
        ano = ""+(1900+data.getYear());
       // dia_semana = ""+data.getDay();// vai de 0 a 6

        switch (data.getDay())
        {
            case 0: dia_semana = "Domingo";break;
            case 1: dia_semana = "Segunda-feira";break;
            case 2: dia_semana = "Terça-feira";break;
            case 3: dia_semana = "Quarta-feira";break;
            case 4: dia_semana = "Quinta-feira";break;
            case 5: dia_semana = "Sexta-feira";break;
            case 6: dia_semana = "Sábado";break;

        }

        switch (data.getMonth())
        {
            case 0: mes = "janeiro";break;
            case 1: mes = "fevereiro";break;
            case 2: mes = "março";break;
            case 3: mes = "abril";break;
            case 4: mes = "maio";break;
            case 5: mes = "junho";break;
            case 6: mes = "julho";break;
            case 7: mes = "agosto";break;
            case 8: mes = "setembro";break;
            case 9: mes = "outubro";break;
            case 10: mes = "novembro";break;
            case 11: mes = "dezembro";break;
        }

    }
}