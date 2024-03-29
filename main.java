package repositorios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		formatador.format( data );
		System.out.println(data);
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int day = cal.get(Calendar.DAY_OF_WEEK);

		
		DiaDeHoje DiaDeHoje = new DiaDeHoje("Dias da semana", DiaDaSemana.Domingo);
		
		switch (day) {
		case 1:
		
			DiaDeHoje.MensagemDoDia(new DiaDomingo());
		break;
		
		case 2:
		
			DiaDeHoje.MensagemDoDia(new DiaSegunda());	
		break;
		
		case 3:
		
			DiaDeHoje.MensagemDoDia(new DiaTerca());
		break;
		
		case 4:
		
			DiaDeHoje.MensagemDoDia(new DiaQuarta());
		break;
		
		case 5:
		
			DiaDeHoje.MensagemDoDia(new DiaQuinta());
		break;

		case 6:
			
			DiaDeHoje.MensagemDoDia(new DiaSexta());
		break;

		case 7:
			
			DiaDeHoje.MensagemDoDia(new DiaSabado());
		break;

		}

	}

}
 