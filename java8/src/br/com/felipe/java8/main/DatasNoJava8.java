package br.com.felipe.java8.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class DatasNoJava8 {

	public static void main(String[] args) {
		 LocalDate hoje = LocalDate.now();
	     System.out.println(hoje);
	     
	     LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
	     
	     int anos = olimpiadasRio.getYear() - hoje.getYear();
	     System.out.println(anos);
	     
	     
	     Period periodo = Period.between(hoje, olimpiadasRio);
	     System.out.println(periodo.getYears());
	     System.out.println(periodo.getMonths());
	     System.out.println(periodo.getDays());
	     
	     
	     
	     
	     // decrementando datas
	     System.out.println(hoje.minusYears(1));
	     System.out.println(hoje.minusMonths(4));
	     System.out.println(hoje.minusDays(2));

	     // incrementando datas
	     
	     System.out.println(hoje.plusYears(1));
	     System.out.println(hoje.plusMonths(4));
	     System.out.println(hoje.plusDays(2));
	     
	     // somando 4 anos
	     olimpiadasRio.plusYears(4);
	     System.out.println(olimpiadasRio);
	     
	     
	     // formatando datas
	     DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     
	     String valorFormatado = olimpiadasRio.format(formatador);
	     System.out.println(valorFormatado);
	     
	     
	     // trabalhando com data e hora
	     
	    	     
	     DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	     LocalDateTime now = LocalDateTime.now();
	     System.out.println(now.format(formatadorComHoras));
	     
	     // Tipos especificos
	     
	     YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
	   
	}

}
