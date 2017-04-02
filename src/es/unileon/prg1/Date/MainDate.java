package es.unileon.prg1.Date;

public class MainDate{

public static void main (String args[]){

	Date today = new Date(28, 03, 2017);
	Date yesterday = new Date(27, 03, 2017);

	System.out.println(today.isSameYear(yesterday));
	System.out.println(today.isSameDay(yesterday));
	System.out.println(today.isSameMonth(yesterday));

}


}
