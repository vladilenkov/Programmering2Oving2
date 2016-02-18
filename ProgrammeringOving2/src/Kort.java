
public abstract class Kort
{
	private String navn;
	private int pinKode, kortNummer = 0;
	private boolean sperretKort;
	private static int antallKort = 0;
	
	public Kort(String navn, int pinKode)
	{
		antallKort++;
		kortNummer = antallKort;
		this.navn = navn;
		this.pinKode = pinKode;
		sperretKort = false;
	}
	public int getPin()
	{
		return pinKode;
	}
	
	public String getNavn()
	{
		return navn;
	}
	public boolean isSperret()
	{
		return sperretKort;
	}
	@Override
	public String toString()
	{
		return "Navn: " + getNavn() + ", PIN kode: " + pinKode + ", kort nummer " + kortNummer + 
				", kortet er " + (isSperret() ? "sperret." : "ikke sperret");
	}
	public abstract boolean sjekkPin(int pin);
}
