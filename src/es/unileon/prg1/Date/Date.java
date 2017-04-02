package es.unileon.prg1.Date;


public class Date{

	private int _day;
	private int _month;
	private int _year;


	public Date(int day, int month, int year) throws TheException{
		
		if((day>=1) && (day<=31)){
			_day=day;
		}
		else{
			throw new TheException("Dia" + _day + "Fecha incorrecta");
		}
	
		if((month>=1) && (month<=12)){
			_month=month;
		else{
			throw new TheException("Mes" + _month + "Fecha incorrecta");
		}

			_year=year;

	}
	



	//*******************************************************
	public int getDay(){
		return _day;
	}

	public void setDay(int NewDay){

	}

	boolean isSameDay(Date anotherDay){	

		return this._day == anotherDay.getDay();
	}


	//*********************************************************
	public int getMonth(){
		return _month;
	}

	public void setMonth(int NewMonth){
			
	}

	boolean isSameMonth(Date anotherMonth){	

		return this._month == anotherMonth.getMonth();
	}


	//*********************************************************
	public int getYear(){
		return _year;
	}


	public void setYear(int NewYear){

	}

	boolean isSameYear(Date anotherYear){		

		return this._year == anotherYear.getYear();
	}

	//***********************************************************

	boolean isSame(Date anotherDate){
		
		return(_day == anotherDay.getDay()) && (_month == anotherMonth.getMonth()) && (_year == anotherYear.getYear());
	}

	public String toString(){
		return this._day + "/" + this._month + "/" + this._year;
		}

	//************************************************************

	public String Month(int month){
	
	String monthName;
	
		switch(month){
			case 1:
				monthName="Enero";
				break;
			case 2:
				monthName="Febrero";
				break;
			case 3:
				monthName="Marzo";
				break;
			case 4:
				monthName="Abril";
				break;
			case 5:
				monthName="Mayo";
				break;
			case 6:
				monthName="Junio";
				break;
			case 7:
				monthName="Julio";
				break;
			case 8:
				monthName="Agosto";
				break;
			case 9:
				monthName="Septiembre";
				break;
			case 10:
				monthName="Octubre";
				break;
			case 11:
				monthName="Noviembre";
				break;
			case 12:
				monthName="Diciembre";
				break;
			default:
				System.out.println("Mes inexistente");
			}

		return monthName;
	}






	
}
