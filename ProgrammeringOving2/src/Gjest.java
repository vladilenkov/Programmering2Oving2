import java.util.*;
public class Gjest extends Kort
{
	private GregorianCalendar dateCreated, expiredDate;
	
	Gjest(String navn, int pinKode)
	{
		super(navn, pinKode);
		dateCreated = new GregorianCalendar();
		expiredDate = new GregorianCalendar();
		expiredDate.add(GregorianCalendar.DAY_OF_YEAR, 7);
		
	}
	@Override
	public boolean sjekkPin(int pin)
	{
		GregorianCalendar currDate = new GregorianCalendar();
		if(currDate.get(GregorianCalendar.DAY_OF_YEAR) < expiredDate.get(GregorianCalendar.DAY_OF_YEAR) && pin == 9999)
		return true;
		else
			return false;
	}
}
