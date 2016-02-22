import java.util.*;
public class Ansatt extends Kort
{
	Ansatt(String navn, int pinKode)
	{
		super(navn, pinKode);
	}
	@Override
	public boolean sjekkPin(int pin)
	{
		GregorianCalendar currDate = new GregorianCalendar();
		if(currDate.get(GregorianCalendar.HOUR_OF_DAY) > 7 && currDate.get(GregorianCalendar.HOUR_OF_DAY) < 17)
			return true;
		else if(getPin() == pin)
			return true;
		else
			return false;
	}
}
